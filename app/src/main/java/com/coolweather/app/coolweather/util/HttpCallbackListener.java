package com.coolweather.app.coolweather.util;

/**
 * Created by cc on 2017/1/1.
 */
public interface HttpCallbackListener {
    void onFinish(String response);

    void onError(Exception e);
}
