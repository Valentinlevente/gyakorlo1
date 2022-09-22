package com.example.gyakorlo1;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.widget.TextView;

import com.example.gyakorlo1.R;

import java.util.Locale;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private EditText input;
    private Button upper,lower,color;
    private TextView text;

    public int getRandomSzin(){
        Random rnd = new Random();
        return Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button upper = findViewById(R.id.upper);
        Button lower = findViewById(R.id.lower);
        Button color = findViewById(R.id.color);
        EditText input = findViewById(R.id.input);
        TextView text = findViewById(R.id.text);

        upper.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(input.getText().toString().toUpperCase());
            }
        });
        lower.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setText(input.getText().toString().toLowerCase());
            }
        });
        color.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                text.setBackgroundColor(getRandomSzin());
            }
        });
    }
}