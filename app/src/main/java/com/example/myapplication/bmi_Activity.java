package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import java.text.DecimalFormat;
import java.util.Scanner;

public class bmi_Activity extends AppCompatActivity {
     @Override
     protected void onCreate(Bundle savedInstanceState) {
          super.onCreate(savedInstanceState);
          setContentView(R.layout.activity_bmi);
          myButtonListenerMethod();
     }

     public void myButtonListenerMethod() {
          Button button = findViewById(R.id.btn);
          button.setOnClickListener(new View.OnClickListener() {
               @Override
               public void onClick(View v) {
                    final EditText heightText = findViewById(R.id.height);
                    String heightStr = heightText.getText().toString();
                    double height = Double.parseDouble(heightStr);
                    double heightM = height/100;
                    final EditText weightText = findViewById(R.id.weight);
                    String weightStr = weightText.getText().toString();
                    double weight = Double.parseDouble(weightStr);
                    double BMI = (weight) / (heightM * heightM);
                    DecimalFormat df = new DecimalFormat("#.#");
                    double BMI_trimmed = Double.parseDouble(df.format(BMI));
                    final TextView BMIResult = findViewById(R.id.result);
                    BMIResult.setText(Double.toString(BMI_trimmed));
                    String BMI_Cat;
                    if (BMI < 15){
                         BMI_Cat = "Very severely underweight";
                    }
                    else if (BMI >= 15 && BMI < 16){
                         BMI_Cat = "You are Severely underweight";
                    }
                    else if (BMI >=16 && BMI < 18.5){
                         BMI_Cat = "You are Underweight";
                    }
                    else if (BMI >=18.5 && BMI < 25){
                         BMI_Cat = "You are Normal";
                    }
                    else if (BMI >= 25 && BMI < 30){
                         BMI_Cat = "You are Overweight";
                    }
                    else if (BMI>=30 && BMI < 35 ){
                         BMI_Cat = "You are Moderately Obese";
                    }
                    else if (BMI>= 35 && BMI < 40){
                         BMI_Cat = "You are Severely Obese";
                    }
                    else {
                         BMI_Cat = "You are Very Severely Obese";

                    }
                    final TextView BMICategory = findViewById(R.id.bmiCat);
                    BMICategory.setText(BMI_Cat);
               }
          });
     }
   }