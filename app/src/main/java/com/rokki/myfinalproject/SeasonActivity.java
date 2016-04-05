package com.rokki.myfinalproject;

import android.content.Intent;
import android.graphics.Color;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.ScrollView;
import android.widget.TextView;

public class SeasonActivity extends AppCompatActivity {

    private ScrollView content;
    private ImageView imgPager;
    private TextView txt;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_season);

        content = (ScrollView) findViewById(R.id.content);
        imgPager = (ImageView) findViewById(R.id.img_pager);
        txt = (TextView) findViewById(R.id.tv_text);

        String season= "";
        Intent intent =getIntent();
        if(intent!=null){
            season = intent.getStringExtra("season");
        }
        if(season.equals("sum")){
            content.setBackgroundColor(Color.parseColor("#81C784"));
            imgPager.setImageResource(R.drawable.summer);
            txt.setText(R.string.spring);
        }
        else if(season.equals("aut")){
            content.setBackgroundColor(Color.parseColor("#FFF176"));
            imgPager.setImageResource(R.drawable.autumn);
            txt.setText(R.string.autumn);
        }
        else if(season.equals("spr")){
            content.setBackgroundColor(Color.parseColor("#CE93D8"));
            imgPager.setImageResource(R.drawable.spring);
            txt.setText(R.string.spring);
        }
    }
}
