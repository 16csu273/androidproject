package com.example.punitverma.cursor;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class hardwork extends AppCompatActivity {

    ListView listView;
    String [] weeks={"MONDAY","TUESDAY","WEDNESDAY","THURSDAY","FRIDAY","SATURDAY"};
    int [] resources;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hardwork);

        resources = new int[]{R.drawable.m, R.drawable.t, R.drawable.w, R.drawable.th, R.drawable.f, R.drawable.s};
        listView=(ListView)findViewById(R.id.lv1);
        customlistview customlistview=new customlistview(this,weeks,resources);
        listView.setAdapter(customlistview);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent i1 = new Intent(hardwork.this, MON.class);
                i1.putExtra("day",i);
                startActivity(i1);
            }
        });


    }
}
