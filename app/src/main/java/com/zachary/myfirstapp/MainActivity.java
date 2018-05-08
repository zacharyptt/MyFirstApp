package com.zachary.myfirstapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttonClick(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , Page2.class);
        startActivity(intent);
    }

    public void onClick(View view) {
        Intent intent = new Intent();
        intent.setClass(MainActivity.this , CActivity.class);
        startActivity(intent);
    }
}
