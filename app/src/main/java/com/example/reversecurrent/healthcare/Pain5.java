package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain5 extends AppCompatActivity {

    Toolbar Pain5;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain5);

        //Toolbar
        Toolbar Pain5 = findViewById(R.id.Pain5);
        setSupportActionBar(Pain5);
        getSupportActionBar().setTitle("আরথ্রাইটিস ব্যথা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain5.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain5.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain5.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }

}
