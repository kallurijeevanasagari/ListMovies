package com.example.servicetask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Show extends AppCompatActivity {
    TextView textView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_show);

        textView=(TextView)findViewById(R.id.textView2);
        Intent i=getIntent();
        String s1=i.getStringExtra("fname");
        String s2=i.getStringExtra("secondname");
        String s3=i.getStringExtra("email");
        textView.setText("First Name is: "+s1+"\n Second Name is: "+s2+ " \n Email_Id is :"+s3);
    }
    public void start(View v){
        Intent i=new Intent(getApplicationContext(),MyService.class);
        startService(i);
    }
    public void stop(View v){
        Intent i=new Intent(getApplicationContext(),MyService.class);
        stopService(i);
    }


}
