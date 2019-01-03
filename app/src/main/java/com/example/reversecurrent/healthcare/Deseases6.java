package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases6 extends AppCompatActivity {

    Toolbar Deseases6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases6);


        Toolbar Deseases6 = findViewById(R.id.Des6);
        setSupportActionBar(Deseases6);
        getSupportActionBar().setTitle("ডাইবেটিস");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases6.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases6.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases6.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
