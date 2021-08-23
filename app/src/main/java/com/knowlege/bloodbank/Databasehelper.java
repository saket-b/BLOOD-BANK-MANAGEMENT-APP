package com.knowlege.bloodbank;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

import androidx.annotation.Nullable;

public class Databasehelper extends SQLiteOpenHelper {
    public static final String DATABASE_NAME="blood.db";
    public  static final String TABLE_NAME="student_table";
    public static final String COL_1="ID";
    public static final String COL_2="Email";

    public static final String COL_3="password";
    public static final String COL_4="confpassword";
    public static final String COL_5="Full_name";
    public static final String COL_6="Blood_group";
    public static final String COL_7="Do you Donate in last 6 month";
    public static final String COL_8="Mobno";
    public static final String COL_9="address";


    public Databasehelper(Context context) {
        super(context,DATABASE_NAME,null,1);

    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {
    sqLiteDatabase.execSQL("create table "+ TABLE_NAME+ "  ( ID INTEGER  PRIMARY KEY AUTOINCREMENT,Email TEXT,Password TEXT ,ConfP" +
            "assword TEXT, Full_name TEXT,Bloodgroup TEXT, Doyoudonateinlast_6_month TEXT , Mobno TEXT,Address TEXT);");


    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {
   sqLiteDatabase.execSQL("DROP TABLE IF EXISTS "+TABLE_NAME);
   onCreate(sqLiteDatabase);

    }
    public boolean insertdata(String email,String password,String confpass,String fullname,String bloodgroup,String flag,String mobno,String address)
    {
        SQLiteDatabase db=this.getWritableDatabase();
        ContentValues contentValues=new ContentValues();
        contentValues.put(COL_2,email);

        contentValues.put(COL_3,password);
        contentValues.put(COL_4,confpass);
        contentValues.put(COL_5,fullname);
        contentValues.put(COL_6,bloodgroup);
        contentValues.put(COL_7,flag);
        contentValues.put(COL_8,mobno);
        contentValues.put(COL_9,address);

        return true;
    }

}
