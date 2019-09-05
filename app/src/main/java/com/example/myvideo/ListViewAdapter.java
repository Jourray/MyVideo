package com.example.myvideo;

import android.app.Activity;
import android.app.IntentService;
import android.app.Service;
import android.content.ContentProvider;
import android.content.ContentResolver;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.os.Handler;
import android.os.IBinder;
import android.os.Message;
import android.support.v7.widget.RecyclerView;
import android.telecom.Call;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * author : ZhiG
 * e-mail : 1120121044@163.com
 * date   : 2019/9/416:09
 * desc   :
 * package: MyVideo:
 */
public class ListViewAdapter extends BaseAdapter {
    private List<String> list;
    private Context context;

    public ListViewAdapter(List<String> list, Context context) {
        this.list = list;
        this.context = context;
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHodler holder = null;
        if (convertView == null) {
            convertView = LayoutInflater.from(context).inflate(R.layout.item, null);
            holder = new ViewHodler();
            holder.url = convertView.findViewById(R.id.tv);
            convertView.setTag(holder);
        } else {
            holder = (ViewHodler) convertView.getTag();
            holder.url.setText(list.get(position));
        }
        return convertView;
    }

    class ViewHodler {
        TextView url;
    }
}
