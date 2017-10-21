package com.example.tkixi.team4good;

import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.GestureDetectorCompat;
import android.support.v7.app.AppCompatActivity;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Collections;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class Game2 extends AppCompatActivity implements GestureDetector.OnGestureListener{

    Button button2, button3, button4, button5, home;
    TextView textView4, textView6, score,  myNum1;
    private GestureDetectorCompat GD;

    Player p1 = new Player(1);
    Player p2 = new Player(2);
    Random rand = new Random();
    Player curPlay = p1;

    String[] questions = {"something", "nothing", "hello"};
    String[][] answers = {{"ansA1", "ansA2", "ansA3", "ansA4"}, {"ansB1", "ansB2", "ansB3", "ansB4"}, {"ansC1", "ansC2", "ansC3", "ansC4"}};
    String answer;



    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);

        button2 = (Button) findViewById(R.id.button2);
        button3 = (Button) findViewById(R.id.button3);
        button4 = (Button) findViewById(R.id.button4);
        button5 = (Button) findViewById(R.id.button5);
        home = (Button) findViewById(R.id.home);
        textView4 = (TextView) findViewById(R.id.textView4);
        textView6 = (TextView) findViewById(R.id.textView6);
        score = (TextView) findViewById(R.id.score1);
        myNum1 = (TextView) findViewById(R.id.myNum1);


        createButton();


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Game2.this, MainActivity.class));
            }
        });

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button2.getText() == answer) {
                    curPlay.score++;
                    createButton();
                }
                else {
                    curPlay.lives--;
                    createButton();
                }
            }
        });

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button3.getText() == answer) {
                    curPlay.score++;
                    createButton();
                }
                else {
                    curPlay.lives--;
                    createButton();
                }
            }
        });

        button4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button4.getText() == answer) {
                    curPlay.score++;
                    createButton();
                }
                else {
                    curPlay.lives--;
                    createButton();
                }
            }
        });

        button5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (button5.getText() == answer) {
                    curPlay.score++;
                    createButton();
                }
                else {
                    curPlay.lives--;
                    createButton();
                }
            }
        });

    }

    private void createButton(){
        if(curPlay.lives > 0){
            int theNum = rand.nextInt(questions.length);
            answer = answers[theNum][0];
            int[] choices = {0,1,2,3};
            for (int i=0; i<choices.length; i++) {
                int randomPosition = rand.nextInt(choices.length);
                int temp = choices[i];
                choices[i] = choices[randomPosition];
                choices[randomPosition] = temp;
            }
            button2.setText(answers[theNum][choices[0]]);
            button3.setText(answers[theNum][choices[1]]);
            button4.setText(answers[theNum][choices[2]]);
            button5.setText(answers[theNum][choices[3]]);
            textView4.setText(questions[theNum]);
            textView6.setText("" + curPlay.lives);
            score.setText(""+curPlay.score);
            myNum1.setText(""+curPlay.plNum);

        }
        else if (p1.lives == 0 && p2.lives > 0) {
            curPlay = p2;
            createButton();
        }
        else { // curplay lives == 0
            textView6.setText("0");
            if(p1.score > p2.score){
                Toast.makeText(Game2.this,"Player 1 wins (Player 1 Score: " +
                        Integer.toString(p1.score) + " || Player 2 Score: " +
                        Integer.toString(p2.score),Toast.LENGTH_LONG).show();
            }
            else{ // player 2 wins
                Toast.makeText(Game2.this,"Player 2 wins (Player 1 Score: " +
                        Integer.toString(p1.score) + " || Player 2 Score: " +
                        Integer.toString(p2.score),Toast.LENGTH_LONG).show();
            }

        }

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




}
