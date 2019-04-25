package com.e.fragment;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import Adapter.ViewPageAdapter;
import Fragment.FirstFragment;
import Fragment.FourthFragment;
import Fragment.SecondFragment;
import Fragment.ThirdFragment;


public class ViewPagerActivity extends AppCompatActivity {

    private ViewPager viewpage;
    private TabLayout tabId;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_view_pager);

        tabId = findViewById(R.id.tabId);
        viewpage = findViewById(R.id.viewpage);

        ViewPageAdapter adapter = new ViewPageAdapter(getSupportFragmentManager());
        adapter.addFragment(new FirstFragment(),"Sum");
        adapter.addFragment(new SecondFragment(),"Area of Circle");
        adapter.addFragment(new ThirdFragment(),"Simple Interest");
        adapter.addFragment(new FourthFragment(),"Simple Interest");




        viewpage.setAdapter(adapter);
        tabId.setupWithViewPager(viewpage);


    }
}
