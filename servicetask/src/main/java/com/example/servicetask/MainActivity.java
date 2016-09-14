package com.example.servicetask;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
//        EditText t1=(EditText)findViewById(R.id.editText);
//        EditText t2=(EditText)findViewById(R.id.editText2);
        //Button b1=(Button)findViewById(R.id.button);
    }

    public void submit(View v){
        EditText t1=(EditText)findViewById(R.id.editText);
        EditText t2=(EditText)findViewById(R.id.editText2);
        String s1=t1.getText().toString();
        String s2=t2.getText().toString();


        if(s1.equals("jeevana")) {

            if (s2.equals("jeeva")) {

                Intent i = new Intent(getApplicationContext(), Login.class);
                startActivity(i);
                Toast.makeText(getApplicationContext(), s1 + " Correct Login", Toast.LENGTH_SHORT).show();

            } else {
                Toast.makeText(getApplicationContext(), s2 + " Correct password", Toast.LENGTH_SHORT).show();
            }
        }
            else {
                Toast.makeText(getApplicationContext(), s1 + " Incorrect Login", Toast.LENGTH_SHORT).show();
            }

    }
}
