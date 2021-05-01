package com.example.todo_12;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {
    private TextView cupcake,eclair,froyo;
    private FloatingActionButton calls;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cupcake=findViewById(R.id.cupcake_des);
        eclair=findViewById(R.id.eclair_des);
        froyo=findViewById(R.id.froyo_des);
        calls=findViewById(R.id.phone);
    }

    public void CupcakeOrder(View view) {
        Toast toast = Toast.makeText(this,R.string.cupcake_order, Toast.LENGTH_LONG);
        toast.show();
    }

    public void EclairOrder(View view) {
        Toast toast = Toast.makeText(this,R.string.eclair_order,Toast.LENGTH_LONG);
        toast.show();
    }

    public void FroyoOrder(View view) {
        Toast toast = Toast.makeText(this,R.string.froyo_order,Toast.LENGTH_LONG);
        toast.show();
    }

    public void Call(View view) {
        Intent intent = new Intent(Intent.ACTION_DIAL);
        startActivity(intent);
    }
}