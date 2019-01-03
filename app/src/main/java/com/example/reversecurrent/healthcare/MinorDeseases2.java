package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class MinorDeseases2 extends AppCompatActivity {

    Toolbar MinorDeseases2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor_deseases2);

        Toolbar MinorDeseases2 = findViewById(R.id.MinorDeseases2);
        setSupportActionBar(MinorDeseases2);
        getSupportActionBar().setTitle("পিত্তথলির পাথর");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorDeseases2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MinorDeseases2.this,Minor_Diseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(MinorDeseases2.this,Minor_Diseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
