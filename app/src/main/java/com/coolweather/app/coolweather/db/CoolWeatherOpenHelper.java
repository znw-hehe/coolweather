package com.coolweather.app.coolweather.db;

/**
 * Created by cc on 2017/1/1.
 */

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class CoolWeatherOpenHelper extends SQLiteOpenHelper {
    /**
     * Province建表语句
     * */
    public static final String CREATE_PROVINCE = "create table province("
            +"id integer primary ke autoincrement,"
            +"province_name text,"
            +"province_code text)";
    /*
     * City建表语句
     * **/
    public static final String CREATE_CITY="create table city("
            +"id integer primary ke autoincrement,"
            +"city_name text,"
            +"city_code text,"
            +"province_id integer)";
    /*
     * county建表语句
     * **/
    public static final String CREATE_COUNTY="create talbe county("
            +"id integer primary ke autoincrement,"
            +"county_name text,"
            +"county_code text,"
            +"city_id integer)";
    public CoolWeatherOpenHelper(Context context,String name,CursorFactory
            factory,int version){
        super(context,name,factory,version);
    }
    public void onCreate(SQLiteDatabase db){
        db.execSQL(CREATE_PROVINCE);//创建Province表
        db.execSQL(CREATE_CITY);//创建city表
        db.execSQL(CREATE_COUNTY);//创建county表

    }
    @Override
    public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
        // TODO Auto-generated method stub

    }
}
