package com.example.punitverma.cursor;

import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SIGNUP extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_signup);



        Button done=(Button)findViewById(R.id.done);


    done.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View view) {

            EditText username=(EditText)findViewById(R.id.u_username);
            EditText surname =(EditText)findViewById(R.id.surname);
            EditText phonenumber=(EditText)findViewById(R.id.phn);
            EditText password=(EditText)findViewById(R.id.upass);

            final String usern=username.getText().toString();
            final String surn=surname.getText().toString();
            final String phnum=phonenumber.getText().toString();
            final String pass=password.getText().toString();
            puneetdatabase pnb=new puneetdatabase(getApplicationContext());
            SQLiteDatabase db = pnb.getWritableDatabase();

            pnb.insertdata(db,usern,surn,phnum,pass);

            Intent intent=new Intent(SIGNUP.this,MainActivity.class);
            startActivity(intent);
        }
    });


    }
}
