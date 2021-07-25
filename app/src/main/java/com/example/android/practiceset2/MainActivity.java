package com.example.android.practiceset2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    int scoreTeamA =0;
    int scoreTeamB =0;


    public void threePointerForTeamA(View v){
        scoreTeamA = scoreTeamA +3;
        displayTeamA(scoreTeamA);
    }
    public void twoPointerForTeamA(View v){
        scoreTeamA +=2;
        displayTeamA(scoreTeamA);
    }
    public void freeThrowForTeamA(View v){
        scoreTeamA +=1;
        displayTeamA(scoreTeamA);
    }

    private void displayTeamA(int num){

        TextView scoreView= findViewById(R.id.Team_A_score);
        scoreView.setText(String.valueOf(num));

    }


    public void threePointerForTeamB(View view) {
        scoreTeamB=scoreTeamB+3;
        displayTeamB(scoreTeamB);
    }

    public void twoPointerForTeamB(View view) {
        scoreTeamB = scoreTeamB +2;
        displayTeamB(scoreTeamB);
    }

    public void freeThrowForTeamB(View view) {
        scoreTeamB +=1;
        displayTeamB(scoreTeamB);
    }

    private void displayTeamB(int num){

        TextView scoreView= findViewById(R.id.Team_B_score);
        scoreView.setText(String.valueOf(num));

    }

    public void reset(View view){
        scoreTeamB=0;
        scoreTeamA=0;
        displayTeamA(scoreTeamA);
        displayTeamB(scoreTeamB);


    }
}