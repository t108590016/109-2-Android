package com.example.a108590016_hw6;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private CheckBox checkBox1;
    private CheckBox checkBox2;
    private CheckBox checkBox3;
    private CheckBox checkBox4;
    private CheckBox checkBox5;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        checkBox1 = (CheckBox)findViewById(R.id.chocolate_syrup);
        checkBox2 = (CheckBox)findViewById(R.id.sprinkles);
        checkBox3 = (CheckBox)findViewById(R.id.crushed_nuts);
        checkBox4 = (CheckBox)findViewById(R.id.cherries);
        checkBox5 = (CheckBox)findViewById(R.id.orio_cookie_crumbles);

    }
    public void toast(View view) {
        String text = "Toppings:";
        if(checkBox1.isChecked()) text += " "+checkBox1.getText();
        if(checkBox2.isChecked()) text += " "+checkBox2.getText();
        if(checkBox3.isChecked()) text += " "+checkBox3.getText();
        if(checkBox4.isChecked()) text += " "+checkBox4.getText();
        if(checkBox5.isChecked()) text += " "+checkBox5.getText();
        Toast.makeText(this, text, Toast.LENGTH_LONG).show();
    }
}