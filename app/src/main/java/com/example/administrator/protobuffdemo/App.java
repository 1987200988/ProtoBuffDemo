/*
 * Copyright (C) 2019 Baidu, Inc. All Rights Reserved.
 */
package com.example.administrator.protobuffdemo;

import android.app.Application;
import android.support.multidex.MultiDex;
import android.support.multidex.MultiDexApplication;

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        MultiDex.install(this);
    }
}
