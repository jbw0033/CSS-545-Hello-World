package edu.uwb.css.css545.jbw0033.hello_world;

import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * Created by Jeremy Woods on 1/15/2017.
 */

public class PageFragment extends Fragment {


    /**
     * Create a new instance of CountingFragment, providing "num"
     * as an argument.
     */
    static Fragment newInstance(int num) {
        if(num == 0) {
            return new PageOneFragment();
        }
        else if(num == 1) {
            return new PageTwoFragment();
        }
            return new PageTwoFragment();
    }


}
