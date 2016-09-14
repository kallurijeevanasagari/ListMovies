package com.example.servicetask;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Login extends Activity {
    EditText fname;
    EditText secondname;
    EditText email;
   // Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        fname=(EditText)findViewById(R.id.editText3);
        secondname=(EditText)findViewById(R.id.editText4);
        email=(EditText)findViewById(R.id.editText5);
        //button=(Button) findViewById(R.id.button2);

    }
    public void submi(View v){


        Intent i=new Intent(Login.this,Show.class);
        i.putExtra("fname",fname.getText().toString());
        i.putExtra("sname",secondname.getText().toString());
        i.putExtra("email",email.getText().toString());
        startActivity(i);
    }

}
