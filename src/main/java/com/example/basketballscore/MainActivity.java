package com.example.basketballscore;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    int teamA = 0;
    int teamB = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    public void displayAScore(int score) {
        TextView scoreView = findViewById(R.id.team_a_score);
        scoreView.setText(String.valueOf(score));
    }

    public void displayBScore(int score) {
        TextView scoreView = findViewById(R.id.team_b_score);
        scoreView.setText(String.valueOf(score));
    }


    public void aPlus3(View view) {
        teamA+= 3;
        displayAScore(teamA);
    }

    public void aPlus2(View view) {
        teamA+= 2;
        displayAScore(teamA);
    }

    public void aPlus1(View view) {
        teamA+= 1;
        displayAScore(teamA);
    }

    public void bPlus3(View view) {
        teamB+= 3;
        displayBScore(teamB);
    }

    public void bPlus2(View view) {
        teamB+= 2;
        displayBScore(teamB);
    }

    public void bPlus1(View view) {
        teamB+= 1;
        displayBScore(teamB);
    }

    public void reset(View view) {
        teamA=0;
        teamB=0;
        displayAScore(teamA);
        displayBScore(teamB);
    }
}