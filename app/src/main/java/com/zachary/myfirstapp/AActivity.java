package com.zachary.myfirstapp;

import android.app.Notification;
import android.app.NotificationManager;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

public class AActivity extends AppCompatActivity {
     private Notification.Builder builder;
     private NotificationManager manager;
     public Spinner sp;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_a);

        sp = (Spinner) findViewById(R.id.spinner);
        sp.setOnItemSelectedListener(spn);



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
        builder.setWhen(System.currentTimeMillis()+50000000);



        Button btn_C = findViewById(R.id.btn_C);
        btn_C.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                manager.notify(1001,builder.build());

            }
        });



    }
    private AdapterView.OnItemSelectedListener spn = new AdapterView.OnItemSelectedListener() {
        @Override
        public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
            Toast toast =Toast.makeText(adapterView.getContext(),adapterView.getItemAtPosition(i).toString(),Toast.LENGTH_SHORT);
            toast.show();
        }

        @Override
        public void onNothingSelected(AdapterView<?> adapterView) {

        }
    };
}