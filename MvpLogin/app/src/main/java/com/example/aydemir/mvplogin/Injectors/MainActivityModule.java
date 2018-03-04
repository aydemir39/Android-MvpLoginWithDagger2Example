package com.example.aydemir.mvplogin.Injectors;

import com.example.aydemir.mvplogin.Contracts.MainActivityContract;
import com.example.aydemir.mvplogin.Interactors.MainActivityInteractorImpl;
import com.example.aydemir.mvplogin.Presenter.MainActivityPresenterImpl;
import com.example.aydemir.mvplogin.View.MainActivity;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

/**
 * Created by sony on 03.03.2018.
 */
@Module
public class MainActivityModule {
    @Provides
    MainActivityContract.MainActivityView provideMainActivityView(MainActivity mainActivity) {

        return mainActivity;
    }
    @Provides
    MainActivityContract.MainActivityInteractor provideMainActivityView2() {

        return new MainActivityInteractorImpl();
    }

    @Provides
    MainActivityContract.MainActivityPresenter providePresenter(MainActivityContract.MainActivityView view,MainActivityContract.MainActivityInteractor mainActivityInteractor) {
        return new MainActivityPresenterImpl(view,mainActivityInteractor);
    }
}
