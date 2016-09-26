package com.example.itsadmin.criminalintent;

import android.content.Context;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;

/**
 * Created by itsadmin on 9/26/2016.
 */
public class CrimeLab {

    private static CrimeLab sCrimeLab;
    private ArrayList<Crime> mCrimes;
    private Context mAppContext;

    private CrimeLab(Context ctx)
    {
        mAppContext = ctx;
        mCrimes = new ArrayList<Crime>();
        for(int i = 0; i < 100; i++){
            Crime c = new Crime();
            c.setTitle("Crime# : "+(i+1));
            c.setSolved(i%2 == 0);
            mCrimes.add(c);
        }
    }

    public static CrimeLab get(Context c)
    {
        if(sCrimeLab == null)
        {
            sCrimeLab = new CrimeLab(c.getApplicationContext());
        }
        return sCrimeLab;
    }

    public ArrayList<Crime> getCrimes()
    {
        return mCrimes;
    }

    public Crime getCrime(UUID id)
    {
        for (Crime c:mCrimes
             ) {
            if(c.getUUID().equals(id))
                return c;
        }
        return null;
    }
}
