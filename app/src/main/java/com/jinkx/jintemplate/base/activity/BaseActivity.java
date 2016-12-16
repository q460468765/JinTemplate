package com.jinkx.jintemplate.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import com.jinkx.jintemplate.base.MyApplication;

import butterknife.ButterKnife;
import butterknife.Unbinder;

/**
 * Created by jinkx on 2016/12/16.
 * 基类
 */

public abstract class BaseActivity extends AppCompatActivity{
    protected MyApplication myApplication;
    protected FragmentManager mFragmentManager;
    protected Unbinder unBinder;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        myApplication = (MyApplication) getApplication();
        mFragmentManager = getSupportFragmentManager();
        setContentView(getLayoutResId());

        unBinder = ButterKnife.bind(this);
        ActivityUtils.addActivity(this.getClass().getSimpleName(), this);
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        ActivityUtils.removeActivity(this.getClass().getSimpleName());
        unBinder.unbind();
        unBinder = null;
    }

    public abstract int getLayoutResId();

    public abstract void initFragment(Bundle savedInstanceState);

    protected void showToastTip(String message){
        Toast.makeText(this, message, Toast.LENGTH_SHORT).show();
    }
}
