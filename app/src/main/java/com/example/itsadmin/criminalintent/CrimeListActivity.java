package com.example.itsadmin.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by itsadmin on 9/26/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
