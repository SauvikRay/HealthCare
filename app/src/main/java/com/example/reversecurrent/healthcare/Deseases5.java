package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases5 extends AppCompatActivity {


    Toolbar Deseases5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases5);

        Toolbar Deseases5 = findViewById(R.id.Des5);
        setSupportActionBar(Deseases5);
        getSupportActionBar().setTitle("চর্মরোগ:এলার্জি,ফোড়া,পক্স,চুলকানি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases5.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases5.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
