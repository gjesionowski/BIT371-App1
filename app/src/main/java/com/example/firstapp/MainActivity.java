package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sayMessage(View view) {
        Log.i("INFO","Hello World!");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Hello World!");
    }

    public void sayName(View view) {
        Log.i("INFO","Hello Greg!");
        TextView tv = findViewById(R.id.textView);
        tv.setText("Greg");
    }
}