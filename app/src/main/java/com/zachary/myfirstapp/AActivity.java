package com.zachary.myfirstapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class AActivity extends AppCompatActivity {
     private Notification.Builder builder;
     private NotificationManager manager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);


        Button btn_B = findViewById(R.id.btn_B);
        btn_B.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });

        builder = new Notification.Builder(this);
        manager = (NotificationManager)getSystemService(NOTIFICATION_SERVICE);
        builder.setTicker("吃藥提醒");
        builder.setSmallIcon(R.drawable.ic_launcher_foreground);
        builder.setContentTitle("嗑藥時間到囉");
        builder.setContentText("該吃藥囉");
        builder.setDefaults(Notification.DEFAULT_SOUND);



        Button btn_C = findViewById(R.id.btn_C);
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.notify(1001,builder.build());
            }
        });



    }
}