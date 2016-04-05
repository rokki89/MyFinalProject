package com.rokki.myfinalproject;

import android.content.Intent;
import android.os.CountDownTimer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btnSummer;
    private Button btnWinter;
    private Button btnSpring;
    private Button btnAutumn;
    private Button btnDishes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.miniature);

        new CountDownTimer(5000,1000){
            @Override
            public void onTick(long millisUntilFinished){}

            @Override
            public void onFinish(){
                //set the new Content of your activity
                MainActivity.this.setContentView(R.layout.activity_main);

                btnSummer = (Button) findViewById(R.id.btn_summer_fishing);
                btnSummer.setOnClickListener(MainActivity.this);
                btnWinter = (Button) findViewById(R.id.btn_winter_fishing);
                btnWinter.setOnClickListener(MainActivity.this);
                btnSpring = (Button) findViewById(R.id.btn_spring_fishing);
                btnSpring.setOnClickListener(MainActivity.this);
                btnAutumn = (Button) findViewById(R.id.btn_autumn_fishing);
                btnAutumn.setOnClickListener(MainActivity.this);
                btnDishes = (Button) findViewById(R.id.btn_dishes);
                btnDishes.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        Intent intent = new Intent(MainActivity.this, DishesActivity.class);
                        startActivity(intent);
                    }
                });

            }
        }.start();

    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(this, SeasonActivity.class);
        switch (v.getId()){
            case R.id.btn_autumn_fishing:
                intent.putExtra("season", "aut");
                break;
            case R.id.btn_spring_fishing:
                intent.putExtra("season", "spr");
                break;
            case R.id.btn_summer_fishing:
                intent.putExtra("season", "sum");
                break;
            case R.id.btn_winter_fishing:
                intent.putExtra("season", "win");
                break;
        }

        startActivity(intent);
    }
}
