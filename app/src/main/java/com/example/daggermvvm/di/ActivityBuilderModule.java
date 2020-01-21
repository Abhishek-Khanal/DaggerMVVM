package com.example.daggermvvm.di;

import com.example.daggermvvm.di.main.MainViewModelModule;
import com.example.daggermvvm.ui.main.MainActivity;

import dagger.Module;
import dagger.android.ContributesAndroidInjector;

@Module
public abstract class ActivityBuilderModule {

    @ContributesAndroidInjector(
            modules = {
                    MainViewModelModule.class
            }
    )
    abstract MainActivity contributesMainActivity();
}
