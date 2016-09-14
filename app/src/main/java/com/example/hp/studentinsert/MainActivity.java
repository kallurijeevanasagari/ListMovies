package com.example.hp.studentinsert;

import android.app.DownloadManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.AuthFailureError;
import com.android.volley.Request;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.JsonObjectRequest;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import java.util.HashMap;
import java.util.Map;

public class MainActivity extends AppCompatActivity {
    EditText firstname,secondname,age;
    Button submit,show;
    TextView textView;
     RequestQueue requestQueue;
    String insertUrl="http://192.168.56.1/test/insertStudent.php";
    String showUrl="http://192.168.56.1/test/showStudent.php";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        firstname=(EditText)findViewById(R.id.edit1);
        secondname=(EditText)findViewById(R.id.edit2);
        age=(EditText)findViewById(R.id.edit3);
        submit=(Button) findViewById(R.id.submit_Insert);
        show=(Button)findViewById(R.id.btn_show);
        textView=(TextView)findViewById(R.id.textView5);
       requestQueue = Volley.newRequestQueue(getApplicationContext());


        show.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                JsonObjectRequest jsonObjectRequest = new JsonObjectRequest(Request.Method.POST, showUrl, new Response.Listener<JSONObject>() {
                    @Override
                    public void onResponse(JSONObject response) {
                        try {
                            JSONArray students=response.getJSONArray("students");
                            for(int i=0;i<students.length();i++){
                                JSONObject student=students.getJSONObject(i);
                                String firsrname=student.getString("firstname");
                                String secondname=student.getString("secondname");
                                String age=student.getString("age");

                                textView.append(firsrname+" "+secondname+" "+age+"\n");
                            }
                            textView.append("===\n");
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }

                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                });
                requestQueue.add(jsonObjectRequest);
            }
        });


        submit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(getApplicationContext(),firstname.getText() + "\n"+secondname.getText()+"\n"+age.getText(),Toast.LENGTH_SHORT).show();
                StringRequest request= new StringRequest(Request.Method.POST,insertUrl, new Response.Listener<String>() {
                    @Override
                    public void onResponse(String response) {


                    }
                }, new Response.ErrorListener() {
                    @Override
                    public void onErrorResponse(VolleyError error) {

                    }
                }) {
                    protected Map<String,String> getParams() throws AuthFailureError{

                        Map<String,String> parameters= new HashMap<String, String>();
                        parameters.put("firstname",firstname.getText().toString());
                        parameters.put("secondname",secondname.getText().toString());
                        parameters.put("age",age.getText().toString());
                        return parameters;
                    }

                };
                requestQueue.add(request);
            }
        });

    }
}
