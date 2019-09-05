package com.example.myvideo;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/419:08
 * desc   :
 * package: MyVideo:
 */
public class MyParce  implements Parcelable {
    private int nData;

    protected MyParce(Parcel in) {
        nData = in.readInt();
    }

    public static final Creator<MyParce> CREATOR = new Creator<MyParce>() {
        @Override
        public MyParce createFromParcel(Parcel in) {
            return new MyParce(in);
        }

        @Override
        public MyParce[] newArray(int size) {
            return new MyParce[size];
        }
    };

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeInt(nData);
    }
}
