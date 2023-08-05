package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("MainActivity", "Hello world Debug");
        Log.i("MainActivity", "Hello world Info");
        Log.e("MainActivity", "Hello world Error");
        Log.w("MainActivity", "Hello world Warn");
    }
}