package com.every.nongnong.activities;


import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.every.nongnong.R;

public class LoginLogin01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginlogin01);


        Button button1 = findViewById(R.id.login_login);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginLogin01Activity.this ,HomeActivity.class);
                startActivity(intent);


            }
        });

        Button button2 = findViewById(R.id.login_forgot);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginLogin01Activity.this ,LoginForgot01Activity.class);
                startActivity(intent);


            }
        });


        Button button3 = findViewById(R.id.login_signup01);

        button3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginLogin01Activity.this ,LoginSignUp01Activity.class);
                startActivity(intent);


            }
        });




    }

}
