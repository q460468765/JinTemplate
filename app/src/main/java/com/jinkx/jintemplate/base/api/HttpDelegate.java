package com.jinkx.jintemplate.base.api;

import rx.Subscription;
import rx.subscriptions.CompositeSubscription;

/**
 * Created by fangpenglin on 2016/12/19.
 * 处理rxjava的数据回传
 */
public abstract class HttpDelegate {
    private CompositeSubscription mCompositeSubscription;

    public void addSubscription(Subscription subscriber) {
        if (mCompositeSubscription == null) {
            mCompositeSubscription = new CompositeSubscription();
        }
        mCompositeSubscription.add(subscriber);
    }

    //RXjava取消注册，以避免内存泄露
    public void onUnsubscribe() {
        if (mCompositeSubscription != null && mCompositeSubscription.hasSubscriptions()) {
            mCompositeSubscription.unsubscribe();
        }
    }
}
