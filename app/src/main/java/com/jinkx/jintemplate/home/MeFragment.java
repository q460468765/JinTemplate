package com.jinkx.jintemplate.home;

import android.os.Bundle;

import com.jinkx.jintemplate.R;
import com.jinkx.jintemplate.base.fragment.BaseFragment;

/**
 * Created by jinkx on 2016/12/16.
 */

public class MeFragment extends BaseFragment {
    public static final String TAG =MeFragment.class.getSimpleName();
    public static MeFragment newInstance() {

        Bundle args = new Bundle();

        MeFragment fragment = new MeFragment();
        fragment.setArguments(args);
        return fragment;
    }
    @Override
    public int getLayoutResId() {
        return R.layout.fragment_me;
    }
}
