package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MinorDeseases5 extends AppCompatActivity {

    Toolbar MinorDeseases5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_deseases5);

        Toolbar MinorDeseases5 = findViewById(R.id.MinorDeseases5);
        setSupportActionBar(MinorDeseases5);
        getSupportActionBar().setTitle("টাইফয়েড ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorDeseases5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MinorDeseases5.this,Minor_Diseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MinorDeseases5.this,Minor_Diseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
