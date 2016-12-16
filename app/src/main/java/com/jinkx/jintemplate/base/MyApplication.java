package com.jinkx.jintemplate.base;

import android.app.Application;

/**
 * Created by jinkx on 2016/12/16.
 */

public class MyApplication extends Application {
    private MyApplication instance;

    public MyApplication getInstance() {
        return instance;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
    }
}
