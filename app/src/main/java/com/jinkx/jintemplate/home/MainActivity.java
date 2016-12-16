package com.jinkx.jintemplate.home;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentTransaction;

import com.ashokvarma.bottomnavigation.BottomNavigationBar;
import com.ashokvarma.bottomnavigation.BottomNavigationItem;
import com.jinkx.jintemplate.R;
import com.jinkx.jintemplate.base.activity.ActivityUtils;
import com.jinkx.jintemplate.base.activity.BaseNoToolbarActivity;
import com.jinkx.jintemplate.mvp_test.HomeFragment;

import butterknife.BindView;

public class MainActivity extends BaseNoToolbarActivity {
    @BindView(R.id.bottom_nav_bar)
    BottomNavigationBar bottomNavigationBar;
    private Fragment mCurrentContent;
    private HomeFragment homeFragment;
    private NewsFragment newsFragment;
    private MeFragment meFragment;
    @Override
    public int getLayoutResId() {
        return R.layout.activity_main;
    }

    @Override
    public void initFragment(Bundle savedInstanceState) {
        initBottom();

        //初始化
        mCurrentContent = homeFragment = HomeFragment.newInstance();
        ActivityUtils.addFragmentToActivity(mFragmentManager, mCurrentContent,R.id.container,HomeFragment.TAG);
    }

    private void initBottom(){
        bottomNavigationBar.addItem(new BottomNavigationItem(R.mipmap.menu_yy,"首页"))
                .addItem(new BottomNavigationItem(R.mipmap.menu_dt,"消息"))
                .addItem(new BottomNavigationItem(R.mipmap.menu_my,"我的"))
                .initialise();
        bottomNavigationBar.setTabSelectedListener(new BottomNavigationBar.SimpleOnTabSelectedListener() {
            @Override
            public void onTabSelected(int position) {
                onSelectFragment(position);
            }
        });
    }

    private void onSelectFragment(int position) {
        switch (position) {
            case 0:
                if (homeFragment == null) {
                    homeFragment = homeFragment.newInstance();
                }
                switchContent(mCurrentContent, homeFragment, HomeFragment.TAG);
                break;
            case 1:
                if (newsFragment == null) {
                    newsFragment = NewsFragment.newInstance();
                }
                switchContent(mCurrentContent, newsFragment, NewsFragment.TAG);
                break;
            case 2:
                if (meFragment == null) {
                    meFragment = MeFragment.newInstance();
                }
                switchContent(mCurrentContent, meFragment, MeFragment.TAG);
                break;
            default:
                break;
        }
    }

    private void switchContent(Fragment from, Fragment to, String tag) {
        if (mCurrentContent != to) {
            mCurrentContent = to;
            FragmentTransaction transaction = mFragmentManager.beginTransaction().setCustomAnimations(
                    android.R.anim.fade_in, android.R.anim.fade_out);
            if (!to.isAdded()) {    // 先判断是否被add过
                transaction.hide(from).add(R.id.container, to, tag).commitAllowingStateLoss(); // 隐藏当前的fragment，add下一个到Activity中
            } else {
                transaction.hide(from).show(to).commitAllowingStateLoss(); // 隐藏当前的fragment，显示下一个
            }
        }
    }
}
