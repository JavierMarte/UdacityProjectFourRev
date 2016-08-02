package com.example.kaiso.udacityprojectfour;

import android.app.Activity;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by kaiso on 7/31/2016.
 */
public class FavActivity extends Activity{
    private MediaPlayer mediaPlayer;
    boolean stopPress = false;
    String newString;

    ImageView qImageView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.favlayout);
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

        TextView hey = (TextView) findViewById(R.id.textView3);

        if(newString.equals("one")) {

            hey.setText("\"Where Are Ü Now\" is a song produced by American EDM DJ duo " +
                    "Jack Ü under their collaborative effort Jack Ü with vocals from Canadian singer Justin " +
                    "Bieber. The song was released as the second single from the duo's debut studio album, Skrillex and " +
                    "Diplo Present Jack Ü (2015), on their respective labels OWSLA and Mad Decent, and is also included on Bieber's " +
                    "fourth album Purpose (2015). It was released simultaneously with the album on February 27, 2015, later sent " +
                    "to mainstream radio on April 21, 2015.");
        }else if(newString.equals("two")){

            hey.setText("“Cold Water” is about coming together to face adversity and to say that you have your partner’s back no matter what the situation is.");
        }else if(newString.equals("three")){

           hey.setText("\"Dare You\" is a song by Dutch DJ and record producer Hardwell. It features the vocals from Matthew Koma. It was released on 13 November 2013 and re-released on 5 January 2014 through Revealed Recordings.[1] It entered the UK Singles Chart at number 18, making it the first Hardwell release to chart in the United Kingdom, in January 2014.");
            //hey.setText("yoo");
        }else if(newString.equals("four")){

            hey.setText("\"Feel So Close\" is a song by Scottish recording artist Calvin Harris, released as the second single from his third studio album, 18 Months (2012). Harris returns to singing on this song, after previously stating he had quit singing in concerts.[1] The song debuted at number two on the UK Singles Chart, becoming Harris's sixth solo top ten single. It also marked his second single to chart on the Billboard Hot 100 in the United States—his first being Rihanna's \"We Found Love\", on which he is featured. The song had sold over 2.17 million copies in the US by the end of 2012");
        }
    }
}
