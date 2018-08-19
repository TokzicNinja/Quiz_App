package com.example.android.basketballcounter;

import android.graphics.Typeface;
//import android.support.v4.graphics.TypefaceCompatApi26Impl;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    Teams scores = new Teams();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //CHANGES THE FONT FAMILY FOR ALL THE SPECIFIED TEXT_VIEWS
        TextView scoreB_TextView = findViewById(R.id.scoreB);
        Typeface custom_font = Typeface.createFromAsset(getAssets(), "fonts/Digital Dismay.otf");
        scoreB_TextView.setTypeface(custom_font);

        TextView scoreA_TextView = findViewById(R.id.scoreA);
        Typeface custom_font1 = Typeface.createFromAsset(getAssets(), "fonts/Digital Dismay.otf");
        scoreA_TextView.setTypeface(custom_font1);

        TextView descriptionA_TextView = findViewById(R.id.A_description);
        Typeface custom_font2 = Typeface.createFromAsset(getAssets(), "fonts/digital-7.ttf");
        descriptionA_TextView.setTypeface(custom_font2);

        TextView descriptionB_TextView = findViewById(R.id.B_description);
        Typeface custom_font3 = Typeface.createFromAsset(getAssets(), "fonts/digital-7.ttf");
        descriptionB_TextView.setTypeface(custom_font3);

        TextView plusOne_TextView = findViewById(R.id.plusOne);
        Typeface custom_font4 = Typeface.createFromAsset(getAssets(), "fonts/digital-7 (mono).ttf");
        plusOne_TextView.setTypeface(custom_font4);

        TextView plusTwo_TextView = findViewById(R.id.plusTwo);
        Typeface custom_font5 = Typeface.createFromAsset(getAssets(), "fonts/digital-7 (mono).ttf");
        plusTwo_TextView.setTypeface(custom_font5);

        TextView plusThree_TextView = findViewById(R.id.plusThree);
        Typeface custom_font6 = Typeface.createFromAsset(getAssets(), "fonts/digital-7 (mono).ttf");
        plusThree_TextView.setTypeface(custom_font6);
    }

    //Increment functions for B
    public void ThreePointsB(View view) {

        scores.incrementByThreeB(); //increments by three for Team B
        displayThreePointsB(scores.getTeamBscore());//displays the points for Team B
        Toast.makeText(getApplicationContext(), String.valueOf(scores.getTeamBscore()), Toast.LENGTH_SHORT).show();
    }

    public void TwoPointsB(View view) {
        scores.incrementByTwoB();//increments by two for Team B
        displayTwoPointsB(scores.getTeamBscore());//displays the points for Team B
    }

    public void OnePointB(View view) {
        scores.incrementByOneB();//increments by one for Team B
        displayOnePointB(scores.getTeamBscore());//displays the points for Team B
    }

    //Display function for B
    public void displayThreePointsB(int increment) {
        TextView scoreB_TextView = findViewById(R.id.scoreB);
        scoreB_TextView.setText(String.valueOf(increment));
    }

    public void displayTwoPointsB(int increment) {
        TextView scoreB_TextView = findViewById(R.id.scoreB);
        scoreB_TextView.setText(String.valueOf(increment));
    }

    public void displayOnePointB(int increment) {
        TextView scoreB_TextView = findViewById(R.id.scoreB);
        scoreB_TextView.setText(String.valueOf(increment));
    }

    //Increment functions for team A
    public void ThreePointsA(View view) {
        scores.incrementByThreeA();//increments by three for Team A
        displayThreePointsA(scores.getTeamAscore());//displays points for Team A
        Toast.makeText(getApplicationContext(), String.valueOf(scores.getTeamAscore()), Toast.LENGTH_SHORT).show();
    }

    public void TwoPointsA(View view) {
        scores.incrementByTwoA();// increments by two for Team A
        displayTwoPointsA(scores.getTeamAscore());//displays points for Team A
    }

    public void OnePointA(View view) {
        scores.incrementByOneA(); //increments by one for Team A
        displayOnePointA(scores.getTeamAscore());//displays points for Team A
    }

    //Display functions for Team A
    public void displayThreePointsA(int increment) {
        TextView scoreA_TextView = findViewById(R.id.scoreA);
        scoreA_TextView.setText(String.valueOf(increment));
    }

    public void displayTwoPointsA(int increment) {
        TextView scoreA_TextView = findViewById(R.id.scoreA);
        scoreA_TextView.setText(String.valueOf(increment));
    }

    public void displayOnePointA(int increment) {
        TextView scoreA_TextView = findViewById(R.id.scoreA);
        scoreA_TextView.setText(String.valueOf(increment));
    }

    //Resets the scores by setting the each score to zero
    public void resetScore(View view) {
        scores.setTeamAscore(0);
        scores.setTeamBscore(0);

        displayThreePointsA(scores.getTeamAscore());
        displayThreePointsB(scores.getTeamBscore());
    }
}
