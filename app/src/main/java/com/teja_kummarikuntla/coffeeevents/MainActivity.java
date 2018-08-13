package com.teja_kummarikuntla.coffeeevents;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.design.widget.*;

import com.teja_kummarikuntla.coffeeevents.controller.EvPagerAdapter;

public class MainActivity extends AppCompatActivity {
    private ViewPager viewPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.viewpagerID);
        viewPager.setAdapter(new EvPagerAdapter(getSupportFragmentManager()));

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tablayoutID);
        tabLayout.setupWithViewPager(viewPager);
    }
}
