package com.example.socialmediaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

public class MainActivity extends AppCompatActivity {
    public static String [] r;
    ListView listView;


   static int[] image = {R.drawable.facebook, R.drawable.instagram, R.drawable.skype, R.drawable.snap,
            R.drawable.whatsapp, R.drawable.youtube};
    static String[] text = {"Facebook", " Instagram", " Skype" , " snap", " Whatsapp", " You Tube"};
     String[] subtext = {"Facebook", " Instagram", " Skype", " snap", " Whatsapp", " You Tube"};
    //static  String[] details = {"This is string details for face book",
           // "This is For instagram",
           // "This is for skype","This is for linkdin", "This is for snap", "This is for twiter",
           // "This is for youtube"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listView=(ListView)findViewById(R.id.listview);

        Adapter adapter=new Adapter(this, image,text,subtext);
        listView.setAdapter(adapter);
         r=getResources().getStringArray(R.array.details);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Intent intent= new Intent(MainActivity.this,SecondActivity.class);
                intent.putExtra("position",i);
                startActivity(intent);
            }
        });



    }
}
