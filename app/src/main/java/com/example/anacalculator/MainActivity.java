package com.example.anacalculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView screen;
    private String str1, str2, str3, result, str, sign;
    private double a, b;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        screen = (TextView) findViewById(R.id.ans_view);
        str = "";
    }

    public void onClick(View v){
        Button button = (Button) v;
        str = button.getText().toString();
        screen.setText(str);
        a = Double.parseDouble(str);
    }

    public void onClickSigns(View v){
        Button button = (Button) v;
        sign = button.getText().toString();
        screen.setText(sign);
        str = "";
    }

    public void calculate(View v){
        Button button = (Button) v;
        str2 = screen.getText().toString();
        b = Double.parseDouble(str2);
        if (sign.equals('+')){
            result = a + b + "";
        }
        else if (sign.equals('-')){
            result = a - b + "";
        }
        else if (sign.equals('*')){
            result = a * b + "";
        }
        else if (sign.equals('/')){
            result = a / b + "";
        }
        else {
            screen.setText("AnA");
        }

        screen.setText(result);


    }
}
