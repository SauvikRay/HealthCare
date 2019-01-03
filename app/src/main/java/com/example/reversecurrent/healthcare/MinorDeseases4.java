package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MinorDeseases4 extends AppCompatActivity {

    Toolbar MinorDeseases4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_deseases4);

        Toolbar MinorDeseases4 = findViewById(R.id.MinorDeseases4);
        setSupportActionBar(MinorDeseases4);
        getSupportActionBar().setTitle("চোখের নিচে কালি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorDeseases4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MinorDeseases4.this,Minor_Diseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MinorDeseases4.this,Minor_Diseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
