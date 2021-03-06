package com.test.xyz.daggersample1.di.module;

import com.test.xyz.daggersample1.service.api.RepoListService;
import com.test.xyz.daggersample1.service.api.WeatherService;
import com.test.xyz.daggersample1.service.impl.RepoListServiceManager;
import com.test.xyz.daggersample1.service.impl.WeatherServiceManager;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class CommonModule {

    @Provides
    @Singleton
    WeatherService provideWeatherService() {
        return new WeatherServiceManager();
    }

    @Provides
    @Singleton
    RepoListService provideRepoListService() {
        return new RepoListServiceManager();
    }
}
