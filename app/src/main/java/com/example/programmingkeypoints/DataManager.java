package com.example.programmingkeypoints;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;

public class DataManager extends SQLiteOpenHelper {
    private final String TAG = DataManager.class.getSimpleName();

    public static final String DB_NAME = "programmingKeyPoints.db";
    public static final int DB_VERSION = 1;

    // Tables name
    private final String TABLE_USER = "user";

    // General column
    private final String ID = "id";
    private final String CREATED = "created";

    // User Table column
    private final String USER_NAME = "name";
    private final String USER_EMAIL = "email";
    private final String USER_PHONE = "phone";
    private final String MATRIC = "matric";
    private final String LEVEL  = "level";
    private final String PASSWORD = "password";


    public DataManager(Context context) {
        super(context, DB_NAME, null, DB_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {

        // Queries
        String userSQL = "CREATE TABLE " + TABLE_USER + "( "
                + ID + " INTEGER PRIMARY KEY AUTOINCREMENT, "
                + USER_NAME + " VARCHAR(100), "
                + USER_EMAIL + " VARCHAR(100), "
                + USER_PHONE + " VARCHAR(15), "
                + MATRIC + " VARCHAR(15), "
                + LEVEL + " VARCHAR(10), "
                + PASSWORD + " VARCHAR(50), "
                + CREATED + " TEXT)";

        db.execSQL(userSQL);
    }


    public void temp() {

        SQLiteDatabase db = this.getWritableDatabase();

        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);

        onCreate(db);
    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int i, int i1) {
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_USER);

        onCreate(db);
    }

    @Override
    public void onDowngrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        super.onDowngrade(db, oldVersion, newVersion);
    }

    public void addUser(String name, String email, String matric, String phone, String level, String password) {

        SQLiteDatabase database = this.getWritableDatabase();
        ContentValues contentValues = new ContentValues();

        contentValues.put(USER_NAME, name);
        contentValues.put(USER_EMAIL, email);
        contentValues.put(USER_PHONE, phone);
        contentValues.put(MATRIC, matric);
        contentValues.put(LEVEL, level);
        contentValues.put(PASSWORD, password);
        contentValues.put(CREATED, getTime());

        database.insert(TABLE_USER, null, contentValues);

        database.close();
    }

    public boolean login(String email, String password) {
        boolean response = false;

        SQLiteDatabase database = this.getReadableDatabase();

        String sql = "SELECT * FROM " + TABLE_USER + " WHERE " + USER_EMAIL + " = '"+ email +"' AND " + PASSWORD + " = '" + password + "'";
        Cursor cursor = database.rawQuery(sql, null, null);
        cursor.moveToFirst();

        if (cursor.getCount() > 0) {
            response = true;
        }

        cursor.close();
        database.close();

        return response;
    }

    private String getTime() {
        SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss", Locale.getDefault());
        Date date = new Date();

        return format.format(date);
    }
}
