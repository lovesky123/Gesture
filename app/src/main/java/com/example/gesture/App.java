package com.example.gesture;

import android.app.Application;

import com.example.gesture.utils.ContextUtils;

/**
 * 作者：xin on 2018/7/9 0009 15:03
 * <p>
 * 邮箱：ittfxin@126.com
 * <p>
 * https://github.com/wzx54321/XinFrameworkLib
 */

public class App extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ContextUtils.init(this);
    }
}
