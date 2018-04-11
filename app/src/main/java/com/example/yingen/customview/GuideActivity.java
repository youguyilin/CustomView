package com.example.yingen.customview;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.telephony.CellSignalStrengthWcdma;
import android.view.View;
import android.widget.Button;

import com.example.yingen.customview.utils.JumpUtils;

/**
 * Created by chuyingen on 2018/3/27.
 * email youguyilin@126.com.
 */

public class GuideActivity extends AppCompatActivity implements View.OnClickListener{
    private Button stickyItemDecoration;
    private Button btn1,btn2,btn3;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.guide_gui);
        initView();
    }

    private void initView() {
        stickyItemDecoration = findViewById(R.id.btn_1);
        btn1 = findViewById(R.id.btn_1);
        btn2 = findViewById(R.id.btn_2);
        btn3 = findViewById(R.id.btn_3);
        btn1.setOnClickListener(this);
        btn2.setOnClickListener(this);
        btn3.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case   R.id.btn_1:
                JumpUtils.stickyItemActivity(this);
                break;
            case R.id.btn_2:
                break;
            case R.id.btn_3:
                JumpUtils.ringProgressActivity(this);
                break;
        }
    }
}
