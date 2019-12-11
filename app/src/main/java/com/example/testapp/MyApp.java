package com.example.testapp;

import android.app.Application;


public class MyApp extends Application {

    private double testString = 0;
    private double testString1 = 0;

    @Override
    public void onCreate() {
        super.onCreate();
    }

    public double getTestString() {
        return testString;
    }

    public void setTestString(double str) {
        testString = str;
    }

    public double getTestString1() {
        return testString1;
    }

    public void setTestString1(double str1) {
        testString1 = str1;
    }
}
