package com.myapplicationdev.android.p02_holidays;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class HolidayAdapter extends ArrayAdapter<Holiday> {
    private ArrayList<Holiday> holiday;
    private Context context;
    private TextView tvHoliday;
    private ImageView ivHoli;

    public HolidayAdapter(Context context, int resource, ArrayList<Holiday> objects){
        super(context,resource,objects);
        holiday = objects;
        this.context = context;
    }

    @Override
    public View getView(int pos, View convertView, ViewGroup parent){
        LayoutInflater inflater = (LayoutInflater) context.getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        View rowView = inflater.inflate(R.layout.row,parent,false);
        tvHoliday = rowView.findViewById(R.id.tvName);
        ivHoli = rowView.findViewById(R.id.imageView);
        Holiday currentHoli = holiday.get(pos);

        tvHoliday.setText(currentHoli.getName());

        if(currentHoli == holiday.get(0)){
            ivHoli.setImageResource(R.drawable.nationalday);
        }else if(currentHoli == holiday.get(1)){
            ivHoli.setImageResource(R.drawable.ny);
        }else{
            ivHoli.setImageResource(R.drawable.labour);
        }
        return rowView;

    }

}
