package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Protein extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_protein);

        EditText weight = findViewById(R.id.Weight);

        Button calculate = findViewById(R.id.Calculate);

        TextView ProteinNeed = findViewById(R.id.ProteinNeed);

        calculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int w1 = Integer.parseInt(weight.getText().toString());
                int w2 = Integer.parseInt(weight.getText().toString());
                double result1 = w1 * 1.6 ;
                double result2 = w2 * 1.8;
                ProteinNeed.setText(result1+"-"+result2+"g");
            }
        });


    }
}