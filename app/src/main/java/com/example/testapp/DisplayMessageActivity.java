package com.example.testapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class DisplayMessageActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_display_message);

        Intent resIntent = getIntent();
         String message = resIntent.getStringExtra(MainActivity.EXTRA_MESSAGE);
        TextView txt = (TextView) findViewById(R.id.resText);
        txt.setText(message);

    }
}