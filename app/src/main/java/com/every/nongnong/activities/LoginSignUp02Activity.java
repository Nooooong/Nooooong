package com.every.nongnong.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.every.nongnong.R;

public class LoginSignUp02Activity extends AppCompatActivity{
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginsignup02);


        Button button = findViewById(R.id.login_signup02);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginSignUp02Activity.this ,LoginSignUp03Activity.class);//이동화면이 SignUp03로 가도록해야함
                startActivity(intent);
            }
        });
    }
}
