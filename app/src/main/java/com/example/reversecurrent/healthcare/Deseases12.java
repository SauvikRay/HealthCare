package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases12 extends AppCompatActivity {

    Toolbar Deseases12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases12);

        Toolbar Deseases12 = findViewById(R.id.Des12);
        setSupportActionBar(Deseases12);
        getSupportActionBar().setTitle("শ্বাসকষ্ট");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases12.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases12.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases12.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
