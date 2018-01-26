package com.ltb.laer.waterview.adapter;

import android.content.Context;
import android.view.View;
import android.widget.TextView;

import com.ltb.laer.waterview.R;
import com.ltb.laer.waterview.model.Water;

import java.util.List;

/**
 * <pre>
 *     author : parfoismeng
 *     e-mail : mqh@yuanbei.biz
 *     time   : 2018/01/24
 *     desc   : do_示例的adapter
 *     version: 1.0
 * </pre>
 */
public class WaterAdapter extends BaseWaterAdapter {
    public WaterAdapter(Context context, List list) {
        super(context, list);
    }

    @Override
    public View getView(int position) {
        View view = View.inflate(getContext(), R.layout.water_item, null);
        TextView tv = view.findViewById(R.id.tv_water_name);
        TextView tv2 = view.findViewById(R.id.tv_water_number);

        Water water = (Water) getItem(position);
        tv.setText(water.getName());
        tv2.setText(water.getNumber() + "g");

        return view;
    }
}
