package com.jinkx.jintemplate.home;

import android.os.Bundle;

import com.jinkx.jintemplate.R;
import com.jinkx.jintemplate.base.fragment.BaseFragment;

/**
 * Created by jinkx on 2016/12/16.
 */

public class NewsFragment extends BaseFragment {
    public static final String TAG =NewsFragment.class.getSimpleName();
    public static NewsFragment newInstance() {

        Bundle args = new Bundle();

        NewsFragment fragment = new NewsFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_news;
    }
}
