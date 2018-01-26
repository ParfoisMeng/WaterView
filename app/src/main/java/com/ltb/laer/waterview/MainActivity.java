package com.ltb.laer.waterview;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Toast;

import com.ltb.laer.waterview.adapter.WaterAdapter;
import com.ltb.laer.waterview.model.Water;
import com.ltb.laer.waterview.view.WaterView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    private WaterView mWaterView;

    private List<Water> mWaters = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            mWaters.add(new Water((int) (i + Math.random() * 4), "item" + i));
        }
    }

    private Toast toast;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mWaterView = findViewById(R.id.wv_water);
        mWaterView.setWaterAdapter(new WaterAdapter(this, mWaters));
        mWaterView.setOnItemClickListener(new WaterView.OnItemClickListener() {
            @Override
            public void onItemClick(int index) {
                if (index < 0 || index > mWaters.size()) {
                    return;
                }
                if (null != toast) {
                    toast.cancel();
                }
                toast = Toast.makeText(MainActivity.this, mWaters.get(index).getName() + "\n" + mWaters.get(index).getNumber(), Toast.LENGTH_SHORT);
                toast.show();
            }
        });
    }

    public void onRest(View view) {
        mWaterView.setWaterAdapter(new WaterAdapter(this, mWaters));
    }
}
