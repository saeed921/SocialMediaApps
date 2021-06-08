package com.example.socialmediaapps;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    private TextView tvTopic, tvDetails;
    TextView textView;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
         tvTopic = findViewById(R.id.tvTopic);
         tvDetails = findViewById(R.id.tvDetails);
        Intent intent = getIntent();



        if (intent != null) {
            int position = intent.getIntExtra("position", -56551);
            if (position != -1) {
                tvTopic.setText(MainActivity.text[position]);
                tvDetails.setText(MainActivity.r[position]);
            }


        }
    }}
