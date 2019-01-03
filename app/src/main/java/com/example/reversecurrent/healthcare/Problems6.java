package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Problems6 extends AppCompatActivity {

    Toolbar Problems6;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems6);

        //Toolbar
        Toolbar Problems6 = findViewById(R.id.Prb6);
        setSupportActionBar(Problems6);
        getSupportActionBar().setTitle("ছেলেদের হস্তমৈথুনের সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems6.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems6.this,Problems.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems6.this,Problems.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
