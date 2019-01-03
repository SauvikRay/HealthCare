package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems7 extends AppCompatActivity {

    Toolbar Problems7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems7);

        //Toolbar
        Toolbar Problems7 = findViewById(R.id.Prb7);
        setSupportActionBar(Problems7);
        getSupportActionBar().setTitle("বিষণ্ণতা/ডিপ্রেশন");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems7.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems7.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems7.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
