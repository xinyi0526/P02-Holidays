package com.myapplicationdev.android.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

public class Main2Activity extends AppCompatActivity {

    TextView tv2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tv2 = findViewById(R.id.textView2);
        Intent intent = getIntent();
        String[] types = intent.getStringArrayExtra("types");
        for(String item:types){
            tv2.setText(item);
        }




    }
}
