package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases2 extends AppCompatActivity {

    Toolbar Deseases2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases2);


        Toolbar Deseases2 = findViewById(R.id.Des2);
        setSupportActionBar(Deseases2);
        getSupportActionBar().setTitle("বদহজম");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases2.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases2.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();

    }
}
