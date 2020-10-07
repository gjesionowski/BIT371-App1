package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_2);

        TextView tv = findViewById(R.id.textView2);
        String str = getIntent().getStringExtra("msg");
        tv.setText("Hello " + str + "!");
        Log.i("INFO", "Now at " + getLocalClassName());
    }
    public void goToMainActivity(View view){
        Log.i("INFO", "Transitioning to" + MainActivity.class.getName());
        Intent intent = new Intent(getApplicationContext(), MainActivity.class);
        startActivity(intent);
    }
}