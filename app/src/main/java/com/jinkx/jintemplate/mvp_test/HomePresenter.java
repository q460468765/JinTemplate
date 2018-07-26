package com.jinkx.jintemplate.mvp_test;

import com.jinkx.jintemplate.base.api.ApiServices;
import com.jinkx.jintemplate.base.api.HttpServices;

import io.reactivex.android.schedulers.AndroidSchedulers;
import io.reactivex.disposables.Disposable;
import io.reactivex.functions.Consumer;
import io.reactivex.schedulers.Schedulers;

/**
 * Created by jinkx on 2016/12/16.
 */

public class HomePresenter implements HomeContract.Presenter{
    HomeContract.IView iView;
    private Disposable disposable;
    public HomePresenter(HomeContract.IView iView) {
        this.iView = iView;
    }

    @Override
    public void getHeadIcom() {
        disposable = HttpServices.createApi(ApiServices.class).getHeadIcom()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnNext(new Consumer<HomeHeadBean>() {
                    @Override
                    public void accept(HomeHeadBean homeHeadBean) throws Exception {
                        iView.showLoading();
                    }
                })
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(new Consumer<HomeHeadBean>() {
                    @Override
                    public void accept(HomeHeadBean homeHeadBean) throws Exception {
                        iView.successLoad(homeHeadBean);
                    }

                }, new Consumer<Throwable>() {
                    @Override
                    public void accept(Throwable throwable) throws Exception {
                        iView.hideLoading();
                    }
                });
    }

    @Override
    public void unBind() {
        if(disposable != null){
            disposable.dispose();
        }
    }
}
