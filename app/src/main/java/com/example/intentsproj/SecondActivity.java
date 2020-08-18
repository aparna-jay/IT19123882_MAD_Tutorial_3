package com.example.intentsproj;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity {
    EditText ETn1 , ETn2;
    String number1, number2;
    TextView answer;

    int n1, n2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        ETn1 = findViewById(R.id.Number1);
        ETn2 = findViewById(R.id.Number2);
        answer = findViewById(R.id.answer);

        Intent intent = getIntent();

        number1 = intent.getStringExtra("n1");
        number2 = intent.getStringExtra("n2");

        ETn1.setText(number1);
        ETn2.setText(number2);

        n1= Integer.parseInt(number1);
        n2= Integer.parseInt(number2);

    }

    public void add(View view){
        answer.setText(number1 + " + " + number2 + " = " + (n1 + n2));
    }

    public void substract(View view){
        answer.setText(number1 + " - " + number2 + " = " + (n1 - n2));
    }

    public void multiply(View view){
        answer.setText(number1 + " x " + number2 + " = " + (n1 * n2));
    }

    public void divide(View view){
        answer.setText(number1 + " / " + number2 + " = " + (n1 / n2));
    }
}