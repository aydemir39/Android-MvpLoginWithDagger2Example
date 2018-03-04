package com.example.aydemir.mvplogin.View;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.Toast;

import com.example.aydemir.mvplogin.Contracts.MainActivityContract;
import com.example.aydemir.mvplogin.Presenter.MainActivityPresenterImpl;
import com.example.aydemir.mvplogin.R;

import javax.inject.Inject;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;
import dagger.android.AndroidInjection;

public class MainActivity extends AppCompatActivity implements MainActivityContract.MainActivityView {

    @BindView(R.id.editText)
    EditText editText1;
    @BindView(R.id.editText2)
    EditText editText2;
    @BindView(R.id.button)
    Button btn;
    @OnClick(R.id.button)
    void clickButton(View view){
        presenter.login(editText1.getText().toString().trim(),editText2.getText().toString().trim());
    }
    @BindView(R.id.progressBar)
    ProgressBar progressBar;


    @Inject
    MainActivityContract.MainActivityPresenter presenter;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        AndroidInjection.inject(this);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
    }

    @Override
    public void showProgress() {
        progressBar.setVisibility(View.VISIBLE);
        btn.setEnabled(false);
    }

    @Override
    public void hideProgress() {
        progressBar.setVisibility(View.INVISIBLE);
        btn.setEnabled(true);
    }

    @Override
    public void navigateToHome() {

        startActivity(new Intent(this,HomeActivity.class));
        finish();
    }

    @Override
    public void showError() {
        Toast.makeText(this,"Hatalı kullanıcı adı veya şifre",Toast.LENGTH_LONG).show();
    }

    @Override
    public void setErrorUserName() {
        editText1.setError("Lütfen boş bırakmayınız");
    }

    @Override
    public void setErrorUserPassword() {
        editText2.setError("Lütfen boş bırakmayınız");
    }
}
