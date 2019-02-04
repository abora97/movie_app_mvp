package com.example.abora.movie_app_mvp.ui.splash;

import com.example.abora.movie_app_mvp.ui.base.BasePresenter;

public class SplashPresenter extends BasePresenter implements SplashContract.Presenter {

    private SplashContract.View view;

    SplashPresenter(SplashContract.View view) {
        this.view = view;
    }

    void initialization(){
        startActivityMethod();
    }

    void startActivityMethod() {
      new Thread() {
            @Override
            public void run() {
                try {
                    sleep(3000);
                    view.startActivityMethod();
                    super.run();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
            }
        }.start();
    }

    @Override
    public void detachView() {
        view = null;
    }
}
