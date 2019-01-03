package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems8 extends AppCompatActivity {

    Toolbar Problems8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems8);

        //Toolbar
        Toolbar Problems8 = findViewById(R.id.Prb8);
        setSupportActionBar(Problems8);
        getSupportActionBar().setTitle("মেয়েদের ঋতুস্রাবের সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems8.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems8.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems8.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
