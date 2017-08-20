package com.example.jittarin.liveat500px;

import android.app.Application;

import com.example.jittarin.liveat500px.bus.Contextor;


/**
 * Created by Jittarin on 8/20/2017.
 */

public class MainApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        Contextor.getInstance().init(getApplicationContext());
    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
