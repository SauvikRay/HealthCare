package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain8 extends AppCompatActivity {

    Toolbar Pain8;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain8);

        //Toolbar
        Toolbar Pain8 = findViewById(R.id.Pain8);
        setSupportActionBar(Pain8);
        getSupportActionBar().setTitle("মাইগ্রেন");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain8.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain8.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain8.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
