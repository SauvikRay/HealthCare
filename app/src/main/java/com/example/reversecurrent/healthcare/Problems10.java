package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems10 extends AppCompatActivity {


    Toolbar Problems10;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems10);

        //Toolbar
        Toolbar Problems10 = findViewById(R.id.Prb10);
        setSupportActionBar(Problems10);
        getSupportActionBar().setTitle("মেয়েদের মাসিকের সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems10.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems10.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems10.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
