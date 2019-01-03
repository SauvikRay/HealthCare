package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Pain2 extends AppCompatActivity {

    Toolbar Pain2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain2);


        //Toolbar
        Toolbar Pain2 = findViewById(R.id.Pain2);
        setSupportActionBar(Pain2);
        getSupportActionBar().setTitle("দাঁতে ব্যথা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain2.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain2.this,Pain.class);
                startActivity(i);
                finish();
            }
        });
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Pain2.this,Pain.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
