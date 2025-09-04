package com.example.ipt_opong;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);

        Button myButton = findViewById(R.id.superButton4);
        myButton.setOnClickListener(v -> {
            Intent intent = new Intent(SecondActivity.this, FourthActivity.class);
            startActivity(intent);
        });
    }
}