package com.example.aydemir.mvplogin.Contracts;

/**
 * Created by sony on 02.03.2018.
 */

public interface MainActivityContract {
    interface MainActivityView {
        void showProgress();

        void hideProgress();

        void navigateToHome();

        void showError();
        void setErrorUserName();
        void setErrorUserPassword();
    }

    interface MainActivityPresenter {
        void login(String user, String pass);
    }

    interface MainActivityInteractor {
        void doLogin(String user, String pass, LoginResultListener listener);
    }
    interface LoginResultListener{
        void loginSuccess();
        void loginFailed();
        void errorUserName();
        void errorUserPassword();
    }
}
