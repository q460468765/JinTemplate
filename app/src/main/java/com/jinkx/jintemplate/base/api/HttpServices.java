package com.jinkx.jintemplate.base.api;

import com.jinkx.jintemplate.utils.Constants;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Author: jinkx
 * Date: 2016/12/23 10:39
 * Describe：
 */
public class HttpServices {

    private static Retrofit retrofit = null;
    private static OkHttpClient okHttpClient = new OkHttpClient().newBuilder()
            .addInterceptor(new HttpLoggingInterceptor().setLevel(HttpLoggingInterceptor.Level.BODY))
            .build();

    public static <T> T createApi(Class<T> clazz, String url) {
        retrofit = new Retrofit.Builder()
                .baseUrl(url)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(clazz);
    }

    public static <T> T createApi(Class<T> clazz) {
        retrofit = new Retrofit.Builder()
                .baseUrl(Constants.BASEURL)
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        return retrofit.create(clazz);
    }

}
