package com.example.todo_13;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.material.floatingactionbutton.FloatingActionButton;

public class MainActivity extends AppCompatActivity {

    public static final String EXTRA_MESSAGE = "com.android.todo_13.extra.MESSAGE";

    private TextView cupcake, eclair, froyo;
    private FloatingActionButton calls;
    private String mOrderMessage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cupcake = findViewById(R.id.cupcake_des);
        eclair = findViewById(R.id.eclair_des);
        froyo = findViewById(R.id.froyo_des);

        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = findViewById(R.id.chart);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, Order.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
            }
        });
    }

//    @Override
//    public boolean onOptionsItemSelected(MenuItem item) {
//        int id = item.getItemId();
//            return true;
//        }

    public void displayToast(String message) {
        Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
    }

    public void CupcakeOrder(View view) {
        mOrderMessage = getString(R.string.cupcake_order);
        displayToast(mOrderMessage);
    }

    public void EclairOrder(View view) {
        mOrderMessage = getString(R.string.eclair_order);
        displayToast(mOrderMessage);
    }

    public void FroyoOrder(View view) {
        mOrderMessage = getString(R.string.froyo_order);
        displayToast(mOrderMessage);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        switch (item.getItemId()) {
            case R.id.action_order:
                Intent intent = new Intent(MainActivity.this, Order.class);
                intent.putExtra(EXTRA_MESSAGE, mOrderMessage);
                startActivity(intent);
                return true;

            case R.id.action_contract:
                displayToast("You have selected contract");
                return true;
            case R.id.action_settings:
                displayToast("you have selected setting");
                return true;
            case R.id.shopping_chart:
                displayToast("you have selected shopping chart");
                return true;
            case R.id.info:
                displayToast("you have selected info");
                return true;
            default:
                return true;
        }

    }


}