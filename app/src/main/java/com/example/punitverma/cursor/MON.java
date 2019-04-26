package com.example.punitverma.cursor;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ListView;

public class MON extends AppCompatActivity {

    ListView listView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mon);

        String[] monsub={"ADA","OPERATING SYSTEM","BREAK","ANDROID","COMPUTER NETWORK"};
        int[] monimg={R.drawable.ada,R.drawable.os,R.drawable.free,R.drawable.android,R.drawable.cn};
        String[] montime={"ROOM NO 301  8:30-10:20","ROOM NO 139  10:30-12:20","12:20-1:30","ROOM NO 221  1:30-2:20","ROOM NO 127  2:30-3:20"};

        String[] tuesub={"VALUE ADDED","ANDROID LAB ","BREAK","INTERNET OF THINGS"};
        int[] tueimg={R.drawable.va,R.drawable.android,R.drawable.free,R.drawable.iot};
        String[] tuetime={"ROOM NO 140  8:30-10:20","ROOM NO 140  10:30-12:20","12:20-2:30","ROOM NO 221  2:30-4:20"};


        String[] wedsub={"ANDROID","ADA","SPANISH","BREAK","SPANISH","OPERTAING SYSTEM"};
        int[] wedimg={R.drawable.android,R.drawable.ada,R.drawable.spanish,R.drawable.free,R.drawable.spanish,R.drawable.os};
        String[] wedtime={"ROOM NO 217  8:30-9:20","ROOM NO 117  10:30-10:20","ROOM NO 221 :20-11:30","11:30-12:20","ROOM NO 221:30-1:20","ROOM NO 220 1:30-2:20"};

        String[] thusub={"ADA","OPERATING SYSTEM","ADA","SPANISH","BREAK","COMPUTER NETWORK","INTERNET OF THINGS"};
        int [] thuimg={R.drawable.ada,R.drawable.os,R.drawable.ada,R.drawable.spanish,R.drawable.free,R.drawable.cn,R.drawable.iot};
        String[] thutime={"ROOM NO 220  8:30-9:20","ROOM NO 227  9:30-10:20","ROOM NO 127 10:20-11:30","ROOM NO 221 11:30-12:20","12:30-1:20","ROOM NO 129 1:30-2:20","ROOM NO 224 2:30-4:20"};

        String[] frisub={"OPERATING SYSTEM","ANDROID","COMPUTER NETWORK","ADA","FREE"};
        int friimg[]={R.drawable.os,R.drawable.android,R.drawable.cn,R.drawable.ada,R.drawable.free};
        String[] fritime={"ROOM NO 219  8:30-9:20","ROOM NO 227  9:30-10:20","ROOM NO 227 10:20-11:30","11:30-12:20","ROOM NO 104 12:30-1:20","1:20-2:30"};

        int day = getIntent().getExtras().getInt("day");

        String[] sub={"x"};
        int[] img={0};
        String[] time={"x"};


        if(day==0) {
            sub=monsub;
            img=monimg;
            time=montime;

        }

        else if(day==1)
        {            sub=tuesub;
            img=tueimg;
            time=tuetime;
        }

        else if(day==2)
        {            sub=wedsub;
            img=wedimg;
            time=wedtime;
        }
        else if(day==3)
        {            sub=thusub;
            img=thuimg;
            time=thutime;
        }
        else if(day==4)
        {            sub=frisub;
            img=friimg;
            time=fritime;
        }

        listView=(ListView)findViewById(R.id.monlv);
        monlistview monlistview = new monlistview(this,sub,img,time);
        listView.setAdapter(monlistview);

    }
}
