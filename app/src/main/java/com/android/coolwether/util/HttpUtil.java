package com.android.coolwether.util;

import okhttp3.Callback;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/**
 * Created by liulixin on 2017/2/16.
 */

public class HttpUtil {

    public static void sendOkhttpRequest(String address, Callback callback) {
        OkHttpClient client = new OkHttpClient();

        client.newCall(new Request.Builder().url(address).build()).enqueue(callback);

    }
}
