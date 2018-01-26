package com.ltb.laer.waterview.adapter;

import android.content.Context;
import android.view.View;

import java.util.List;

/**
 * <pre>
 *     author : parfoismeng
 *     e-mail : youshi520000@163.com
 *     time   : 2018/01/24
 *     desc   : do_适配器基类
 *     version: 1.0
 * </pre>
 */
public abstract class BaseWaterAdapter {
    private List mList;
    private Context mContext;

    public BaseWaterAdapter(Context context, List list) {
        mList = list;
        mContext = context;
    }

    public boolean isEmpty() {
        return null == mList || mList.isEmpty();
    }

    public Context getContext() {
        return mContext;
    }

    public int getCount() {
        return mList.size();
    }

    public Object getItem(int position) {
        return mList.get(position);
    }

    public abstract View getView(int position);
}