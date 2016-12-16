package com.jinkx.jintemplate.base.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.TextView;

import com.jinkx.jintemplate.R;

import butterknife.BindView;

/**
 * Created by jinkx on 2016/12/16.
 */

public abstract class BaseToolbarActivity extends BaseActivity{
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.title_center)
    TextView title_center;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        initToolbar();
        initFragment(savedInstanceState);
    }

    private void initToolbar(){
        toolbar.setNavigationIcon(R.mipmap.back);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    protected void setTitleCenter(String title){
        title_center.setText(title);
    }
}
