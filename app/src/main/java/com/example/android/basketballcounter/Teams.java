package com.example.android.basketballcounter;

public class Teams {
    private int teamAscore;
    private int teamBscore;

    Teams() {
        teamAscore = 0;
        teamBscore = 0;
    }

    Teams(int a, int b) {
        this.teamAscore = a;
        this.teamBscore = b;
    }

    void setTeamAscore(int a) {
        this.teamAscore = a;
    }

    void setTeamBscore(int b) {
        this.teamBscore = b;
    }

    int getTeamAscore() {
        return this.teamAscore;
    }

    int getTeamBscore() {
        return this.teamBscore;
    }

    void incrementByThreeB() {
        teamBscore += 3;
    }

    void incrementByTwoB() {
        teamBscore += 2;
    }

    void incrementByOneB() {
        teamBscore += 1;
    }

    void incrementByThreeA() {
        teamAscore += 3;
    }

    void incrementByTwoA() {
        teamAscore += 2;
    }

    void incrementByOneA() {
        teamAscore += 1;
    }

}
