package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button calories = findViewById(R.id.calories);
        Button protein = findViewById(R.id.protein);
        Button bmi = findViewById(R.id.BMI);

        calories.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent calories = new Intent(MainActivity.this , Calories_Activity.class);
                startActivity(calories);

            }
        });
        protein.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent protein = new Intent(MainActivity.this , Protein.class);
                startActivity(protein);
            }
        });
                bmi.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View view) {
                        Intent bmi = new Intent(MainActivity.this,bmi_Activity.class);
                        startActivity(bmi);
                    }
                });
    }
}