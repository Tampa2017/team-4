package com.example.tkixi.team4good;

/**
 * Created by Riley on 10/20/2017.
 */
import java.util.Random;

public class Game {
    private void Game() {
        //this.Counter = 10;
    }

    Random rand = new Random();
    int theNum;
    String[] questions = {"something", "nothing", "hello"};
    String[][] answers = {{"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}};

    private String curQuest() {
        Random rand = new Random();
        int  theNum = rand.nextInt(3) - 1;
        return questions[theNum];
    }
    private boolean Correct(int Choice) {
        /**Checks the players choice **/
        if (Choice == 0) {
            return true;
        }
        return false;
    }
//    private boolean Correct(int Choice) {
//        /**Checks the players choice **/
//        if (Choice == 0) {
//            return True;
//        }
//        return False;
//    }

    



}
