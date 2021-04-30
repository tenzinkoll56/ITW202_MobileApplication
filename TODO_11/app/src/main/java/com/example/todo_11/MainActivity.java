package com.example.todo_11;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private TextView mtextview;
    private String[] mcolor = {"red", "pink", "purple",  "blue", "green", "yellow","orange", "brown", "grey", "black" };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mtextview = findViewById(R.id.textview1);

        if (savedInstanceState != null) {
            mtextview.setTextColor(savedInstanceState.getInt("color"));
        }
    }

    @Override
    public void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("color", mtextview.getCurrentTextColor());
    }


    public void change(View view) {
        Random random = new Random();
        String colorName = mcolor[random.nextInt(10)];
        int colorResourceName = getResources().getIdentifier(colorName, "color", getApplicationContext().getPackageName());
        int colorRes = ContextCompat.getColor(this, colorResourceName);
        mtextview.setTextColor(colorRes);
    }
}