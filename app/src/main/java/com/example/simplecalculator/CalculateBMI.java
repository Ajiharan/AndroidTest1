package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class CalculateBMI extends AppCompatActivity {

    Button btn_bmi;
    EditText txt_height;
    EditText txt_weight;
    TextView txt_result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculate_bmi);
        txt_weight=findViewById(R.id.weight);
        txt_height=findViewById(R.id.height);
        btn_bmi=findViewById(R.id.btn_calc);
        txt_result=findViewById(R.id.result);
    }
    public void calculateBMI(View v){
        double weight=Double.parseDouble(txt_weight.getText().toString());
        double height=Double.parseDouble(txt_height.getText().toString());
        String lbl="";
        if(txt_height.getText().toString().isEmpty() || txt_weight.getText().toString().isEmpty()){
            Toast.makeText(this,"some fields are empty",Toast.LENGTH_SHORT);
        }
        else{
            double res=(weight /(height * height))*10000;
            if(res <=18.5){
                lbl=getString(R.string.under);
            }
            else if(res >18.55 && res <= 29.99){
                lbl=getString(R.string.normal);
            }
            else if(res >=25 && res <= 24.99){
                lbl=getString(R.string.over);
            }
            else{
                lbl=getString(R.string.obesity);
            }
            txt_result.setText(lbl+"\n"+res);
        }
    }
}
