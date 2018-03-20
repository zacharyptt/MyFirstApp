package com.zachary.myfirstapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class BActivity extends AppCompatActivity {

    private EditText et_A;
    private TextView tv_A;
    private Button btn_A;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_b);

        et_A = (EditText)findViewById(R.id.et_A);
        tv_A = (TextView)findViewById(R.id.tv_A);
        btn_A = (Button)findViewById(R.id.btn_A);



        btn_A.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
               tv_A.setText(et_A.getText().toString());
            }
        });



    }
}
