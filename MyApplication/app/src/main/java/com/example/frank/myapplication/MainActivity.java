package com.example.frank.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.text.MessageFormat;

    public class MainActivity extends AppCompatActivity {



    private static final String TAG = "MainActiviy";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, MessageFormat.format("Thread[{0}]--onCreate", Thread.currentThread().getName()));
        setContentView(R.layout.activity_main);
        LinearLayout ll_container = (LinearLayout) findViewById(R.id.ll_container);
        TextView tv = new TextView(this);
        tv.setText("你好毛文强");
        tv.setTextSize(25);
        ll_container.addView(tv);
    }
}
