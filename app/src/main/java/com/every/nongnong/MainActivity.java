package com.every.nongnong;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import com.every.nongnong.activities.HomeActivity;
import com.every.nongnong.activities.LoginActivity;
import com.every.nongnong.activities.MyPageActivity;
import com.every.nongnong.application.NongApp;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        registListener();

    }

    private void registListener() {
        findViewById(R.id.login).setOnClickListener(this);
        findViewById(R.id.mypage).setOnClickListener(this);
        findViewById(R.id.home).setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {

        switch (v.getId()){
            case R.id.login:
                startActivity(NongApp.LOGIN);
                break;
            case R.id.mypage:
                startActivity(NongApp.MYPAGE);
                break;
            case R.id.home:
                startActivity(NongApp.HOME);
                break;
        }
    }

    private void startActivity(String to){

        Intent intent = null;

        switch (to){
            case NongApp.LOGIN :
                intent = new Intent(MainActivity.this, LoginActivity.class);
                break;
            case NongApp.MYPAGE :
                intent = new Intent(MainActivity.this, MyPageActivity.class);
                break;
            case NongApp.HOME :
                intent = new Intent(MainActivity.this, HomeActivity.class);
                break;
        }

        startActivity(intent);
    }
}
