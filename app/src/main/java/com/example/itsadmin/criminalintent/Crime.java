package com.example.itsadmin.criminalintent;

import java.util.UUID;

/**
 * Created by itsadmin on 9/25/2016.
 */
public class Crime {

    private UUID mId;
    private String mTitle;

    public Crime()
    {
        mId = UUID.randomUUID();
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


}
