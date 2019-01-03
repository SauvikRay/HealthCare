package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems4 extends AppCompatActivity {

    Toolbar Problems4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems4);


        //Toolbar
        Toolbar Problems4 = findViewById(R.id.Prb4);
        setSupportActionBar(Problems4);
        getSupportActionBar().setTitle("অলসতা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems4.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems4.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }

}
