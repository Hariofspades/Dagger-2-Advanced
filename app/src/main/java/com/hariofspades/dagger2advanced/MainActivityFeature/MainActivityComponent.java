package com.hariofspades.dagger2advanced.MainActivityFeature;

import com.hariofspades.dagger2advanced.adapter.RandomUserAdapter;
import com.hariofspades.dagger2advanced.component.RandomUserComponent;
import com.hariofspades.dagger2advanced.interfaces.RandomUsersApi;

import dagger.Component;

/**
 * Created by Hari on 20/12/17.
 */
@Component(modules = MainActivityModule.class, dependencies = RandomUserComponent.class)
@MainActivityScope
public interface MainActivityComponent {

    RandomUserAdapter getRandomUserAdapter();

    RandomUsersApi getRandomUserService();

}
