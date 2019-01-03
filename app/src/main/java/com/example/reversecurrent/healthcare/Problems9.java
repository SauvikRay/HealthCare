package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems9 extends AppCompatActivity {

    Toolbar Problems9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems9);

        //Toolbar
        Toolbar Problems9 = findViewById(R.id.Prb9);
        setSupportActionBar(Problems9);
        getSupportActionBar().setTitle("দ্রুত বীর্যপাত");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems9.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems9.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems9.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
