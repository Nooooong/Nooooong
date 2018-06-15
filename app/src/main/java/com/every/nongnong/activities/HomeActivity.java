package com.every.nongnong.activities;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.every.nongnong.R;
import com.every.nongnong.adapters.TeamInfoAdapter;

import me.relex.circleindicator.CircleIndicator;

/**
 * Created by Dongju on 2018. 6. 10..
 */

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        ViewPager viewPager= null;
        viewPager = findViewById(R.id.home_teamList);
        viewPager.setAdapter(new TeamInfoAdapter(this));


        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicator);
        indicator.setViewPager(viewPager);
        //reset1

    }
}
