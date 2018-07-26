package com.jinkx.jintemplate.base.api;

import com.jinkx.jintemplate.mvp_test.HomeHeadBean;

import io.reactivex.Observable;
import retrofit2.http.GET;

/**
 * Author: jinkx
 * Date: 2018/7/26 15:09
 * Describe：
 */

public interface ApiServices {
    //获取图标列表
    @GET("api/services/Assistant/pictures/QueryIocnList")
    Observable<HomeHeadBean> getHeadIcom();
}
