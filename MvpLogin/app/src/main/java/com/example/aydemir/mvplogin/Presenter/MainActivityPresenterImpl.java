package com.example.aydemir.mvplogin.Presenter;

import com.example.aydemir.mvplogin.Contracts.MainActivityContract;
import com.example.aydemir.mvplogin.Interactors.MainActivityInteractorImpl;

/**
 * Created by sony on 02.03.2018.
 */

public class MainActivityPresenterImpl implements MainActivityContract.MainActivityPresenter,MainActivityContract.LoginResultListener {

    MainActivityContract.MainActivityView view;
    MainActivityContract.MainActivityInteractor ınteractor;

    public MainActivityPresenterImpl(MainActivityContract.MainActivityView view,MainActivityContract.MainActivityInteractor mainActivityInteractor) {
        this.view=view;
        this.ınteractor=mainActivityInteractor;
    }

    @Override
    public void login(String user, String pass) {
        view.showProgress();
        ınteractor.doLogin(user,pass,this);

    }

    @Override
    public void loginSuccess() {
        view.navigateToHome();
        view.hideProgress();

    }

    @Override
    public void loginFailed() {
        view.showError();
        view.hideProgress();
    }

    @Override
    public void errorUserName() {
        view.hideProgress();
        view.setErrorUserName();
    }

    @Override
    public void errorUserPassword() {
        view.hideProgress();
        view.setErrorUserPassword();
    }
}
