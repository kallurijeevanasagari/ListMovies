package com.example.listmovies;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class FullImageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fullimage);
        Intent i=getIntent();

        int position = i.getExtras().getInt("id");
        ImageAdapter adapter=new ImageAdapter(this);
        ImageView imageView=(ImageView)findViewById(R.id.imageView);
        imageView.setImageResource(adapter.images[position]);
    }
}
