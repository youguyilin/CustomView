package com.example.yingen.customview.view;

import android.view.View;

/**
 * Created by chuyingen on 2018/3/27.
 * email youguyilin@126.com.
 */

public class BaseStickyView implements StickyContract {
    @Override
    public boolean isStickyView(View view) {
        return (Boolean)view.getTag();
    }

    @Override
    public int getStickyViewType() {
        return 11;
    }
}
