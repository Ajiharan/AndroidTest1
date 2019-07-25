package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {





    @Override
    protected void onStart() {
        super.onStart();
        Log.d("LifeCycle","inside onStart() method");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d("LifeCycle","inside onStop() method");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d("LifeCycle","inside onDestroy() method");
    }



    @Override
    protected void onPause() {
        super.onPause();
        Log.d("LifeCycle","inside onPause() method");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d("LifeCycle","inside onResume() method");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d("LifeCycle","inside onRestart() method");
    }

    EditText txt_num1;
    EditText txt_num2;
    Button btn_add;
    Button btn_sub;
    TextView txt_total;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d("LifeCycle","inside onCreate() method");

        txt_num1=findViewById(R.id.num2);
        txt_num2=findViewById(R.id.num3);
        btn_add=findViewById(R.id.add);
        btn_sub=findViewById(R.id.sub);
        txt_total=findViewById(R.id.tot);
        btn_add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tot;
                if(txt_num1.getText().toString().isEmpty() || txt_num2.getText().toString().isEmpty()) {
                    txt_total.setText("Please Insert Number");
                }
                else{
                    tot = Double.parseDouble(txt_num1.getText().toString()) + Double.parseDouble(txt_num2.getText().toString());
                    txt_total.setText(tot + "");
                }
            }
        });

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                double tot;
                if(txt_num1.getText().toString().isEmpty() || txt_num2.getText().toString().isEmpty()) {
                    txt_total.setText("Please Insert Number");
                }
                else {
                    tot = Double.parseDouble(txt_num1.getText().toString()) - Double.parseDouble(txt_num2.getText().toString());
                    txt_total.setText(tot + "");
                }
            }
        });
    }


    public void go_bmi_activity(View v){

        Intent intent=new Intent(MainActivity.this,CalculateBMI.class);
        startActivity(intent);
    }


    public void ViewTxt(View view) {
        Intent intent=new Intent(this,ViewTexts.class);
        startActivity(intent);


    }
}
