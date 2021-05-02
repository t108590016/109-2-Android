package com.example.a108590016_hw8_1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView battery;
    int level=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        battery = findViewById(R.id.imageView2);
        battery.setImageLevel(0);
    }
    public void plus(View view){
        if(level<6){
            level += 1;
        }
        battery.setImageLevel(level);
    }
    public void minus(View view){
        if(level>0){
            level -= 1;
        }
        battery.setImageLevel(level);
    }
}