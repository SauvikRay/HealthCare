package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems5 extends AppCompatActivity {

    Toolbar Problems5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems5);

        //Toolbar
        Toolbar Problems5 = findViewById(R.id.Prb5);
        setSupportActionBar(Problems5);
        getSupportActionBar().setTitle("ব্রনের সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems5.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems5.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
