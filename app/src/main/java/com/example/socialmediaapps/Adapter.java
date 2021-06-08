package com.example.socialmediaapps;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adapter extends BaseAdapter {
    private  TextView title1,subtitle1;

    Context context;
    int [] image;
    String [] text;
    String []  subtext;
    LayoutInflater inflater;

    public Adapter(Context context, int[] image, String[] text, String[] subtext) {
        this.context = context;
        this.image = image;
        this.text = text;
        this.subtext = subtext;

        inflater=LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return text.length;
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        view=inflater.inflate(R.layout.designlayout, null);
        ImageView img= view.findViewById(R.id.ivimage);
         title1= view.findViewById(R.id.tvtitle);
         subtitle1=view.findViewById(R.id.tvsubtitle);
        img.setImageResource(image[i]);
        title1.setText(text[i]);
        subtitle1.setText(subtext[i]);
        //subtitle1.setText(subtext[i]);





        return view;
    }
}
