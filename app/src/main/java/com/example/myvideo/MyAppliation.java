package com.example.myvideo;

import android.app.Application;
import android.os.Looper;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/420:00
 * desc   :
 * package: MyVideo:
 */
public class MyAppliation extends Application implements Thread.UncaughtExceptionHandler {
    @Override
    public void onCreate() {
        super.onCreate();
        Thread.setDefaultUncaughtExceptionHandler(this);
    }

    @Override
    public void uncaughtException(Thread t, Throwable e) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                Looper.prepare();
                Looper.loop();
            }
        }).start();
        android.os.Process.killProcess(android.os.Process.myPid());
    }
}
