package com.example.aydemir.mvplogin.Injectors;

import android.app.Activity;

import com.example.aydemir.mvplogin.View.MainActivity;

import dagger.Binds;
import dagger.Module;
import dagger.android.ActivityKey;
import dagger.android.AndroidInjector;
import dagger.multibindings.IntoMap;

/**
 * Created by sony on 03.03.2018.
 */
@Module
public abstract class ActivityBuilder {
    @Binds
    @IntoMap
    @ActivityKey(MainActivity.class)
    abstract AndroidInjector.Factory<? extends Activity>bindMainActivity(MainActivityComponent.Builder builder);
}
