package com.myapplicationdev.android.p02_holidays;

public class Holiday {
    private String name;
    private String date;
    public Holiday(String name, String date){
        this.name = name;
        this.date = date;
    }
    public String getName(){
        return name;
    }
    public String getDate(){
        return date;
    }
}
