package com.example.tkixi.team4good;

import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Tkixi on 10/21/17.
 */

public class ecoActivity extends AppCompatActivity {
    Button home;
    ImageView mImageView;
    CheckBox check1, check3, check5;
    TextView textTotal;
    int counter = 0;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_eco);

        check1 = (CheckBox) findViewById(R.id.check1);
        check3 = (CheckBox) findViewById(R.id.check3);
        check5 = (CheckBox) findViewById(R.id.check5);
        textTotal = (TextView) findViewById(R.id.textTotal);


        check1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                updateScore();            }
        });

        check3.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                updateScore();
            }
        });

        check5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                updateScore();
            }
        });





        home = (Button) findViewById(R.id.home);
        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(ecoActivity.this, MainActivity.class));
            }
        });
    }

    private void updateScore(){
        if(check1.isChecked()){
            counter = counter + 1;
        }

        if(check3.isChecked()){
            counter = counter + 3;
        }

        if(check5.isChecked()){
            counter = counter + 5;
        }


        textTotal.setText("Total Score: " + Integer.toString(counter));
    }

    static final int REQUEST_IMAGE_CAPTURE = 1;

    private void dispatchTakePictureIntent() {
        Intent takePictureIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
        if (takePictureIntent.resolveActivity(getPackageManager()) != null) {
            startActivityForResult(takePictureIntent, REQUEST_IMAGE_CAPTURE);
        }
    }
    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if (requestCode == REQUEST_IMAGE_CAPTURE && resultCode == RESULT_OK) {
            Bundle extras = data.getExtras();
            Bitmap imageBitmap = (Bitmap) extras.get("data");
            mImageView.setImageBitmap(imageBitmap);
        }
    }
}
