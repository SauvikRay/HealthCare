package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class Tips extends AppCompatActivity {

    Toolbar Tips;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tips);

        Toolbar Tips = findViewById(R.id.Tips);
        setSupportActionBar(Tips);
        getSupportActionBar().setTitle("টিপস");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Tips.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Tips.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });


    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Tips.this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
