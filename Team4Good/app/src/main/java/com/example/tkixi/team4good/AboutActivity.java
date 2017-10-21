package com.example.tkixi.team4good;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by damoc on 10/20/2017.
 */



public class AboutActivity extends AppCompatActivity {
    Button home;
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        home = (Button) findViewById(R.id.button);
        mWebView = (WebView) findViewById(R.id.loadWeb);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("https://www.oceansdaughterconservation.com");


        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(AboutActivity.this, MainActivity.class));
            }
        });
    }
}
