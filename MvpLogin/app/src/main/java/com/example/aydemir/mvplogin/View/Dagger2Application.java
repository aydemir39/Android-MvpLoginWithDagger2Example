package com.example.aydemir.mvplogin.View;

import android.app.Activity;
import android.app.Application;


import com.example.aydemir.mvplogin.Injectors.DaggerAppComponent;

import javax.inject.Inject;

import dagger.android.AndroidInjector;
import dagger.android.DispatchingAndroidInjector;
import dagger.android.HasActivityInjector;
import dagger.android.support.DaggerAppCompatActivity;

/**
 * Created by sony on 03.03.2018.
 */

public class Dagger2Application extends Application implements HasActivityInjector {

    @Inject
    DispatchingAndroidInjector<Activity> dispatchingAndroidInjector;

    @Override
    public void onCreate() {
        super.onCreate();

        DaggerAppComponent

                .builder()
                .application(this)
                .build()
                .inject(this);


    }

    @Override
    public AndroidInjector<Activity> activityInjector() {
        return dispatchingAndroidInjector;
    }
}
