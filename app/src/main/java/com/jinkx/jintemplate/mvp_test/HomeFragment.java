package com.jinkx.jintemplate.mvp_test;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.widget.TextView;

import com.jinkx.jintemplate.R;
import com.jinkx.jintemplate.base.activity.Preconditions;
import com.jinkx.jintemplate.base.fragment.BaseFragment;

import butterknife.BindView;

/**
 * Created by jinkx on 2016/12/16.
 */

public class HomeFragment extends BaseFragment implements HomeContract.IView{
    public static final String TAG =HomeFragment.class.getSimpleName();
    HomeContract.Presenter presenter;
    @BindView(R.id.textView)
    TextView textView;
    public static HomeFragment newInstance() {

        Bundle args = new Bundle();

        HomeFragment fragment = new HomeFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        //初始化路由，并访问网络
        presenter = new HomePresenter(this);
        presenter.getHeadIcom();
    }

    @Override
    public int getLayoutResId() {
        return R.layout.fragment_home;
    }

    @Override
    public void setPresenter(HomeContract.Presenter presenter) {
        presenter = Preconditions.checkNotNull(presenter);
    }

    @Override
    public void successLoad(HomeHeadBean bean) {
        textView.setText(bean.getResult().getIconList().toString());
    }

    @Override
    public void showLoading() {
        //这里可以应设置菊花框加载
        showToastTip("访问网络开始");
    }

    @Override
    public void hideLoading() {
        //这里可以应设置隐藏菊花加载框
        showToastTip("访问网络结束");
    }
}
