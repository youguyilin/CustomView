package com.example.yingen.customview;

import android.content.Intent;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

import com.example.yingen.InputEditLayoutDemo;
import com.example.yingen.customview.Model.CakeValue;
import com.example.yingen.customview.Model.Rings;
import com.example.yingen.customview.view.CakeSurfaceView;
import com.example.yingen.customview.view.PieChartView;
import com.example.yingen.customview.view.RingsProgress;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Created by chuyingen on 2018/3/22.
 * email youguyilin@126.com.
 */

public class LunchActivity extends AppCompatActivity {
    private CakeSurfaceView mRingsProgress;
    private PieChartView pieChartNow;
    private Button mbtn;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lunch);
        mRingsProgress = findViewById(R.id.assets_pie_chart);
        pieChartNow = findViewById(R.id.assets_pie_chart_now);
        mbtn = findViewById(R.id.test);
        mbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(LunchActivity.this,InputEditLayoutDemo.class);
                startActivity(intent);
            }
        });
        initData();
    }

    private void initData() {
        List<CakeValue> itemBeanList = new ArrayList<>();
        itemBeanList.add(new CakeValue("可用余额",200,"#FABD3B"));
        itemBeanList.add(new CakeValue("待收总额",300,"#F9943C"));
        itemBeanList.add(new CakeValue("投资冻结",100,"#FFD822"));
        itemBeanList.add(new CakeValue("提现冻结",250,"#F7602B"));
        mRingsProgress.setData(itemBeanList);

        List<CakeValue> itemBeanLists = new ArrayList<>();
        itemBeanLists.add(new CakeValue("可用余额",100,"#FABD3B"));
        itemBeanLists.add(new CakeValue("待收总额",500,"#F9943C"));
        itemBeanLists.add(new CakeValue("投资冻结",200,"#FFD822"));
        itemBeanLists.add(new CakeValue("提现冻结",300,"#F7602B"));
        pieChartNow.setData(itemBeanLists);
    }
}
