package com.example.daggermvvm.di.main;

import androidx.lifecycle.ViewModel;

import com.example.daggermvvm.di.ViewModeKey;
import com.example.daggermvvm.ui.main.MainViewModel;

import dagger.Binds;
import dagger.Module;
import dagger.multibindings.IntoMap;

@Module
public abstract class MainViewModelModule {

    @Binds
    @IntoMap
    @ViewModeKey(MainViewModel.class)
    public abstract ViewModel bindMainViewModel(MainViewModel viewModel);
}
