package com.example.punitverma.cursor;

import android.content.ContentValues;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.widget.Toast;

public class puneetdatabase extends SQLiteOpenHelper {

    private static final String DB_NAME="facebook";
    private static final int DB_VERSION=1;
    puneetdatabase(Context context){
        super(context,DB_NAME,null,DB_VERSION );
    }

    @Override
    public void onCreate(SQLiteDatabase sqLiteDatabase) {

        sqLiteDatabase.execSQL("CREATE TABLE ANDROID_STUDIO ("
                +"_id INTEGER PRIMARY KEY AUTOINCREMENT,"
                +"NAME TEXT,"
                +"SUR_NAME TEXT ,"
                +"PHONE_NUM TEXT ,"
                +"PASSWORD TEXT);");
        ;
    }

    @Override
    public void onUpgrade(SQLiteDatabase sqLiteDatabase, int i, int i1) {

    }

    public void insertdata(SQLiteDatabase db,String user_name,String surname,String phonenumber,String password)
    {
        ContentValues contentValues=new ContentValues();
        contentValues.put("NAME",user_name);
        contentValues.put("SUR_NAME",surname);
        contentValues.put("PHONE_NUM",phonenumber);
        contentValues.put("PASSWORD",password);
//
        long i =  db.insert("ANDROID_STUDIO",null,contentValues);
        Log.d("insert satatus is true","success"+i);

    }
}
