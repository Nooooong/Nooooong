package com.every.nongnong.application;

import android.app.Application;

/**
 * Created by Dongju on 2018. 6. 10..
 */

public class NongApp extends Application {


    public static final String HOME = "home";
    public static final String LOGIN = "login";
    public static final String MYPAGE = "mypage";

    @Override
    public void onCreate() {
        super.onCreate();
    }
}
