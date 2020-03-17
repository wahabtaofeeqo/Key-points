package com.example.programmingkeypoints;


import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.google.android.material.button.MaterialButton;


/**
 * A simple {@link Fragment} subclass.
 */
public class SettingFragment extends Fragment {


    private RadioGroup radioGroup;
    private RadioButton radioButton;
    private RadioButton radioButton1;
    private RadioButton radioButton2;

    private View view;

    private String lastLevel;
    private String lastLang;
    private String lastSemester;

    private String lang;
    private String level;
    private String semester;

    private AppCompatActivity activity;

    private SessionManager sessionManager;

    public SettingFragment() {
        // Required empty public constructor
    }

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        activity = (AppCompatActivity) getActivity();
        sessionManager = new SessionManager(getContext());
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        view = inflater.inflate(R.layout.fragment_setting, container, false);

        activity.getSupportActionBar().setTitle(getResources().getString(R.string.settings));
        lastLevel = sessionManager.getLevel();
        lastLang = sessionManager.getLanguage();
        lastSemester = sessionManager.getSemester();

        MaterialButton button = (MaterialButton) view.findViewById(R.id.save);
        radioGroup = (RadioGroup) view.findViewById(R.id.group);
        RadioGroup groupLang = (RadioGroup) view.findViewById(R.id.group1);
        final RadioGroup semesterGroup = (RadioGroup) view.findViewById(R.id.group2);

        groupLang.clearCheck();
        semesterGroup.clearCheck();
        radioGroup.clearCheck();

        if (lastLevel != null) {
            setChecked(lastLevel);
        }

        if (lastLang != null) {
            setCheckedLang(lastLang);
        }

        if (lastSemester != null) {
            setCheckedSemester(lastSemester);
        }

        radioGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton = (RadioButton) view.findViewById(i);
                level = radioButton.getText().toString();
            }
        });


        groupLang.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton1 = (RadioButton) view.findViewById(i);
                lang = radioButton1.getText().toString();
            }
        });

        semesterGroup.setOnCheckedChangeListener(new RadioGroup.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(RadioGroup radioGroup, int i) {
                radioButton2 = (RadioButton) view.findViewById(i);
                semester = radioButton2.getText().toString();
            }
        });

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               if (lang != null || level != null || semester != null) {

                   if (lang != null)
                       sessionManager.setLanguage(lang);

                   if (level != null)
                       sessionManager.setLevel(level);

                   if (semester != null)
                       sessionManager.setSemester(semester);

                   Utils.showMessage(getContext(), "Your changes have been saved Successfully");
               }
            }
        });

        return view;
    }

    private void setChecked(String level) {
        switch (level) {
            case "ND 1":
                radioButton = (RadioButton) view.findViewById(R.id.nd1);
                radioButton.setChecked(true);
                break;

            case "ND 2":
                radioButton = (RadioButton) view.findViewById(R.id.nd2);
                radioButton.setChecked(true);
                break;

            case "HND 1":
                radioButton = (RadioButton) view.findViewById(R.id.hnd1);
                radioButton.setChecked(true);
                break;

            case "HND 2":
                radioButton = (RadioButton) view.findViewById(R.id.hnd2);
                radioButton.setChecked(true);
                break;
        }
    }


    private void setCheckedLang(String level) {
        switch (level) {
            case "US English":
                radioButton1 = (RadioButton) view.findViewById(R.id.us);
                radioButton1.setChecked(true);
                break;

            case "Canada English":
                radioButton1 = (RadioButton) view.findViewById(R.id.canada);
                radioButton1.setChecked(true);
                break;

            case "French":
                radioButton1 = (RadioButton) view.findViewById(R.id.french);
                radioButton1.setChecked(true);
                break;

            case "Chinese":
                radioButton1 = (RadioButton) view.findViewById(R.id.chinese);
                radioButton1.setChecked(true);
                break;

            case "Germany":
                radioButton1 = (RadioButton) view.findViewById(R.id.germany);
                radioButton1.setChecked(true);
                break;
        }
    }

    private void setCheckedSemester(String s) {

        if (s.equalsIgnoreCase("first")) {
            radioButton2 = (RadioButton) view.findViewById(R.id.first);
            radioButton2.setChecked(true);
        }
        else {
            radioButton2 = (RadioButton) view.findViewById(R.id.second);
            radioButton2.setChecked(true);
        }
    }

}
