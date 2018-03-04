package com.example.aydemir.mvplogin.Injectors;

import android.app.Application;

import com.example.aydemir.mvplogin.View.Dagger2Application;

import dagger.BindsInstance;
import dagger.Component;
import dagger.android.AndroidInjectionModule;
import dagger.android.support.AndroidSupportInjectionModule;

/**
 * Created by sony on 03.03.2018.
 */


@Component(modules = {AndroidInjectionModule.class,AppModule.class,ActivityBuilder.class})
public interface AppComponent  {
    @Component.Builder
    interface Builder{
        @BindsInstance Builder application(Application application);
        AppComponent build();
    }
    void inject (Dagger2Application dagger2Application);
}

