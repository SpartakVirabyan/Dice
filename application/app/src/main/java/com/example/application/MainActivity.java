package com.example.application;


import android.graphics.Color;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import java.util.Random;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView leftNumber = findViewById(R.id.leftNumber);
        TextView rightNumber = findViewById(R.id.rightNumber);
        Button button = findViewById(R.id.startButton);
        Random random = new Random();
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                int randomLeft = (int)(Math.random()*5)+1;
                int randomRight = (int)(Math.random()*5)+1;
                Random randomGenerator = new Random();
                int red = randomGenerator.nextInt(256);
                int green = randomGenerator.nextInt(256);
                int blue = randomGenerator.nextInt(256);
                Color randomColor = new Color();
                leftNumber.setText(String.valueOf(randomLeft));
                rightNumber.setText(String.valueOf(randomRight));
                leftNumber.setTextColor(Color.argb(255,red,green,blue));
                rightNumber.setTextColor(Color.argb(255,red,green,blue));
            }
        });
    }
}

