package com.example.a108590016_hw10_2;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.loader.app.LoaderManager;
import androidx.loader.content.Loader;

import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import org.json.JSONObject;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;

public class MainActivity extends AppCompatActivity {
    EditText url;
    TextView r;
    Spinner spinner;
    private String allURL = "";
    private String select = "";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        url = (EditText) findViewById(R.id.editTextTextPersonName);
        r = (TextView) findViewById(R.id.resource);
        spinner = (Spinner) findViewById(R.id.spinner);
        ArrayAdapter<CharSequence> adapter =
                ArrayAdapter.createFromResource(this,    //對應的Context
                        R.array.spinner_array,                             //資料選項內容
                        android.R.layout.simple_spinner_item);  //預設Spinner未展開時的View(預設及選取後樣式)
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner.setOnItemSelectedListener(spnOnItemSelected);
        spinner.setAdapter(adapter);
    }
    public void getSource(View view) {
        allURL = select + url.getText().toString();
        Log.d("test", allURL);
        new MyAsyncTask(r).execute(allURL);
    }

    private AdapterView.OnItemSelectedListener spnOnItemSelected
            = new AdapterView.OnItemSelectedListener() {
        public void onItemSelected(AdapterView<?> parent, View view,
                                   int pos, long id) {
            String sInfo=parent.getItemAtPosition(pos).toString();
            select = sInfo;
            Log.d("test",select);
        }

        public void onNothingSelected(AdapterView<?> parent) {
            // 沒有選取時的動作
        }
    };

}