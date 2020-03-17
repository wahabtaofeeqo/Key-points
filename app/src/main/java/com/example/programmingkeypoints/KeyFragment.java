package com.example.programmingkeypoints;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.widget.AppCompatImageButton;
import androidx.fragment.app.Fragment;

import android.speech.tts.TextToSpeech;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;


/**
 * A simple {@link Fragment} subclass.
 */
public class KeyFragment extends Fragment implements TextToSpeech.OnInitListener {

    private String mTitle = "";
    private MainActivity activity;

    private TextToSpeech textToSpeech;

    private TextView body;
    private TextView title;
    private TextView subhead;
    private AppCompatImageButton previous;
    private AppCompatImageButton play;
    private AppCompatImageButton next;

    private SessionManager sessionManager;

    KeyCourse keyCourse;

    private int index = 0;
    private int lastIndex = 0;

    List<KeyCourse> keyPoints;

    public KeyFragment() {
        // Required empty public constructor
    }

    public static KeyFragment newInstance(String title) {
        KeyFragment keyFragment = new KeyFragment();

        Bundle bundle = new Bundle();
        bundle.getString("title", title);

        keyFragment.setArguments(bundle);

        return keyFragment;
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        Bundle bundle = getArguments();

        if (bundle != null) {
            mTitle = bundle.getString("title");
        }

        textToSpeech = new TextToSpeech(getContext(), this);
        activity = (MainActivity) getActivity();
        sessionManager = new SessionManager(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment

        View view = inflater.inflate(R.layout.fragment_key, container, false);
        activity.getSupportActionBar().setTitle("Key Points");

        body = (TextView) view.findViewById(R.id.body);
        title = (TextView) view.findViewById(R.id.title);
        subhead = (TextView) view.findViewById(R.id.head);

        previous = (AppCompatImageButton) view.findViewById(R.id.previous);
        play = (AppCompatImageButton) view.findViewById(R.id.play);
        next = (AppCompatImageButton) view.findViewById(R.id.next);

        String level = sessionManager.getLevel();
        String semester = sessionManager.getSemester();

        if (level != null) {
            switch (level) {
                case "ND 1":
                    if (semester != null) {
                        if (semester.equalsIgnoreCase("first")) {
                            keyPoints = KeyPoints.getKeyPoints("QBasic");
                        }
                        else {
                            keyPoints = KeyPoints.getKeyPoints("Fortran");
                        }
                    }
                    else {
                        keyPoints = KeyPoints.getKeyPoints("QBasic");
                    }
                break;

                case "ND 2":
                    if (semester != null) {
                        if (semester.equalsIgnoreCase("first")) {
                            keyPoints = KeyPoints.getKeyPoints("Visual Basic");
                        }
                        else {
                            keyPoints = KeyPoints.getKeyPoints("Java");
                        }
                    }
                    else {
                        keyPoints = KeyPoints.getKeyPoints("Visual Basic");
                    }
                 break;

                case "HND 1":
                    if (semester != null) {
                        if (semester.equalsIgnoreCase("first")) {
                            keyPoints = KeyPoints.getKeyPoints("Cpp");
                        }
                        else {
                            keyPoints = KeyPoints.getKeyPoints("Android");
                        }
                    }
                    else {
                        keyPoints = KeyPoints.getKeyPoints("Cpp");
                    }
                    break;


                case "HND 2":
                    if (semester != null) {
                        if (semester.equalsIgnoreCase("first")) {
                            keyPoints = KeyPoints.getKeyPoints("Pascal");
                        }
                        else {
                            keyPoints = KeyPoints.getKeyPoints("Python");
                        }
                    }
                    else {
                        keyPoints = KeyPoints.getKeyPoints("Pascal");
                    }
                    break;
            }
        }
        else {
            keyPoints = KeyPoints.getKeyPoints("QBasic");
        }

        lastIndex = keyPoints.size();

        if (lastIndex > 0) {

            lastIndex = lastIndex - 1;

            keyCourse = keyPoints.get(index);

            title.setText(keyCourse.getTitle());
            subhead.setText(keyCourse.getSubHead());
            body.setText(keyCourse.getBody());

            next.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index < lastIndex) {
                        index++;

                        if (!previous.isEnabled())
                            previous.setEnabled(true);

                        keyCourse = keyPoints.get(index);
                        body.setText(keyCourse.getBody());
                        subhead.setText(keyCourse.getSubHead());
                    }
                    else {
                        next.setEnabled(false);
                    }
                }
            });

            previous.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (index != 0) {
                        index--;

                        if (!next.isEnabled())
                            next.setEnabled(true);

                        keyCourse = keyPoints.get(index);
                        body.setText(keyCourse.getBody());
                    }
                    else {
                        previous.setEnabled(false);
                    }
                }
            });
        }
        else {
            Utils.showMessage(getContext(), "All clear");
        }

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                speakUp(body.getText().toString());
            }
        });

        return view;
    }

    @Override
    public void onInit(int status) {
        if (status == TextToSpeech.SUCCESS) {
            int result = textToSpeech.setLanguage(Locale.US);

            if (result == TextToSpeech.LANG_MISSING_DATA || result == TextToSpeech.LANG_NOT_SUPPORTED) {
                Utils.showMessage(getContext(), "Language Not Supported");

                play.setEnabled(false);
            }
            else {
                play.setEnabled(true);
            }
        }
    }

    private void speakUp(String text) {
        if (textToSpeech != null) {
            if (text != null) {
                textToSpeech.speak(text, TextToSpeech.QUEUE_FLUSH, null);
            }
        }
    }

    @Override
    public void onPause() {
        super.onPause();

        if (textToSpeech != null) {
            textToSpeech.stop();
        }
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

        if (textToSpeech != null) {
            textToSpeech.stop();
            textToSpeech.shutdown();
        }
    }
}
