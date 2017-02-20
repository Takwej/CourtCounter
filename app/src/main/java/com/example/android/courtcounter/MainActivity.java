package com.example.android.courtcounter;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    int scoreA = 0;
    int scoreB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        displayForTeamA(0);
        displayForTeamB(0);
    }

    //3p for A
    public void athree(View view) {


        scoreA = scoreA + 3;
        displayForTeamA(scoreA);

    }

    //2p for A
    public void atwo(View view) {


        scoreA = scoreA + 2;
        displayForTeamA(scoreA);

    }

    //1p for A
    public void aone(View view) {


        scoreA = scoreA + 1;
        displayForTeamA(scoreA);

    }

    //DISPLAY SCORE FOR --A--
    public void displayForTeamA(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }


    //TEAM B---------------------BELOW


    //3p for B
    public void bthree(View view) {


        scoreB = scoreB + 3;
        displayForTeamB(scoreB);
    }

    //2 for B
    public void btwo(View view) {


        scoreB = scoreB + 2;
        displayForTeamB(scoreB);
    }

    //1p for B
    public void bone(View view) {


        scoreB = scoreB + 1;
        displayForTeamB(scoreB);
    }

    //DISPLAY SCORE FOR B
    public void displayForTeamB(int score) {
        TextView scoreView = (TextView) findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }

    //-----------RESET BUTTON

    public void reset (View view) {
        scoreA = 0;
        scoreB = 0;
        displayForTeamA(scoreA);
        displayForTeamB(scoreB);
    }



}
