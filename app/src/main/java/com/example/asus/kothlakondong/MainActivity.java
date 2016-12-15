package com.example.asus.kothlakondong;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageButton;
import java.util.*;

public class MainActivity extends Activity {
    ImageButton imgbutton;
    ImageButton musicBtn = null;
    MediaPlayer player =null;

    boolean startPlaying;

//    private void onPlay(boolean start){
//        if(start){
//            startPlaying();
//        }
//        else{
//            stopPlaying();
//        }
//    }

//    private void startPlaying(){
//            player = new MediaPlayer();
//            player = MediaPlayer.create(MainActivity.this,R.raw.mrscow);
//            player.start();
//    }
//
//    private void stopPlaying(){
//        player.pause();
//        player = null;
//    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);
        imgbutton = (ImageButton) findViewById(R.id.imageButton);
        musicBtn = (ImageButton) findViewById(R.id.musicBtn);
        player = new MediaPlayer();
        player = MediaPlayer.create(MainActivity.this,R.raw.mrscow);
//        player.start();
//        startPlaying=true;
        musicBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
//                onPlay(startPlaying);
//                startPlaying=!startPlaying;
//                System.out.println(startPlaying);
                if(player.isPlaying()){
                    player.pause();
                }
                else{
                    player.start();
                }
            }
        });


        imgbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainActivity.this, chooseLevel.class);
                startActivity(intent);
                player.release();
            }
        });


    }

}
