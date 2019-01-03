package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases1 extends AppCompatActivity {

    Toolbar Deseases1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases1);

        Toolbar Deseases1 = findViewById(R.id.Des1);
        setSupportActionBar(Deseases1);
        getSupportActionBar().setTitle("গ্যাস্ট্রিক, আলসার");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases1.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases1.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
