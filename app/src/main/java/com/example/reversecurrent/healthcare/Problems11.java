package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems11 extends AppCompatActivity {


    Toolbar Problems11;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems11);

        //Toolbar
        Toolbar Problems11 = findViewById(R.id.Prb11);
        setSupportActionBar(Problems11);
        getSupportActionBar().setTitle("স্বরনশক্তি কমে যাওয়া ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems11.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems11.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems11.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
