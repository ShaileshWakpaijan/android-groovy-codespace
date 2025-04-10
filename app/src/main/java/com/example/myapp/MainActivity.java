package com.example.myapp;

import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button button = findViewById(R.id.myButton);
        button.setOnClickListener(v -> 
            Toast.makeText(this, "Button clicked!", Toast.LENGTH_SHORT).show()
        );
    }
}
