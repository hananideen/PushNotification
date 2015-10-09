package com.pushnotification.app;

import android.app.Application;

import com.pushnotification.helper.ParseUtils;

/**
 * Created by Hananideen on 9/10/2015.
 */
public class MyApplication extends Application {

    private static MyApplication mInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        mInstance = this;

        // register with parse
        ParseUtils.registerParse(this);
    }


    public static synchronized MyApplication getInstance() {
        return mInstance;
    }
}
