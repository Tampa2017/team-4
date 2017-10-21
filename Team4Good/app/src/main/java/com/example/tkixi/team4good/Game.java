
package com.example.tkixi.team4good;

/**
 * Created by Riley on 10/20/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game extends AppCompatActivity implements GestureDetector.OnGestureListener{

    Button button2, button3, button4, button5;
    TextView textView4, textView6;
    private GestureDetectorCompat GD;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        Player p1 = new Player();

        String[] questions = {"something", "nothing", "hello"};
        String[][] answers = {{"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}};

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView6 = (TextView) findViewById(R.id.textView6);
        button2.setText(answers[0][0]);
        button3.setText(answers[0][1]);
        button4.setText(answers[0][2]);
        button5.setText(answers[0][3]);
        textView4.setText(questions[0]);
        textView6.setText(""+p1.lives);

    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        this.GD.onTouchEvent(event);
        return super.onTouchEvent(event);
    }


//    @Override
    public boolean onSingleTapConfirmed(MotionEvent e) {
        return false;
    }


    @Override
    public boolean onDown(MotionEvent e) {
        return false;
    }

    @Override
    public void onShowPress(MotionEvent e) {

    }

    @Override
    public boolean onSingleTapUp(MotionEvent e) {
        return false;
    }

    @Override
    public boolean onScroll(MotionEvent e1, MotionEvent e2, float distanceX, float distanceY) {
        return false;
    }

    @Override
    public void onLongPress(MotionEvent e) {

    }

    @Override
    public boolean onFling(MotionEvent e1, MotionEvent e2, float velocityX, float velocityY) {
        return false;
    }


//    private void Game() {
//        //this.Counter = 10;
//    }
//
//    Random rand = new Random();
//    int theNum;
//    String[] questions = {"something", "nothing", "hello"};
//    String[][] answers = {{"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}, {"ans1", "ans2", "ans3", "ans4"}};
//
//    private String curQuest() {
//        Random rand = new Random();
//        int  theNum = rand.nextInt(3) - 1;
//        return questions[theNum];
//    }
//    private boolean Correct(int Choice) {
//        /**Checks the players choice **/
//        if (Choice == 0) {
//            return true;
//        }
//        return false;
//    }



//    private boolean Correct(int Choice) {
//        /**Checks the players choice **/
//        if (Choice == 0) {
//            return True;
//        }
//        return False;
//    }

    



}
