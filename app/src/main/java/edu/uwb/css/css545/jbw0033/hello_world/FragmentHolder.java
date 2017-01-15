package edu.uwb.css.css545.jbw0033.hello_world;

import android.support.v4.app.FragmentActivity;
import android.os.Bundle;
import android.support.v4.view.ViewPager;

public class FragmentHolder extends FragmentActivity {

    static final int NUM_ITEMS = 2;

    FragmentPager mAdapter;

    ViewPager mPager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_pager);

        mAdapter = new FragmentPager(getSupportFragmentManager());

        mPager = (ViewPager) findViewById(R.id.viewPager);
        mPager.setAdapter(mAdapter);
    }
}
