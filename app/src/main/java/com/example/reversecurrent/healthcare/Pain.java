package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.os.Build;
import android.support.annotation.RequiresApi;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class Pain extends AppCompatActivity {

    Toolbar Pain;
    int i ;
    public static final int[] bArray ={
            R.id.button1,
            R.id.button2,
            R.id.button3,
            R.id.button4,
            R.id.button5,
            R.id.button6,
            R.id.button7,
            R.id.button8,
            R.id.button9
    };

    //create a button array object
    public Button[] button =  new Button[bArray.length];

    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pain);

        Toolbar Pain = findViewById(R.id.Pain);
        setSupportActionBar(Pain);
        getSupportActionBar().setTitle("ব্যাথা");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

        Pain.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Pain.this,MainActivity.class);
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
                    switch (view.getId()){

                        case R.id.button1:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                            Intent Pain1 = new Intent(Pain.this,Pain1.class);
                            startActivity(Pain1);
                            finish();
                            break;

                        case R.id.button2:
                            //Toast.makeText(getApplicationContext(),"ইউরোপ",Toast.LENGTH_SHORT).show();
                            Intent Pain2 = new Intent(Pain.this,Pain2.class);
                            startActivity(Pain2);

                            finish();
                            break;

                        case R.id.button3:
                            //Toast.makeText(getApplicationContext(),"আফ্রিকা",Toast.LENGTH_SHORT).show();
                            Intent Pain3 = new Intent(Pain.this,Pain3.class);
                            startActivity(Pain3);

                            finish();
                            break;

                        case R.id.button4:
                            // Toast.makeText(getApplicationContext(),"উত্তর আমেরিকা",Toast.LENGTH_SHORT).show();
                            Intent Pain4 = new Intent(Pain.this,Pain4.class);
                            startActivity(Pain4);

                            finish();
                            break;

                        case R.id.button5:
                            //  Toast.makeText(getApplicationContext(),"দক্ষিন আমেরিকা",Toast.LENGTH_SHORT).show();
                            Intent Pain5 = new Intent(Pain.this,Pain5.class);
                            startActivity(Pain5);

                            finish();
                            break;

                        case R.id.button6:
                            //  Toast.makeText(getApplicationContext(),"অস্ট্রেলিয়া",Toast.LENGTH_SHORT).show();
                            Intent Pain6 = new Intent(Pain.this,Pain6.class);
                            startActivity(Pain6);

                            finish();
                            break;

                        case R.id.button7:
                            // Toast.makeText(getApplicationContext(),"এনটার্কটিকা",Toast.LENGTH_SHORT).show();
                            Intent Pain7 = new Intent(Pain.this,Pain7.class);
                            startActivity(Pain7);

                            finish();
                            break;

                        case R.id.button8:
                            // Toast.makeText(getApplicationContext(),"আয়তনে বড় ১০টি দেশ",Toast.LENGTH_SHORT).show();
                            Intent Pain8 = new Intent(Pain.this,Pain8.class);
                            startActivity(Pain8);

                            finish();
                            break;

                        case R.id.button9:
                            // Toast.makeText(getApplicationContext(),"আয়তনে ছোট ১০টি দেশ",Toast.LENGTH_SHORT).show();
                            Intent Pain9 = new Intent(Pain.this,Pain9.class);
                            startActivity(Pain9);

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
        Intent intent = new Intent(Pain.this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
