package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MinorDeseases3 extends AppCompatActivity {

    Toolbar MinorDeseases3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_deseases3);

        Toolbar MinorDeseases3 = findViewById(R.id.MinorDeseases3);
        setSupportActionBar(MinorDeseases3);
        getSupportActionBar().setTitle("ঘামাচি");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorDeseases3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MinorDeseases3.this,Minor_Diseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MinorDeseases3.this,Minor_Diseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
