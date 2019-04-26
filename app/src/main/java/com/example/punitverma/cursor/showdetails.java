package com.example.punitverma.cursor;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;
import android.widget.SimpleCursorAdapter;

public class showdetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_showdetails);

        String[] from={"_id","NAME","SUR_NAME","PHONE_NUM","PASSWORD"};
        int[] to={R.id.ID_,R.id.NAME_,R.id.SURNAME_,R.id.PHN_,R.id.PASS_};
        puneetdatabase pnb=new puneetdatabase(getApplicationContext());
        SQLiteDatabase db = pnb.getReadableDatabase();
        Cursor cursor1=db.query("ANDROID_STUDIO",new String[]{"_id","NAME","SUR_NAME","PHONE_NUM","PASSWORD"},null,null,null,null,null);
        ListView lv =(ListView)findViewById(R.id.ll);
        SimpleCursorAdapter ad=new SimpleCursorAdapter(this,R.layout.customlayout,cursor1,from,to,0);
        lv.setAdapter(ad);
    }
}
