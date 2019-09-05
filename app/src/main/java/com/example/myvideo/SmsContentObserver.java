package com.example.myvideo;

import android.content.ContentResolver;
import android.content.Context;
import android.database.ContentObserver;
import android.database.Cursor;
import android.os.Handler;
import android.os.Message;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/510:06
 * desc   :
 * package: MyVideo:
 */
public class SmsContentObserver extends ContentObserver {
    private Handler handler;
    private Context context;


    public SmsContentObserver(Handler handler, Handler handler1, Context context) {
        super(handler);
        this.handler = handler1;
        this.context = context;
    }

    @Override
    public void onChange(boolean selfChange) {
        super.onChange(selfChange);
        ContentResolver contentResolver = context.getContentResolver();


    }
}
