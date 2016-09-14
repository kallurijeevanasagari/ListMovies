package com.example.listmovies;

import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.SimpleAdapter;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.support.v4.app.ActivityCompat.startActivity;

/**
 * Created by admin on 7/27/2016.
 */
public class CustomAdapter extends SimpleAdapter {

    LayoutInflater inflater;
    Context context;
    ArrayList<HashMap<String, String>> arrayList;

    public CustomAdapter(Context context, ArrayList<HashMap<String, String>> data, int resource, String[] from, int[] to) {
        super(context, data, resource, from, to);
        this.context = context;
        this.arrayList = data;
        inflater.from(context);
    }
    @Override
           // ImageView.setAdapter(new ImageAdapter(this));
    public View getView(final int position, View convertView, ViewGroup parent) {


        View view = super.getView(position, convertView, parent);
        ImageView imageView = (ImageView) view.findViewById(R.id.imageview1);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View view) {

                Toast.makeText(context, arrayList.get(position).get("name"), Toast.LENGTH_SHORT).show();


            }
        });

        if(position % 2==0){

            view.setBackgroundColor(Color.LTGRAY);

        }else {
            view.setBackgroundColor(Color.CYAN);

        }
        return view;
    }
}
