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


        Button button = findViewById(R.id.login_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginLogin01Activity.this ,HomeActivity.class);
                startActivity(intent);


            }
        });
        //회원가입 버튼에 대한 액션 만들어야 함! 버튼 id -> login_signin




    }

}
