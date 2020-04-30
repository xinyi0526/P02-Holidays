package com.myapplicationdev.android.p02_holidays;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ListView lv;
    ArrayAdapter aa;
    String[] types;
    ArrayList<Holiday> holiday;
    ArrayAdapter aa2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        lv = findViewById(R.id.lvTypes);

        types = new String[1];
        types[0] = "Secular";

        holiday = new ArrayList<Holiday>();
        holiday.add(new Holiday("National Day","9/8/2020"));
        holiday.add(new Holiday("New Year Day","1/1/2020"));
        holiday.add(new Holiday("Labour Day","1/5/2020"));

        aa2 = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,holiday);
        lv.setAdapter(aa2);


        aa = new ArrayAdapter(MainActivity.this,android.R.layout.simple_list_item_1,types);
        lv.setAdapter(aa);
        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(getBaseContext(),Main2Activity.class);
                intent.putExtra("types",types);
                startActivity(intent);
            }
        });
    }
}
