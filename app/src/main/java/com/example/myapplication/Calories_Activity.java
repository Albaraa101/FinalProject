package com.example.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calories_Activity extends Activity implements OnClickListener {

    EditText ageInput;
    EditText heightInput;
    EditText weightInput;

    Button cutButton;
    Button maintButton;
    Button bulkButton;

    TextView displayValue;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calories);

        // Find elements from the layout and Define them
        ageInput = (EditText) findViewById(R.id.ageInput);
        heightInput = (EditText) findViewById(R.id.heightInput);
        weightInput = (EditText) findViewById(R.id.weightInput);

        cutButton = (Button) findViewById(R.id.cutButton);
        maintButton = (Button) findViewById(R.id.maintButton);
        bulkButton = (Button) findViewById(R.id.bulkButton);

        displayValue = (TextView) findViewById(R.id.displayValue);

        //Set button listeners
        cutButton.setOnClickListener(this);
        maintButton.setOnClickListener(this);
        bulkButton.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        // TODO Auto-generated method stub
        int ageNum = 0;
        int weightNum = 0;
        int heightNum = 0;
        int result = 0;
        int calculate = 0;
        int percentAdd = 0;

        // Test to see if fields are empty
        if (TextUtils.isEmpty(ageInput.getText().toString())
                || TextUtils.isEmpty(heightInput.getText().toString())
                || TextUtils.isEmpty(weightInput.getText().toString())) {
            return;
        }

        // This is to read the Edit Text fields from the layout and fill the Variables with Numbers
        ageNum = Integer.parseInt(ageInput.getText().toString());
        weightNum = Integer.parseInt(weightInput.getText().toString());
        heightNum = Integer.parseInt(heightInput.getText().toString());

        //Defines which button has been clicked and will calculate accordingly
        switch (v.getId()) {
            case R.id.cutButton:
                calculate = (int) (66 + (6.23 * weightNum) + (12.7 * heightNum) - (6.8 * ageNum) - 600);
                result = calculate;
                break;
            case R.id.maintButton:
                calculate = (int) (66 + (6.23 * weightNum) + (12.7 * heightNum) - (6.8 * ageNum));
                result = calculate;
                break;
            case R.id.bulkButton:
                calculate = (int) (66 + (6.23 * weightNum) + (12.7 * heightNum) - (6.8 * ageNum) + 500);
                result = calculate;
                break;
            default:
                break;
        }
        displayValue.setText(String.valueOf(result));
    }
}