package com.example.myvideo;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.ListView;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/418:55
 * desc   :
 * package: MyVideo:
 */
public class MyListView extends ListView {
    public MyListView(Context context) {
        super(context);
    }

    public MyListView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i = MeasureSpec.makeMeasureSpec(Integer.MAX_VALUE >> 2, MeasureSpec.AT_MOST);
        super.onMeasure(widthMeasureSpec, i);
    }
}
