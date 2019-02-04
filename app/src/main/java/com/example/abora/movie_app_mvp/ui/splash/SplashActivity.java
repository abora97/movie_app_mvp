package com.example.abora.movie_app_mvp.ui.splash;


import android.content.Intent;
import android.os.Bundle;


import com.example.abora.movie_app_mvp.R;
import com.example.abora.movie_app_mvp.ui.base.BaseActivity;
import com.example.abora.movie_app_mvp.ui.main.MainActivity;

public class SplashActivity extends BaseActivity implements SplashContract.View {

    private SplashPresenter splashPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        splashPresenter = new SplashPresenter(this);
        splashPresenter.initialization();

    }

    @Override
    public void startActivityMethod() {
        startActivity(new Intent(SplashActivity.this, MainActivity.class));
        finish();
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        splashPresenter.detachView();
    }
}
