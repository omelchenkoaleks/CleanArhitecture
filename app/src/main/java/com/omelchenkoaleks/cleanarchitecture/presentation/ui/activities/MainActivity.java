package com.omelchenkoaleks.cleanarchitecture.presentation.ui.activities;

import android.os.Bundle;

import com.omelchenkoaleks.cleanarchitecture.R;
import com.omelchenkoaleks.cleanarchitecture.presentation.presenters.MainPresenter.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity implements View {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    @Override
    public void showProgress() {

    }

    @Override
    public void hideProgress() {

    }

    @Override
    public void showError(String message) {

    }
}
