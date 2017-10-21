package com.example.tkixi.team4good;

/**
 * Created by Sudeep Swarnapuri on 10/20/2017.
 */

public class Player {

    public int streak;
    public int score;
    public int choice;
    public int lives;
    public int plNum;

    public Player(int Num) {
        streak = 1;
        score = 0;
        choice = 0;
        lives = 3;
        plNum = Num;
    }


}