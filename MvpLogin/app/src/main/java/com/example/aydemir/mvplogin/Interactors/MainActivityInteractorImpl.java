package com.example.aydemir.mvplogin.Interactors;

import android.os.Handler;

import com.example.aydemir.mvplogin.Contracts.MainActivityContract;

/**
 * Created by sony on 02.03.2018.
 */

public class MainActivityInteractorImpl implements MainActivityContract.MainActivityInteractor {
    public static final String USER = "alican";
    public static final String PASS = "1234";
    @Override
    public void doLogin(final String user, final String pass, final MainActivityContract.LoginResultListener listener) {
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                if (user.equals(USER) && pass.equals(PASS)) {
                    listener.loginSuccess();
                } else {
                    if(user.equals("")){
                        listener.errorUserName();}
                    if(pass.equals("")){
                        listener.errorUserPassword();}
                    if(!user.equals("")&&!pass.equals("")){listener.loginFailed();}

                }
            }
        }, 1500);

    }
}
