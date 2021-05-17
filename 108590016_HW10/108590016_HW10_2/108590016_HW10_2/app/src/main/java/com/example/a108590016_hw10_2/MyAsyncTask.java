package com.example.a108590016_hw10_2;

import android.os.AsyncTask;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.lang.ref.WeakReference;
import java.net.HttpURLConnection;
import java.net.URL;

public class MyAsyncTask extends AsyncTask<String, Void, String> {
    public String html;
    private TextView mTextView;

    MyAsyncTask(TextView tv) {
        mTextView = tv;
        //mProgressBar = new WeakReference<>(pb);
    }

    @Override
    protected String doInBackground(String... params) {
        try {
            URL url = new URL(params[0]);
            HttpURLConnection response = (HttpURLConnection) url.openConnection();
            InputStream in = response.getInputStream();
            BufferedReader reader = new BufferedReader(new InputStreamReader(in));
            StringBuilder str = new StringBuilder();
            String line = null;
            while ((line = reader.readLine()) != null) {
                str.append(line);
            }
            in.close();
            html = str.toString();
        } catch (IOException ex) {
            ex.printStackTrace();
        }
        return html;
    }
    protected void onPostExecute(String result) {
        mTextView.setText(result);
    }
}

