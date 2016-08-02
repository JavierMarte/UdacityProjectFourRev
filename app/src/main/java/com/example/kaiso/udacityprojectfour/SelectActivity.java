package com.example.kaiso.udacityprojectfour;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

/**
 * Created by kaiso on 7/31/2016.
 */
public class SelectActivity extends Activity{
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.selectlayout);
    }
    public void one(View view){
    Intent i = new Intent(this, PlayActivity.class);
        String strName = "hello";
        i.putExtra("hey", "song1");
        startActivity(i);

    }
    public void two(View view){
        Intent i = new Intent(this, PlayActivity.class);
        String strName = "hello";
        i.putExtra("hey", "song2");
        startActivity(i);

    }
    public void three(View view){

        Intent i = new Intent(this, PlayActivity.class);
        String strName = "hello";
        i.putExtra("hey", "song3");
        startActivity(i);
    }
    public void four(View view){

        Intent i = new Intent(this, PlayActivity.class);
        String strName = "hello";
        i.putExtra("hey", "song4");
        startActivity(i);
    }
}
