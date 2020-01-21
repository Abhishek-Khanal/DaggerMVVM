package com.example.daggermvvm.ui.main;

import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelProviders;

import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.widget.ImageView;

import com.bumptech.glide.RequestManager;
import com.example.daggermvvm.R;
import com.example.daggermvvm.viewmodels.ViewModelProviderFactory;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {
    private MainViewModel viewModel;

    @Inject
    ViewModelProviderFactory providerFactory;

    @Inject
    Drawable logo;

    @Inject
    RequestManager requestManager;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewModel= new ViewModelProvider(this,providerFactory).get(MainViewModel.class);

        //setLogo();
    }
    //    private void setLogo() {
//        requestManager
//                .load(logo)
//                .into(R.id.something);
//    }
}
