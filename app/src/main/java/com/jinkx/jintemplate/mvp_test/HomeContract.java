package com.jinkx.jintemplate.mvp_test;

import com.jinkx.jintemplate.base.mvp.BasePresenter;
import com.jinkx.jintemplate.base.mvp.BaseView;

/**
 * Created by jinkx on 2016/12/16.
 */

public interface HomeContract {

    interface IView extends BaseView<Presenter>{
        //访问成功回调
        void successLoad(HomeHeadBean bean);
        //展示提示框
        void showLoading();
        //隐藏提示框
        void hideLoading();
    }


    interface Presenter extends BasePresenter{
        void getHeadIcom();
    }
}
