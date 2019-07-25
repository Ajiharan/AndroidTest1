package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class ViewTexts extends AppCompatActivity {

    EditText txt_edit;
    Button btn_view;
    TextView txt_view;
    Button tg;
    TextView tg_v;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_texts);
        btn_view=findViewById(R.id.btn_click);
        txt_edit=findViewById(R.id.txt_input);
        txt_view=findViewById(R.id.txt_view);
        tg=findViewById(R.id.btn_toggle);
        tg_v=findViewById(R.id.view_toggle);
    }

    public void viewText(View view) {
        if(view.getId()==R.id.btn_click){
            String value=txt_edit.getText().toString();
            value.trim();
            if(value.length() > 0) {
                txt_view.setText("Your Name is " + value);
                txt_edit.setText("");
            }
            else{
                Toast.makeText(this,"Field  is Empty",Toast.LENGTH_SHORT).show();
                txt_view.setText("");
            }
        }
    }

    public void viewToggle(View view) {
        if(view.getId()==R.id.btn_toggle){
            String value=tg.getText().toString();
            tg_v.setText("Button Status : " + value);
        }
    }
}
