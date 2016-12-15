package com.example.asus.kothlakondong;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

public class chooseLevel extends Activity implements View.OnClickListener
{
    ImageButton easyBtn, hardBtn, scowBtn, backBtn;
    ImageView titleLevel, chooseCow;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_choose_level);

        easyBtn = (ImageButton) findViewById(R.id.easyButton);
        easyBtn.setOnClickListener(this);

        hardBtn = (ImageButton) findViewById(R.id.hardButton);
        hardBtn.setOnClickListener(this);

        titleLevel =(ImageView) findViewById(R.id.titleLevel);

        scowBtn = (ImageButton) findViewById(R.id.cowBtn);
        scowBtn.setOnClickListener(this);

        backBtn = (ImageButton) findViewById(R.id.backBtn);
        backBtn.setOnClickListener(this);

        chooseCow = (ImageView) findViewById(R.id.chooseCow);

    }

    @Override
    public void onClick(View view) {

        switch (view.getId()){
            case R.id.easyButton:

//                Intent intentEasy = new Intent(chooseLevel.this,chooseCow.class);
//                startActivity(intentEasy);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(view);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(hardBtn);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(titleLevel);
                scowBtn.setVisibility(View.VISIBLE);
                chooseCow.setVisibility(View.VISIBLE);

                break;

            case R.id.hardButton:

//                Intent intentHard = new Intent(chooseLevel.this,chooseCow.class);
//                startActivity(intentHard);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(view);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(easyBtn);
                ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(titleLevel);
                scowBtn.setVisibility(View.VISIBLE);
                chooseCow.setVisibility(View.VISIBLE);
                break;

            case R.id.cowBtn:

                Intent intent = new Intent(chooseLevel.this,playGame.class);
                startActivity(intent);
                break;

            case R.id.backBtn:
                if(scowBtn.getVisibility() == View.VISIBLE){
                    ((RelativeLayout)findViewById(R.id.activity_choose_level)).addView(hardBtn);
                    ((RelativeLayout)findViewById(R.id.activity_choose_level)).addView(easyBtn);
                    ((RelativeLayout)findViewById(R.id.activity_choose_level)).addView(titleLevel);
                    scowBtn.setVisibility(View.INVISIBLE);
                    chooseCow.setVisibility(View.INVISIBLE);
                }
                else{
                    finish();
                }
        }

//        ((RelativeLayout)findViewById(R.id.activity_choose_level)).removeView(view);
    }
}
