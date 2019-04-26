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

public class customlistview extends ArrayAdapter<String>{
    private String [] weeks;
    private int [] resources;
    private Activity context;
    public customlistview(Activity context, String [] weeks, int resources[]) {
        super(context, R.layout.weeks,weeks);

        this.context=context;
        this.weeks=weeks;
        this.resources=resources;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {

        View r=convertView;
        ViewHolder viewHolder=null;
        if (r==null)
        {
            LayoutInflater layoutInflater=context.getLayoutInflater();
            r=layoutInflater.inflate(R.layout.weeks,null,true);
            viewHolder=new ViewHolder(r);

            r.setTag(viewHolder);

        }

        else {
            viewHolder=(ViewHolder)r.getTag();

        }

        viewHolder.im.setImageResource(resources[position]);
        viewHolder.t1.setText(weeks[position]);
        return r;
    }

    class ViewHolder{
        TextView t1;
        ImageView im;
        ViewHolder(View view)
        {
            t1=view.findViewById(R.id.tv1);
            im=view.findViewById(R.id.im1);

        }
    }

}
