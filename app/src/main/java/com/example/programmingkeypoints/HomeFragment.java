package com.example.programmingkeypoints;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.google.android.material.button.MaterialButton;

import java.util.List;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment {

    private MainActivity activity;
    private SessionManager sessionManager;

    private String mTitle;
    private int mPageNumber = 0;

    public HomeFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (MainActivity) getActivity();
        sessionManager = new SessionManager(getContext());
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_home, container, false);

        activity.getSupportActionBar().setTitle(getResources().getString(R.string.home));

        MaterialButton button = (MaterialButton) view.findViewById(R.id.read);
        final TextView title = (TextView) view.findViewById(R.id.title);
        TextView body = (TextView) view.findViewById(R.id.body);

        if (sessionManager.getTitle() != null) {

            button.setText(getResources().getString(R.string.continueReading));

            mPageNumber = sessionManager.getPage();
            mTitle = sessionManager.getTitle();

            KeyCourse keyCourse = KeyPoints.getCourse(mPageNumber, mTitle);

            if (keyCourse != null) {
                title.setText(keyCourse.getTitle());
                body.setText(keyCourse.getBody());
            }
        }
        else {
            button.setText(getResources().getString(R.string.start));
            title.setText(getResources().getString(R.string.welcome));
            body.setText(getResources().getString(R.string.welcomeText));
        }

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                activity.changeFragment(new KeyFragment(), true);
            }
        });

        return view;
    }

}
