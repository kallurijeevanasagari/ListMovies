package com.example.autocompltetextview;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ListView;
import android.widget.AdapterView;
import android.widget.Toast;

import com.example.autocompltetextview.CustomAdapter;
import com.example.autocompltetextview.R;

import java.util.ArrayList;
import java.util.HashMap;


public class MainActivity extends AppCompatActivity {
    ListView simpleListView;
    String[] fruitsNames = {"Apple", "Banana", "Litchi", "Mango", "PineApple"};//fruit names array
    int[] fruitsImages = {R.drawable.apple, R.drawable.banana, R.drawable.litchi, R.drawable.mango, R.drawable.pineapple};//fruits images array


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        simpleListView=(ListView)findViewById(R.id.list_view);
        ArrayList<HashMap<String,String>>arrayList=new ArrayList<>();
        for(int i=0;i<fruitsNames.length;i++)
        {
            HashMap<String,String>hashMap=new HashMap<>();
            hashMap.put("name",fruitsNames[i]);
            hashMap.put("image",fruitsImages[i]+"");
            arrayList.add(hashMap);
        }
        String[]from={"name","image"};
        int []to={R.id.textview1,R.id.imageview1};
        CustomAdapter simpleAdapter=new CustomAdapter(this,arrayList,R.layout.listview_xml,from,to);
        simpleListView.setAdapter(simpleAdapter);
        simpleListView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(fruitsNames[i]);
                    alertDialog.setMessage("Apple fruit was the king of all fruits originated in the past 4000 years ago. ");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked OK button.
                            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();
                    //Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();
                }
                else if(i==1)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(fruitsNames[i]);
                    alertDialog.setMessage("Banana is the most popular fresh fruit in all over the world and its name comes from the Arabic word 'banan', which means finger.");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked OK button.
                            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();
                    //Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();
                }
                else if(i==2)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(fruitsNames[i]);
                    alertDialog.setMessage("Delicious, sweet, juicy lychee (litchi) is one of the popular summer fruits that contains an impressive list of essential nutrients like oligonol, vitamins, minerals.");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked OK button.
                            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();
                    //Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();
                }

                else if(i==3)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(fruitsNames[i]);
                    alertDialog.setMessage("Mango fruit (Mangifera indica) is one of the most popular, nutritionally rich tropical fruits with unique flavor, fragrance, taste, and heath promoting qualities");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked OK button.
                            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();
                    //Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();
                }
                else if(i==4)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    alertDialog.setTitle(fruitsNames[i]);
                    alertDialog.setMessage("The pineapple (Ananas comosus) is a tropical plant with edible multiple fruit consisting of coalesced berries, also called pineapples.");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User clicked OK button.
                            Toast.makeText(getApplicationContext(), "Pressed OK", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.show();
                    //Toast.makeText(getApplicationContext(),fruitsNames[i],Toast.LENGTH_LONG).show();
                }
                else{

                }







            }
        });

    }

}
