package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems2 extends AppCompatActivity {

    Toolbar Problems2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems2);


        //Toolbar
        Toolbar Problems2 = findViewById(R.id.Prb2);
        setSupportActionBar(Problems2);
        getSupportActionBar().setTitle("চুল পড়া");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems2.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems2.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }

}
