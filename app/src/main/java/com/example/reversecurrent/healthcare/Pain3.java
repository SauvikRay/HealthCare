package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain3 extends AppCompatActivity {

    Toolbar Pain3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain3);


        //Toolbar
        Toolbar Pain3 = findViewById(R.id.Pain3);
        setSupportActionBar(Pain3);
        getSupportActionBar().setTitle("বুকে ব্যথা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain3.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain3.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain3.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }

}

