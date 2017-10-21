package com.example.tkixi.team4good;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

/**
 * Created by Tkixi on 10/21/17.
 */

public class Spotlight extends AppCompatActivity{
    Button home;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_spotlight);

        home = (Button) findViewById(R.id.goHome);

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(Spotlight.this, MainActivity.class));
            }
        });

    }
}
