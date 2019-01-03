package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases15 extends AppCompatActivity {

    Toolbar Deseases15;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases15);


        Toolbar Deseases15 = findViewById(R.id.Des15);
        setSupportActionBar(Deseases15);
        getSupportActionBar().setTitle("আমাশয়");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases15.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases15.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases15.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
