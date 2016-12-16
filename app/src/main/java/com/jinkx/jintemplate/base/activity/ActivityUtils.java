package com.jinkx.jintemplate.base.activity;

import android.support.annotation.NonNull;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;

import java.util.HashMap;

import static com.jinkx.jintemplate.base.activity.Preconditions.checkNotNull;

/**
 * Created by linfp on 2016/5/10.
 * 用于管理Fragment跳转
 */
public class ActivityUtils {

    /**
     * Activity管理类,记录所有未杀死的activity
     */
    private static HashMap<String, AppCompatActivity> mActivityHashMap = new HashMap<>();

    /**
     * The {@code fragment} is added to the container view with id {@code frameId}. The operation is
     * performed by the {@code fragmentManager}.
     */
    public static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                             @NonNull Fragment fragment, int frameId, String tag) {
        addFragmentToActivity(fragmentManager, fragment, frameId, tag, 0, 0);
    }

    private static void addFragmentToActivity(@NonNull FragmentManager fragmentManager,
                                              @NonNull Fragment fragment, int frameId, String tag, int animStar, int animEnd) {
        checkNotNull(fragmentManager);
        checkNotNull(fragment);
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        transaction.add(frameId, fragment, tag)
                .commitAllowingStateLoss();
    }

    /**
     * 存储activity
     *
     * @param key      (xxx.class.getSimpleName())
     * @param activity (xxx)
     */
    public static void addActivity(String key, AppCompatActivity activity) {
        if (mActivityHashMap != null && !mActivityHashMap.containsKey(key)) {
            mActivityHashMap.put(key, activity);
        }
    }

    /**
     * 获取该activity实例
     *
     * @param key (xxx.class.getSimpleName())
     * @return 某个实例activity
     */
    public static AppCompatActivity getActivity(String key) {
        AppCompatActivity activity = null;
        if (mActivityHashMap != null && mActivityHashMap.containsKey(key)) {
            activity = mActivityHashMap.get(key);
        }
        return activity;
    }

    /**
     * 杀死activity
     *
     * @param key (xxx.class.getSimpleName())
     *            杀死某一个activity
     */
    public static void killActivity(String key) {
        AppCompatActivity activity = getActivity(key);
        if (activity != null) {
            activity.finish();
        }
    }

    /**
     * 移除activity(并未杀掉activity)
     *
     * @param key (xxx.class.getSimpleName())
     */
    public static void removeActivity(String key) {
        AppCompatActivity activity = getActivity(key);
        if (activity != null) {
            mActivityHashMap.remove(key);
        }
    }

    public static void removeAllActivity() {
        for (String key : mActivityHashMap.keySet()) {
            mActivityHashMap.get(key).finish();
        }
    }

    /**
     * 杀掉程序并退出
     */
    public static void exit() {
        for (String key : mActivityHashMap.keySet()) {
            mActivityHashMap.get(key).finish();
        }
        android.os.Process.killProcess(android.os.Process.myPid());
        System.exit(0);
    }
}
