package com.example.punitverma.cursor;

import android.content.ContentValues;
import android.content.Intent;
import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ListView;
import android.widget.SimpleAdapter;
import android.widget.SimpleCursorAdapter;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button signup=(Button)findViewById(R.id.signup);
        Button signin=(Button)findViewById(R.id.signin);
        Button show=(Button)findViewById(R.id.show);

        signin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                puneetdatabase pnb=new puneetdatabase(getApplicationContext());
                try (SQLiteDatabase db = pnb.getWritableDatabase()) {
                    EditText username=(EditText)findViewById(R.id.username);
                    EditText ipass=(EditText)findViewById(R.id.ipass);
                    String x= ipass.getText().toString();
                    Cursor cursor=db.query("ANDROID_STUDIO",new String[]{"_ID","NAME","SUR_NAME","PHONE_NUM","PASSWORD"},"PASSWORD=?",new String[]{x},null,null,null);

                    if(cursor.moveToFirst())
                    {
                       Intent w =new Intent(MainActivity.this,hardwork.class);
                       startActivity(w);
                    }
                    else
                    {
                        Toast.makeText(getApplicationContext(),"you login fail",Toast.LENGTH_LONG).show();
                    }

                }
                catch (SQLException e)
                {
                    Toast.makeText(getApplicationContext(),"database unavailable",Toast.LENGTH_LONG).show();
                }
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intent=new Intent(MainActivity.this,SIGNUP.class);
                startActivity(intent);
            }
        });

        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

               Intent i2=new Intent(MainActivity.this,showdetails.class);
               startActivity(i2);

            }
        });

    }



}
