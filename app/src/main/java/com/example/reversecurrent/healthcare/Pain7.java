package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain7 extends AppCompatActivity {

    Toolbar Pain7;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain7);

        //Toolbar
        Toolbar Pain7 = findViewById(R.id.Pain7);
        setSupportActionBar(Pain7);
        getSupportActionBar().setTitle("মেয়েদের পিরিয়ডের দির্ঘমেয়াদী ব্যথা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain7.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain7.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain7.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
