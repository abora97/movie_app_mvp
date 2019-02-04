package com.example.abora.movie_app_mvp.ui.splash;

public interface SplashContract {

    interface Presenter {
        void detachView();
    }
    interface View{

        void startActivityMethod();
    }

}
