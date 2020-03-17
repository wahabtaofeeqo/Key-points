package com.example.programmingkeypoints;

import android.content.Context;
import android.content.SharedPreferences;

public class SessionManager {

    private SharedPreferences preferences;
    private SharedPreferences.Editor editor;

    private static final String NAME = "keyPointsOnProgramming";
    private static final String LOGIN = "isLoggedIn";
    private static final String USERNAME = "username";
    private static final String REGISTERED = "isRegistered";
    private static final String FIRST = "isFirstTime";
    private static final String name = "name";
    private static final String level = "level";
    private static final String title = "title";
    private static final String page  = "pageNo";
    private static final String language = "language";
    private static final String semester = "semester";


    private Context context;

    public SessionManager(Context con) {

        this.context = con;
        preferences = context.getSharedPreferences(NAME, Context.MODE_PRIVATE);
        editor = preferences.edit();
    }

    public void setLogin(boolean login) {

        if (editor != null) {
            editor.putBoolean(LOGIN, login);
            editor.commit();
        }
    }

    public void setName(String n) {
        editor.putString(name, n);
        editor.commit();
    }

    public void setLevel(String l) {
       if (editor != null) {
           editor.putString(level, l);
           editor.commit();
       }
    }

    public String getLevel() {
        return preferences.getString(level, null);
    }

    public void setTitle(String t) {
        editor.putString(title, t);
        editor.commit();
    }

    public String getTitle() {
        return preferences.getString(title, null);
    }

    public void setPage(int num) {
        editor.putInt(page, num);
        editor.commit();
    }

    public int getPage() {
        return preferences.getInt(page, 0);
    }

    public String getName() {
        return preferences.getString(name, "");
    }

    public void setRegistered(boolean bool) {

        if (editor != null) {
            editor.putBoolean(REGISTERED, bool);
            editor.commit();
        }
    }

    public boolean isRegistered() {
        return preferences.getBoolean(REGISTERED, false);
    }

    public boolean isLoggedIn() {
        return preferences.getBoolean(LOGIN, false);
    }

    public void setUsername(String name) {

        if (editor != null) {
            editor.putString(USERNAME, name);
            editor.commit();
        }
    }

    public String getUsername() {
        return preferences.getString(USERNAME, null);
    }

    public void unset() {
        editor.clear();
        editor.commit();
    }

    public void setIsFirstTime(boolean bool) {
        if (editor != null) {
            editor.putBoolean(FIRST, bool);
            editor.commit();
        }
    }

    public void setLanguage(String lang) {
        editor.putString(language, lang);
        editor.commit();
    }

    public String getLanguage() {
        return preferences.getString(language, null);
    }

    public void setSemester(String s) {
        editor.putString(semester, s);
        editor.commit();
    }

    public String getSemester() {
        return preferences.getString(semester, null);
    }

    public boolean isFirstTime() {
        return preferences.getBoolean(FIRST, true);
    }
}