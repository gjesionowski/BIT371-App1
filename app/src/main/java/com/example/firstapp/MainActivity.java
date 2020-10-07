package com.example.firstapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goToActivityTwo(View view) {
        Log.i("INFO", "Transitioning to " + Activity2.class.getName());
        Intent intent = new Intent(getApplicationContext(), Activity2.class);
        EditText input = findViewById(R.id.firstName);
        intent.putExtra("msg", input.getText().toString());
        startActivity(intent);
    }
}
