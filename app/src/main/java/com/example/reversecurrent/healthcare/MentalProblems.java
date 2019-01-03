package com.example.reversecurrent.healthcare;


import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;


public class MentalProblems extends AppCompatActivity {


   Toolbar MentalProblems;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mental_problems);

        Toolbar MentalProblems = findViewById(R.id.MentalProblems);

        setSupportActionBar(MentalProblems);
        getSupportActionBar().setTitle("মানসিক সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MentalProblems.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MentalProblems.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });



    }

    @Override
    public void onBackPressed() {
        Intent i = new Intent(MentalProblems.this,MainActivity.class);
        startActivity(i);
        finish();

        super.onBackPressed();
    }
}
