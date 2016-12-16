package com.jinkx.jintemplate.mvp_test;

import com.jinkx.jintemplate.base.api.HttpDelegate;
import com.jinkx.jintemplate.base.api.HttpServices;

import rx.Subscriber;
import rx.Subscription;
import rx.android.schedulers.AndroidSchedulers;
import rx.functions.Action0;
import rx.schedulers.Schedulers;

/**
 * Created by jinkx on 2016/12/16.
 */

public class HomePresenter extends HttpDelegate implements HomeContract.Presenter{
    HomeContract.IView iView;

    public HomePresenter(HomeContract.IView iView) {
        this.iView = iView;
    }

    @Override
    public void getHeadIcom() {
        Subscription subscription = HttpServices.createApi(HomeApiServices.class).getHeadIcom()
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .doOnSubscribe(new Action0() {
                    @Override
                    public void call() {
                        iView.showLoading();
                    }
                })
                .subscribeOn(AndroidSchedulers.mainThread())
                .subscribe(new Subscriber<HomeHeadBean>() {
                    @Override
                    public void onCompleted() {
                        iView.hideLoading();
                    }

                    @Override
                    public void onError(Throwable e) {
                        iView.hideLoading();
                    }

                    @Override
                    public void onNext(HomeHeadBean bean) {
                        iView.successLoad(bean);
                    }
                });
        addSubscription(subscription);
    }

    @Override
    public void unBind() {
        onUnsubscribe();
    }
}
