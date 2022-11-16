package com.example.quiz1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText height;
    private EditText weight;
    private Button btnCalc;
    private Switch switchMale;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setupviews();
    }

    private void setupviews() {
        height=findViewById(R.id.edtTextHeight);
        weight=findViewById(R.id.edtTextHeight);
        btnCalc=findViewById(R.id.btnCalc);
        switchMale=findViewById(R.id.switchMale);
    }

    public void btSave_Calc(View view) {
        double result;
        double heightDouble= Double.parseDouble(height.getText().toString();
        double weightDouble= Double.parseDouble(weight.getText().toString();
        result=weightDouble / heightDouble*heightDouble;

        if (switchMale.isChecked()){
            result*=0.5;
        }

        Toast.makeText((Context) this, (int) result,Toast.LENGTH_SHORT).show();

    }
}