package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems12 extends AppCompatActivity {

    Toolbar Problems12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems12);

        //Toolbar
        Toolbar Problems12 = findViewById(R.id.Prb12);
        setSupportActionBar(Problems12);
        getSupportActionBar().setTitle("স্বাস্থ্যহীনতা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems12.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems12.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems12.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
