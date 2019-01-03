package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Deseases14 extends AppCompatActivity {

    Toolbar Deseases14;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases14);

        Toolbar Deseases14 = findViewById(R.id.Des14);
        setSupportActionBar(Deseases14);
        getSupportActionBar().setTitle("ব্লাড ক্যান্সার");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Deseases14.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases14.this,Deseases.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases14.this,Deseases.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
