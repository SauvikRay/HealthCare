package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MinorDeseases1 extends AppCompatActivity {

    Toolbar MinorDeseases1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_deseases1);

        Toolbar MinorDeseases1 = findViewById(R.id.MinorDeseases1);
        setSupportActionBar(MinorDeseases1);
        getSupportActionBar().setTitle("টনসিল");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorDeseases1.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MinorDeseases1.this,Minor_Diseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MinorDeseases1.this,Minor_Diseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
