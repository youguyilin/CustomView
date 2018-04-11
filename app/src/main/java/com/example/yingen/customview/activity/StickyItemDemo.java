package com.example.yingen.customview.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.yingen.customview.R;

/**
 * Created by chuyingen on 2018/3/27.
 * email youguyilin@126.com.
 */

public class StickyItemDemo extends AppCompatActivity {
    private RecyclerView mRecyclerView;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_stickyitem);
        mRecyclerView = findViewById(R.id.recycler);
        initData();
    }

    private void initData() {
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this,LinearLayoutManager.VERTICAL,false));


    }


}
