package com.example.tkixi.team4good;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

/**
 * A login screen that offers login via email/password.
 */
public class LoginActivity extends AppCompatActivity {
    EditText user,pwd;
    Button login;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        user = (EditText) findViewById(R.id.user);
        pwd = (EditText) findViewById(R.id.pwd);
        if(savedInstanceState!=null){
            user.setText(savedInstanceState.getString("user"));
            pwd.setText(savedInstanceState.getString("pwd"));
        }
        login = (Button) findViewById(R.id.login);
        login.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                String userString = user.getText().toString();
                String pwdString = pwd.getText().toString();
                if(TextUtils.isEmpty(userString)|| TextUtils.isEmpty(pwdString)){
                    Toast.makeText(LoginActivity.this,"you have not entry the username or password", Toast.LENGTH_LONG).show();
                    return;
                }
                if("123456".equals(userString)&&"123456".equals(pwdString)){
                    Toast.makeText(LoginActivity.this,"Welcome "+userString, Toast.LENGTH_LONG).show();
                    startActivity(new Intent(LoginActivity.this,MainActivity.class));
                    LoginActivity.this.finish();
                }
            }
        });
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putString("user",user.getText().toString());
        outState.putString("pwd",pwd.getText().toString());
    }
}

