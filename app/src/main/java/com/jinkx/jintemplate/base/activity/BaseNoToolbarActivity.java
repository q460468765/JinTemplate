package com.jinkx.jintemplate.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;

/**
 * Created by jinkx on 2016/12/16.
 */

public abstract class BaseNoToolbarActivity extends BaseActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initFragment(savedInstanceState);
    }
}
