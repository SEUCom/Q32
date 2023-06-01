package com.example.q3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private EditText etName;
    private EditText etPhone;
    Button send_button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        etName = findViewById(R.id.nameEditText);
        etPhone = findViewById(R.id.phoneEditText);
        send_button = (Button) findViewById(R.id.okButton);
        send_button.setOnClickListener(this::onOkClick);

    }

    public void onOkClick(View view) {
        String name = etName.getText().toString();
        String phone = etPhone.getText().toString();
        Intent intent = new Intent(this, MainActivity2.class);
        intent.putExtra("name", name);
        intent.putExtra("phone", phone);
        startActivity(intent);
    }
}