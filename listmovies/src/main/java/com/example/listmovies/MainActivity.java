package com.example.listmovies;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.Html;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.HashMap;

import static android.support.v4.app.ActivityCompat.startActivity;

public class MainActivity extends AppCompatActivity {
   // String[] Movie={ "TwentyFour","Baahubali","Srimanthudu","Nenu Sailaja","sultan"};

    int[] MovieImages = {R.drawable.tf, R.drawable.baahubali, R.drawable.srimanthudu, R.drawable.nenu, R.drawable.sultan};


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ListView listView = (ListView) findViewById(R.id.list_view);
       final String[] Movie = getResources().getStringArray(R.array.Movies);
        //Row layout defined by Android: android.R.layout.simple_list_item_1
       // listView.setAdapter(new ArrayAdapter<String>(this,
                //android.R.layout.simple_list_item_1, Movie));
        //listView.setOnItemClickListener((AdapterView.OnItemClickListener) this);
        ArrayList<HashMap<String,String>> arrayList=new ArrayList<>();
        for(int i=0;i<MovieImages.length;i++)
        {
            HashMap<String,String>hashMap=new HashMap<>();
            hashMap.put("name",Movie[i]);
            hashMap.put("image",MovieImages[i]+"");
            arrayList.add(hashMap);
        }
        String[]from={"name","image"};
        int []to={R.id.textview1,R.id.imageview1};

        CustomAdapter adapter=new CustomAdapter(this,arrayList,R.layout.list,from,to);
        listView.setAdapter(adapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override

            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                if(i==0)
                {
                   // String HALLOWEEN_ORANGE = "#FF7F27";
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    //alertDialog.setTitle(Movie[i]);
                    alertDialog.setTitle(Html.fromHtml("<font color='#EC407A'>"+Movie[i]+"</font>"));
                    alertDialog.setIcon(R.drawable.tf);

                    //alertDialog.setTitleColor(HALLOWEEN_ORANGE);

                    alertDialog.setMessage("Release date: May 6, 2016 \n Director: Vikram Kumar \n Hero:Surya ");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Pressed OK Button", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(MainActivity.this,two.class);
                            startActivity(intent);
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel Button", Toast.LENGTH_SHORT).show();

                        }
                    });

                    alertDialog.show();

                }
                else if(i==1)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    //alertDialog.setTitle(Movie[i]);
                    alertDialog.setIcon(R.drawable.baahubali);
                    alertDialog.setTitle(Html.fromHtml("<font color='#EC407A'>"+Movie[i]+"</font>"));
                    alertDialog.setMessage("Release date: July 10, 2015 (India)\n" +
                                            "Director: S. S. Rajamouli\n" +
                                           "Music director: M. M. Keeravani\n"+
                                            "Hero: Prabash");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Pressed OK Button", Toast.LENGTH_SHORT).show();
                            Intent intent=new Intent(MainActivity.this,bahu.class);
                            startActivity(intent);
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel Button", Toast.LENGTH_SHORT).show();

                        }
                    });
                    alertDialog.show();

                }
                else if(i==2)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    //alertDialog.setTitle(Movie[i]);
                    alertDialog.setIcon(R.drawable.srimanthudu);
                    alertDialog.setTitle(Html.fromHtml("<font color='#EC407A'>"+Movie[i]+"</font>"));
                    alertDialog.setMessage("Release date: August 7, 2015 (India)\n" +
                            "Director: Koratala Siva\n" +
                            "Music director: Devi Sri Prasad\n" +
                            "hero: mahash babu");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Pressed OK Button", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel Button", Toast.LENGTH_SHORT).show();

                        }
                    });
                    alertDialog.show();

                }

                else if(i==3)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    //alertDialog.setTitle(Movie[i]);
                    alertDialog.setIcon(R.drawable.nenu);
                    alertDialog.setTitle(Html.fromHtml("<font color='#EC407A'>"+Movie[i]+"</font>"));
                    alertDialog.setMessage("Music director: Devi Sri Prasad\n" +
                            "Dir:Kishore Tirumala\n" +
                            "Rel:January 1, 2016\n" +
                            "Hero:Ram");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Pressed OK Button", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel Button", Toast.LENGTH_SHORT).show();

                        }
                    });
                    alertDialog.show();

                }
                else if(i==4)
                {
                    AlertDialog.Builder alertDialog = new AlertDialog.Builder(MainActivity.this);
                    //alertDialog.setTitle(Movie[i]);
                    alertDialog.setTitle(Html.fromHtml("<font color='#EC407A'>"+Movie[i]+"</font>"));
                    alertDialog.setIcon(R.drawable.sultan);
                    alertDialog.setMessage("Initial release: July 5, 2016 (Kuwait)\n" +
                            "Director: Ali Abbas Zafar\n" +
                            "Hero:Salman Khan");
                    alertDialog.setPositiveButton("OK", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            Toast.makeText(getApplicationContext(), "Pressed OK Button", Toast.LENGTH_SHORT).show();
                        }
                    });
                    alertDialog.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
                        public void onClick(DialogInterface dialog, int which) {
                            // User cancelled the dialog.
                            Toast.makeText(getApplicationContext(), "Pressed Cancel Button", Toast.LENGTH_SHORT).show();

                        }
                    });
                    alertDialog.show();

                }








            }
        });

    }

}



