package com.example.a108590016_hw7;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void lauchDonutCircle(View view){
        Intent intent = new Intent(this, donut_circle.class);
        startActivity(intent);
    }
    public void lauchFroyoCircle(View view){
        Intent intent = new Intent(this, froyo_circle.class);
        startActivity(intent);
    }
    public void lauchIcecreamCircle(View view){
        Intent intent = new Intent(this, icecream_circle.class);
        startActivity(intent);
    }
}