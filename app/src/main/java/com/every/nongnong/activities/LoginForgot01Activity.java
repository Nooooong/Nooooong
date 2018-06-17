package com.every.nongnong.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.every.nongnong.R;

public class LoginForgot01Activity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loginforgot01);


        Button button = findViewById(R.id.login_forgot01);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                Intent intent = new Intent(LoginForgot01Activity.this ,LoginLogin01Activity.class);
                startActivity(intent);
            }
        });//팝업을 띄우고, 확인 시 화면이동해야되는뎅
    }
}
