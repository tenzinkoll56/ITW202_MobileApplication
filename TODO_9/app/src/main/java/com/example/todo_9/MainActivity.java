package com.example.todo_9;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView mtext;
    private EditText mopertor1, mopertor2;
    private Calculator mcal;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        mcal = new Calculator();
        mtext = findViewById(R.id.textView);
        mopertor1 = findViewById(R.id.opt1);
        mopertor2 = findViewById(R.id.opt2);

    }

    public void add(View view) {
        String optone = mopertor1.getText().toString();
        String opttwo = mopertor2.getText().toString();

        double value = mcal.add(Double.valueOf(optone),Double.valueOf(opttwo));
        mtext.setText(String.valueOf(value));

    }

    public void sub(View view) {
        String optone = mopertor1.getText().toString();
        String opttwo = mopertor2.getText().toString();

        double value = mcal.sub(Double.valueOf(optone),Double.valueOf(opttwo));
        mtext.setText(String.valueOf(value));

    }

    public void div(View view) {
        String optone = mopertor1.getText().toString();
        String opttwo = mopertor2.getText().toString();

        double value = mcal.div(Double.valueOf(optone),Double.valueOf(opttwo));
        mtext.setText(String.valueOf(value));
    }


    public void mul(View view) {
        String optone = mopertor1.getText().toString();
        String opttwo = mopertor2.getText().toString();

        double value = mcal.mul(Double.valueOf(optone),Double.valueOf(opttwo));
        mtext.setText(String.valueOf(value));
    }
}