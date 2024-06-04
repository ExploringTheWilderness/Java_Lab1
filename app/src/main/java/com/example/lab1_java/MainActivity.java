package com.example.lab1_java;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    private int count = 0;
    private TextView countTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        TextView greetingTextView = findViewById(R.id.textViewHello);
        TextView nameTextView = findViewById(R.id.textViewName);
        countTextView = findViewById(R.id.textViewCounter);
        Button addButton = findViewById(R.id.buttonIncrement);
        Button subtractButton = findViewById(R.id.buttonDecrement);

        updateCountTextView();

        addButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                incrementCount();
            }
        });

        subtractButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                decrementCount();
            }
        });
    }

    private void updateCountTextView() {
        countTextView.setText(String.valueOf(count));
    }

    private void incrementCount() {
        count++;
        updateCountTextView();
    }

    private void decrementCount() {
        if (count > 0) {
            count--;
            updateCountTextView();
        }
    }
}