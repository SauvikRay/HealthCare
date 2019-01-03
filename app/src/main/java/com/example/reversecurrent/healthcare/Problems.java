package com.example.reversecurrent.healthcare;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Problems extends AppCompatActivity {
    Toolbar Problems;

    int i;

    public static final int[] bArray ={
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13

    };

    //create a button array object
    public Button[] button =  new Button[bArray.length];

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_problems);


        Toolbar Problems = findViewById(R.id.Problems);
        setSupportActionBar(Problems);
        getSupportActionBar().setTitle("সমস্যা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Problems.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Problems.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });


        //Button click
        for(i=0;i<bArray.length;i++) {

            button[i] = (Button) findViewById(bArray[i]);
            //button[i].setBackgroundColor(getColor(R.color.button_color));
            button[i].setBackground(getDrawable(R.drawable.rounded_button));

            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {

                        case R.id.button1:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb1 = new Intent(Problems.this, Problems1.class);
                            startActivity(Prb1);
                            finish();
                            break;
                        case R.id.button2:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb2 = new Intent(Problems.this, Problems2.class);
                            startActivity(Prb2);
                            finish();
                            break;
                        case R.id.button3:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb3 = new Intent(Problems.this, Problems3.class);
                            startActivity(Prb3);
                            finish();
                            break;
                        case R.id.button4:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb4 = new Intent(Problems.this, Problems4.class);
                            startActivity(Prb4);
                            finish();
                            break;
                        case R.id.button5:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb5 = new Intent(Problems.this, Problems5.class);
                            startActivity(Prb5);
                            finish();
                            break;
                        case R.id.button6:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb6 = new Intent(Problems.this, Problems6.class);
                            startActivity(Prb6);
                            finish();
                            break;
                        case R.id.button7:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Des7 = new Intent(Problems.this, Problems7.class);
                            startActivity(Des7);
                            finish();
                            break;
                        case R.id.button8:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb8 = new Intent(Problems.this, Problems8.class);
                            startActivity(Prb8);
                            finish();
                            break;
                        case R.id.button9:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb9 = new Intent(Problems.this, Problems9.class);
                            startActivity(Prb9);
                            finish();
                            break;
                        case R.id.button10:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb10 = new Intent(Problems.this, Problems10.class);
                            startActivity(Prb10);
                            finish();
                            break;
                        case R.id.button11:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb11 = new Intent(Problems.this, Problems11.class);
                            startActivity(Prb11);
                            finish();
                            break;
                        case R.id.button12:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb12 = new Intent(Problems.this, Problems12.class);
                            startActivity(Prb12);
                            finish();
                            break;
                        case R.id.button13:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Prb13 = new Intent(Problems.this, Problems13.class);
                            startActivity(Prb13);
                            finish();
                            break;
                    }
                }
                 });
            }
        }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Problems.this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }




}
