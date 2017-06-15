package com.example.vineeth.tripexpenses;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;


public class MyDbHandler extends SQLiteOpenHelper{
    Context mContext;

    // Database Version
    private static final int DATABASE_VERSION = 1;
    //Database Name
    private static  final String DATABASE_NAME = "Trip.db";
    // Database Tables
    private static  final String TABLE_TRIPS = "Trips";
    private static  final String TABLE_MEMBERS = "Members";
    private static  final String TABLE_EXPENSES = "Expenses";
    // id column for all tables
    private static  final String KEY_ITEM_ID = "id";
    // Table Trips
    private static  final String KEY_TRIP_NAME = "Trip Name";
    private static  final String KEY_TRIP_NOTES = "Notes";
    private static  final String KEY_TRIP_DATE = "Date";
    private static  final String KEY_PLACES_TO_VISIT= "Places to Visit";
    private static  final String KEY_TOTAL_AMOUNT = "Total Amount";
    // Table Members
    private static  final String KEY_MEMBER_NAME = "Name";
    private static  final String KEY_MEMBER_MOBILE = "Mobile";
    private static  final String KEY_MEMBER_EMAIL = "Email";
    private static  final String KEY_MEMBER_ADMIN= "Admin";
    // Table Expenses
    private static  final String KEY_ITEM_NAME = "Name";
    private static  final String KEY_ITEM_AMOUNT = "Amount";
    private static  final String KEY_ITEM_EXP_BY = "Exp by";
    private static  final String KEY_ITEM_SHARED_BY = "Shared By";
    private static  final String KEY_ITEM_CAT= "Category";
    private static  final String KEY_ITEM_DATE = "Date";


    public MyDbHandler(Context context) {
        super(context, DATABASE_NAME, null, DATABASE_VERSION);
    }

    @Override
    public void onCreate(SQLiteDatabase db) {
        String CREATE_TABLE_TRIPS = "";
        Log.d("Creating Table Trips",CREATE_TABLE_TRIPS);
        db.execSQL(CREATE_TABLE_TRIPS);

        String CREATE_TABLE_MEMBERS = "";
        Log.d("Creating Table Members",CREATE_TABLE_MEMBERS);
        db.execSQL(CREATE_TABLE_TRIPS);

        String CREATE_TABLE_EXPENSES = "";
        Log.d("Creating Table Expenses",CREATE_TABLE_EXPENSES);
        db.execSQL(CREATE_TABLE_TRIPS);

    }

    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // Drop Older Tables if Existed
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_TRIPS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_MEMBERS);
        db.execSQL("DROP TABLE IF EXISTS " + TABLE_EXPENSES);

        // Create tables again
        onCreate(db);

    }

}
