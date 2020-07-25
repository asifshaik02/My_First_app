package com.example.random;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.SeekBar;
import android.widget.TextView;

import java.util.Random;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button rollButton;
        final TextView result;
        final SeekBar seekBar;
        rollButton = findViewById(R.id.rollButton);
        result = findViewById(R.id.result);
        seekBar = findViewById(R.id.seekBar);

        rollButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Random rand = new Random();
                int num = rand.nextInt(seekBar.getProgress())+1;
                result.setText(String.valueOf(num));
            }
        });

    }
}