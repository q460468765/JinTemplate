package com.jinkx.jintemplate.mvp_test;

import retrofit2.http.GET;
import rx.Observable;

/**
 * Created by jinkx on 2016/12/16.
 */

public interface HomeApiServices {
    @GET("api/services/Assistant/pictures/QueryIocnList")
    Observable<HomeHeadBean> getHeadIcom();
}
