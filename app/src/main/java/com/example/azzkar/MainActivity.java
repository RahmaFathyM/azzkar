package com.example.azzkar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
Button btn_mor,btn_night;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_mor=(Button)findViewById(R.id.btn_mor);
        btn_night=(Button)findViewById(R.id.btn_night);
        btn_night.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i=new Intent(MainActivity.this,night.class);
           startActivity(i); }
        });
        btn_mor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent A=new Intent(MainActivity.this,morning.class);
                startActivity(A);
            }
        });

    }
}
