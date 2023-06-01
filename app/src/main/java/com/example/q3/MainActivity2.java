package com.example.q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;


public class MainActivity2 extends AppCompatActivity {
    private TextView tvWelcome;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        tvWelcome = findViewById(R.id.welcomingLabelTextView);
        String name = getIntent().getStringExtra("name");
        tvWelcome.setText("Welcome " + name);
    }
}