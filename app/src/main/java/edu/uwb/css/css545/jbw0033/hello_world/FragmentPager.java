package edu.uwb.css.css545.jbw0033.hello_world;


import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Jeremy Woods on 1/15/2017.
 */

public class FragmentPager extends FragmentPagerAdapter {

    public FragmentPager(FragmentManager fm) {
        super(fm);
    }
    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return FragmentHolder.NUM_ITEMS;
    }
}
