package com.example.victor.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE1 = "com.example.myfirstapp.MESSAGE1";
    public final static String EXTRA_MESSAGE2 = "com.example.myfirstapp.MESSAGE2";
    public final static String EXTRA_MESSAGE3 = "com.example.myfirstapp.MESSAGE3";
    public final static String EXTRA_MESSAGE4 = "com.example.myfirstapp.MESSAGE4";
    public final static String EXTRA_MESSAGE5 = "com.example.myfirstapp.MESSAGE5";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /** Called when the user clicks the Send button */
    public void sendMessage(View view) {
        Intent intent = new Intent(this, DisplayMessageActivity.class);
        EditText editText1 = (EditText) findViewById(R.id.edit_message1);
        EditText editText2 = (EditText) findViewById(R.id.edit_message2);
        EditText editText3 = (EditText) findViewById(R.id.edit_message3);
        EditText editText4 = (EditText) findViewById(R.id.edit_message4);
        EditText editText5 = (EditText) findViewById(R.id.edit_message5);
        String message1 = editText1.getText().toString();
        intent.putExtra(EXTRA_MESSAGE1, message1);
        String message2 = editText2.getText().toString();
        intent.putExtra(EXTRA_MESSAGE2, message2);
        String message3 = editText3.getText().toString();
        intent.putExtra(EXTRA_MESSAGE3, message3);
        String message4 = editText4.getText().toString();
        intent.putExtra(EXTRA_MESSAGE4, message4);
        String message5 = editText5.getText().toString();
        intent.putExtra(EXTRA_MESSAGE5, message5);
        startActivity(intent);
    }
}