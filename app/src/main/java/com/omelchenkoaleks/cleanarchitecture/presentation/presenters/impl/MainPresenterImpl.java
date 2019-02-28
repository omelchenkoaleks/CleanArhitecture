package com.omelchenkoaleks.cleanarchitecture.presentation.presenters.impl;

import com.omelchenkoaleks.cleanarchitecture.domain.executor.Executor;
import com.omelchenkoaleks.cleanarchitecture.domain.executor.MainThread;
import com.omelchenkoaleks.cleanarchitecture.domain.interactors.SampleInteractor;
import com.omelchenkoaleks.cleanarchitecture.presentation.presenters.MainPresenter;
import com.omelchenkoaleks.cleanarchitecture.presentation.presenters.base.AbstractPresenter;

/**
 * Created by dmilicic on 12/13/15.
 */
public class MainPresenterImpl extends AbstractPresenter implements MainPresenter,
        SampleInteractor.Callback {

    private MainPresenter.View mView;

    public MainPresenterImpl(Executor executor,

                             MainThread mainThread,
                             View view) {
        super(executor, mainThread);
        mView = view;
    }

    @Override
    public void resume() {

    }

    @Override
    public void pause() {

    }

    @Override
    public void stop() {

    }

    @Override
    public void destroy() {

    }

    @Override
    public void onError(String message) {

    }
}
