package com.bmi;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity_Bimal extends AppCompatActivity implements View.OnClickListener {

    private EditText etWeight, etHeight;
    private Button btnCalculate;
    private TextView tvBMIResult;
    private double bmi;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etHeight = findViewById(R.id.etHeight);
        etWeight = findViewById(R.id.etWeight);
        btnCalculate = findViewById(R.id.btnCalculate);
        tvBMIResult = findViewById(R.id.tvBMIResult);

        btnCalculate.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId()==R.id.btnCalculate)
        {
            bmi = new BodyMassIndex_Bimal(Double.parseDouble(etWeight.getText().toString()), Double.parseDouble(etHeight.getText().toString())).BMI();
            tvBMIResult.setText(String.format("%.2f", bmi));
            if (bmi<18.5)
            {
                Toast.makeText(MainActivity_Bimal.this, "You are underweight", Toast.LENGTH_LONG).show();
            }
            else if (bmi >= 18.5 && bmi <= 24.9)
            {
                Toast.makeText(MainActivity_Bimal.this, "Your BMI is normal", Toast.LENGTH_LONG).show();
            }
            else if (bmi >= 25 && bmi <= 29.9)
            {
                Toast.makeText(MainActivity_Bimal.this, "You are overweight", Toast.LENGTH_LONG).show();
            }
            else
            {
                Toast.makeText(MainActivity_Bimal.this, "Obesity level", Toast.LENGTH_LONG).show();
            }
        }
    }
}
