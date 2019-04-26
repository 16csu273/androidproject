package com.example.punitverma.cursor;

import android.app.Activity;
import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class monlistview extends ArrayAdapter<String > {  private String [] monsub;
    private int [] monimg;
    private String[] montime;
    private Activity context;
    public monlistview(Activity context,String [] monsub,int [] monimg,String[] montime) {
        super(context,R.layout.customdays,monsub);

        this.context=context;
        this.monimg=monimg;
        this.montime=montime;
        this.monsub=monsub;


    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {


        View r=convertView;
        ViewHolder1 viewHolder1 =null;
        if (r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.customdays,null,true);
            viewHolder1 =new ViewHolder1(r);

            r.setTag(viewHolder1);

        }

        else {
            viewHolder1 =(ViewHolder1)r.getTag();

        }

        viewHolder1.monim.setImageResource(monimg[position]);
        viewHolder1.mont1.setText(monsub[position]);
        viewHolder1.mont2.setText(montime[position]);
        return r;
    }

    class ViewHolder1 {
        TextView mont1;
        TextView mont2;
        ImageView monim;

        ViewHolder1(View view)
        {
            mont1=view.findViewById(R.id.tv2);
            mont2=view.findViewById(R.id.tv3);
            monim=view.findViewById(R.id.im2);

        }
    }
}
