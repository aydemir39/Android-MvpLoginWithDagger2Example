package com.example.aydemir.mvplogin.Injectors;

import com.example.aydemir.mvplogin.View.MainActivity;

import javax.inject.Singleton;

import dagger.Subcomponent;
import dagger.android.AndroidInjector;

/**
 * Created by sony on 03.03.2018.
 */
@Singleton
@Subcomponent(modules =MainActivityModule.class)
public interface MainActivityComponent extends AndroidInjector<MainActivity> {
    @Subcomponent.Builder
    abstract class Builder extends AndroidInjector.Builder<MainActivity>{}
}
