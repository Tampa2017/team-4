
package com.example.tkixi.team4good;

/**
 * Created by Riley on 10/20/2017.
 */
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.TextView;

import java.util.Random;

public class Game extends AppCompatActivity {

    Button button2, button3, button4, button5;
    TextView textView4;

    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_game);
        button2 = (Button) findViewById(R.id.button);
        button3 = (Button) findViewById(R.id.button);
        button4 = (Button) findViewById(R.id.button);
        button5 = (Button) findViewById(R.id.button);
        textView4 = (TextView) findViewById(R.id.textView);

        button2.setText("hello");


    }
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
