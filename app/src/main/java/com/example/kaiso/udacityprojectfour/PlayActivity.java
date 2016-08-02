package com.example.kaiso.udacityprojectfour;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaiso on 7/31/2016.
 */
public class PlayActivity extends Activity{
    private MediaPlayer mediaPlayer;
    boolean stopPress = false;
    String newString;
    String songselected = "one";
    ImageView qImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.playlayout);
        qImageView = (ImageView) findViewById(R.id.imageView);
       // mediaPlayer = MediaPlayer.create(this, R.raw.song1);
        if (savedInstanceState == null) {
            Bundle extras = getIntent().getExtras();
            if(extras == null) {
                newString= null;
            } else {
                newString= extras.getString("hey");
            }
        } else {
            newString= (String) savedInstanceState.getSerializable("hey");
        }
        System.out.println("{" + newString + "}");
        if(newString.equals("song1")){
            mediaPlayer = MediaPlayer.create(this, R.raw.song1);
            songselected = "one";
            qImageView = (ImageView) findViewById(R.id.imageView);
            qImageView.setImageResource(R.drawable.where);

        }else if(newString.equals("song2")){
            System.out.println("llllllllllllll");
            mediaPlayer = MediaPlayer.create(this, R.raw.song2);
            songselected = "two";
            qImageView = (ImageView) findViewById(R.id.imageView);
            qImageView.setImageResource(R.drawable.cold);

        }else if(newString.equals("song3")){

            mediaPlayer = MediaPlayer.create(this, R.raw.song3);
            songselected = "three";
            qImageView = (ImageView) findViewById(R.id.imageView);
            qImageView.setImageResource(R.drawable.hard);
        }else if(newString.equals("song4")){

            mediaPlayer = MediaPlayer.create(this, R.raw.song4);
            songselected = "four";
            qImageView = (ImageView) findViewById(R.id.imageView);
            qImageView.setImageResource(R.drawable.calvin);
        }

    }
    public void play(View view){
        if(!stopPress) {
            mediaPlayer.start();
        }else{
if(songselected.equals("one")) {
    mediaPlayer = MediaPlayer.create(this, R.raw.song1);
}else if(songselected.equals("two")){
    mediaPlayer = MediaPlayer.create(this, R.raw.song2);
}else if(songselected.equals("three")){
    mediaPlayer = MediaPlayer.create(this, R.raw.song3);
}else if(songselected.equals("four")){
    mediaPlayer = MediaPlayer.create(this, R.raw.song4);
}
            mediaPlayer.start();
            stopPress = false;
        }

    }
    public void pause(View view){

mediaPlayer.pause();
    }

    public void stop(View view){

        mediaPlayer.stop();
        stopPress = true;
    }
    public void info(View view){
        Intent i = new Intent(this, FavActivity.class);
        i.putExtra("hey", songselected);
        startActivity(i);


    }
}
