package com.example.reversecurrent.healthcare;

import android.annotation.TargetApi;
import android.content.Intent;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Minor_Diseases extends AppCompatActivity {

    Toolbar MinorD;

    int i ;
    public static final int[] bArray ={
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6
    };

    //create a button array object
    public Button[] button =  new Button[bArray.length];

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_minor__diseases);


        Toolbar MinorD = findViewById(R.id.MinorDeseases);
        setSupportActionBar(MinorD);
        getSupportActionBar().setTitle("ছোটখাটো রোগ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        MinorD.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Minor_Diseases.this,MainActivity.class);
                startActivity(i);
                finish();
            }
        });



        for(i=0;i<bArray.length;i++){

            button[i] = (Button) findViewById(bArray[i]);
            //button[i].setBackgroundColor(getColor(R.color.button_color));
            button[i].setBackground(getDrawable(R.drawable.rounded_button));


            button[i].setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    switch (view.getId()) {

                        case R.id.button1:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                               Intent Pain1 = new Intent(Minor_Diseases.this,MinorDeseases1.class);
                               startActivity(Pain1);
                            finish();
                            break;

                        case R.id.button2:
                            //Toast.makeText(getApplicationContext(),"ইউরোপ",Toast.LENGTH_SHORT).show();
                              Intent Pain2 = new Intent(Minor_Diseases.this,MinorDeseases2.class);
                              startActivity(Pain2);

                            finish();
                            break;

                        case R.id.button3:
                            //Toast.makeText(getApplicationContext(),"আফ্রিকা",Toast.LENGTH_SHORT).show();
                              Intent Pain3 = new Intent(Minor_Diseases.this,MinorDeseases3.class);
                             startActivity(Pain3);

                            finish();
                            break;

                        case R.id.button4:
                            // Toast.makeText(getApplicationContext(),"উত্তর আমেরিকা",Toast.LENGTH_SHORT).show();
                             Intent Pain4 = new Intent(Minor_Diseases.this,MinorDeseases4.class);
                             startActivity(Pain4);

                            finish();
                            break;

                        case R.id.button5:
                            //  Toast.makeText(getApplicationContext(),"দক্ষিন আমেরিকা",Toast.LENGTH_SHORT).show();
                               Intent Pain5 = new Intent(Minor_Diseases.this,MinorDeseases5.class);
                              startActivity(Pain5);

                            finish();
                            break;

                        case R.id.button6:
                            //  Toast.makeText(getApplicationContext(),"অস্ট্রেলিয়া",Toast.LENGTH_SHORT).show();
                              Intent Pain6 = new Intent(Minor_Diseases.this,MinorDeseases6.class);
                             startActivity(Pain6);

                            finish();
                            break;


                    }

                }
            });
        }
//End of For Loop


    }


    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Minor_Diseases.this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
