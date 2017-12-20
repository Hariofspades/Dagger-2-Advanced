package com.hariofspades.dagger2advanced.application;

import android.app.Activity;
import android.app.Application;

import com.hariofspades.dagger2advanced.component.DaggerRandomUserComponent;
import com.hariofspades.dagger2advanced.component.RandomUserComponent;
import com.hariofspades.dagger2advanced.module.ContextModule;

import timber.log.Timber;

/**
 * Created by Hari on 20/12/17.
 */

public class RandomUserApplication extends Application {

    //add application name in Manifest file
    private RandomUserComponent randomUserApplicationComponent;

    public static RandomUserApplication get(Activity activity){
        return (RandomUserApplication) activity.getApplication();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        Timber.plant(new Timber.DebugTree());

        randomUserApplicationComponent = DaggerRandomUserComponent.builder()
                .contextModule(new ContextModule(this))
                .build();
    }

    public RandomUserComponent getRandomUserApplicationComponent(){
        return randomUserApplicationComponent;
    }
}
