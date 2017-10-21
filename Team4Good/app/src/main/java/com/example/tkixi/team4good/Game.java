package com.example.tkixi.team4good;

/**
 * Created by rgasher on 10/20/2017.
 */
import java.util.Random;

public class Game {

    float ticker = 10.00
    String[] questions = {"something", "nothing", "hello"};
    String[][] answers = {{"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}};

    String curQuest() {
        Random rand = new Random();
        int  theNum = rand.nextInt(3) - 1;
        return questions[theNum];
    }

    



}
