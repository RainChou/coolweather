package com.example.coolweather.util;

import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by RainChou on 2017/1/14.
 */

public class HttpUtil {
    public static void sendOkHttpRewuest(String address,okhttp3.Callback callback) {
        OkHttpClient client =new OkHttpClient();
        Request request=new Request.Builder().url(address).build();
        client.newCall(request).enqueue(callback);
    }

}
