package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain4 extends AppCompatActivity {
    Toolbar Pain4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain4);
        //Toolbar
        Toolbar Pain4 = findViewById(R.id.Pain4);
        setSupportActionBar(Pain4);
        getSupportActionBar().setTitle("কোমর ব্যথা/ ব্যাক পেইন");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain4.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain4.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain4.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
