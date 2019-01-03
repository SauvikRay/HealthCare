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
public class Deseases extends AppCompatActivity {

    Toolbar Deseases;

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
            R.id.button9,
            R.id.button10,
            R.id.button11,
            R.id.button12,
            R.id.button13,
            R.id.button14,
            R.id.button15,
            R.id.button16,
            R.id.button17,
            R.id.button18,
            R.id.button19,
            R.id.button20
    };

    //create a button array object
    public Button[] button =  new Button[bArray.length];

    @TargetApi(Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deseases);

        Toolbar Deseases = findViewById(R.id.Deseases);

        setSupportActionBar(Deseases);
        getSupportActionBar().setTitle("রোগ");
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        Deseases.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(Deseases.this,MainActivity.class);
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
                            Intent Des1 = new Intent(Deseases.this, Deseases1.class);
                            startActivity(Des1);
                            finish();
                            break;
                        case R.id.button2:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des2 = new Intent(Deseases.this, Deseases2.class);
                               startActivity(Des2);
                            finish();
                            break;
                        case R.id.button3:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des3 = new Intent(Deseases.this, Deseases3.class);
                                startActivity(Des3);
                            finish();
                            break;
                        case R.id.button4:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des4 = new Intent(Deseases.this, Deseases4.class);
                               startActivity(Des4);
                            finish();
                            break;
                        case R.id.button5:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des5 = new Intent(Deseases.this, Deseases5.class);
                               startActivity(Des5);
                            finish();
                            break;
                        case R.id.button6:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des6 = new Intent(Deseases.this, Deseases6.class);
                               startActivity(Des6);
                            finish();
                            break;
                        case R.id.button7:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des7 = new Intent(Deseases.this, Deseases7.class);
                               startActivity(Des7);
                            finish();
                            break;
                        case R.id.button8:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des8 = new Intent(Deseases.this, Deseases8.class);
                                 startActivity(Des8);
                            finish();
                            break;
                        case R.id.button9:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des9 = new Intent(Deseases.this, Deseases9.class);
                                 startActivity(Des9);
                            finish();
                            break;
                        case R.id.button10:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des10 = new Intent(Deseases.this, Deseases10.class);
                                startActivity(Des10);
                            finish();
                            break;
                        case R.id.button11:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                Intent Des11 = new Intent(Deseases.this, Deseases11.class);
                                startActivity(Des11);
                            finish();
                            break;
                        case R.id.button12:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des12 = new Intent(Deseases.this, Deseases12.class);
                                 startActivity(Des12);
                            finish();
                            break;
                        case R.id.button13:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des13 = new Intent(Deseases.this, Deseases13.class);
                                startActivity(Des13);
                            finish();
                            break;
                        case R.id.button14:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                Intent Des14 = new Intent(Deseases.this, Deseases14.class);
                               startActivity(Des14);
                            finish();
                            break;
                        case R.id.button15:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des15 = new Intent(Deseases.this, Deseases15.class);
                               startActivity(Des15);
                            finish();
                            break;
                        case R.id.button16:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des16 = new Intent(Deseases.this, Deseases16.class);
                                startActivity(Des16);
                            finish();
                            break;
                        case R.id.button17:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des17 = new Intent(Deseases.this, Deseases17.class);
                               startActivity(Des17);
                            finish();
                            break;
                        case R.id.button18:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des18 = new Intent(Deseases.this, Deseases18.class);
                                startActivity(Des18);
                            finish();
                            break;
                        case R.id.button19:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                Intent Des19 = new Intent(Deseases.this, Deseases19.class);
                               startActivity(Des19);
                            finish();
                            break;
                        case R.id.button20:
                            //  Toast.makeText(getApplicationContext(),"এশিয়া",Toast.LENGTH_SHORT).show();
                                 Intent Des20 = new Intent(Deseases.this, Deseases20.class);
                                startActivity(Des20);
                            finish();
                            break;
                    }
                }
            });

        }
    }

    @Override
    public void onBackPressed() {
        Intent intent = new Intent(Deseases.this,MainActivity.class);
        startActivity(intent);
        super.onBackPressed();
        finish();
    }
}
