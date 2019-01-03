package com.example.reversecurrent.healthcare;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.GridLayout;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Toolbar Health_care;

    GridLayout mainGrid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar Health_care= findViewById(R.id.Home_care);

        setSupportActionBar(Health_care);
        getSupportActionBar().setTitle("ঘরে বসে চিকিৎসা");


        mainGrid = (GridLayout) findViewById(R.id.mainGrid);

        //Set Event
        setSingleEvent(mainGrid);
        //setToggleEvent(mainGrid);

    }

    private void setToggleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            final CardView cardView = (CardView) mainGrid.getChildAt(i);
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    if (cardView.getCardBackgroundColor().getDefaultColor() == -1) {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FF6F00"));
                        Toast.makeText(MainActivity.this, "State : True", Toast.LENGTH_SHORT).show();

                    } else {
                        //Change background color
                        cardView.setCardBackgroundColor(Color.parseColor("#FFFFFF"));
                        Toast.makeText(MainActivity.this, "State : False", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        }
    }

    private void setSingleEvent(GridLayout mainGrid) {
        //Loop all child item of Main Grid
        for (int i = 0; i < mainGrid.getChildCount(); i++) {
            //You can see , all child item is CardView , so we just cast object to CardView
            CardView cardView = (CardView) mainGrid.getChildAt(i);
            final int finalI = i;
            cardView.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {


                    if(finalI==0) {

                        Intent intent = new Intent(MainActivity.this, Pain.class);
                        startActivity(intent);
                        finish();

                    } else if(finalI==1){

                        Intent intent = new Intent(MainActivity.this, Deseases.class);
                        startActivity(intent);
                        finish();
                    }else if(finalI==2){
                        Intent intent = new Intent(MainActivity.this, Problems.class);
                        startActivity(intent);
                        finish();
                    }else if(finalI==3){
                        Intent intent = new Intent(MainActivity.this, Minor_Diseases.class);
                        startActivity(intent);
                        finish();
                    }else if(finalI==4){
                        Intent intent = new Intent(MainActivity.this, MentalProblems.class);
                        startActivity(intent);
                        finish();

                    }else if(finalI==5){
                        Intent intent = new Intent(MainActivity.this, Tips.class);
                        startActivity(intent);
                        finish();

                    }

                }
            });
        }
    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        finish();
    }
}
