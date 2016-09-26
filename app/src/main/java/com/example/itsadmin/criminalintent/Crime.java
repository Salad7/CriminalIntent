package com.example.itsadmin.criminalintent;

import java.util.Date;
import java.util.UUID;

/**
 * Created by itsadmin on 9/25/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;
    private Date mDate;
    private boolean mSolved;

    public Crime()
    {
        mId = UUID.randomUUID();
        mDate = new Date();
    }

    public UUID getUUID()
    {
        return mId;
    }

    public String getTitle()
    {
        return mTitle;
    }

    public void setTitle(String s)
    {
        mTitle = s;
    }
    public Date getDate()
    {
        return mDate;
    }
    public void setDate(Date d)
    {
        mDate = d;
    }
    public boolean isSolved()
    {
        return mSolved;
    }
    public void setSolved(boolean s)
    {
        mSolved = s;
    }


}
