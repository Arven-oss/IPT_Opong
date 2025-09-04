package com.example.ipt_opong;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class ThirdActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        Button navigateTosuperButton3= findViewById(R.id.superButton3);

        if (navigateTosuperButton3 != null) {
            navigateTosuperButton3.setOnClickListener(v -> {
                Intent intent = new Intent(ThirdActivity.this, SecondActivity.class);
                startActivity(intent);
            });
        }
    }
}
