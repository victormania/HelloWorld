package com.example.victor.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent intent = getIntent();
        String message1 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE1);
        String message2 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE2);
        String message3 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE3);
        String message4 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE4);
        String message5 = intent.getStringExtra(MainActivity.EXTRA_MESSAGE5);
        TextView textView1 = (TextView)findViewById(R.id.textView1);
        TextView textView2 = (TextView)findViewById(R.id.textView2);
        TextView textView3 = (TextView)findViewById(R.id.textView3);
        TextView textView4 = (TextView)findViewById(R.id.textView4);
        TextView textView5 = (TextView)findViewById(R.id.textView5);
        textView1.setText(message1);
        textView2.setText(message2);
        textView3.setText(message3);
        textView4.setText(message4);
        textView5.setText(message5);

    }

}

