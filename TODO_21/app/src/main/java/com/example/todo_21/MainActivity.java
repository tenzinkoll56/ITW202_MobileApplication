package com.example.todo_21;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private TextView mTextview;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mTextview = findViewById(R.id.textview1);
        mTextview.setText(R.string.napping);

        new SimpleAsyncTask(mTextview).execute();
    }

}