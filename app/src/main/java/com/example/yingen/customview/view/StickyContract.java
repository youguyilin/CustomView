package com.example.yingen.customview.view;

import android.view.View;

/**
 * Created by chuyingen on 2018/3/27.
 * email youguyilin@126.com.
 */

public interface StickyContract {
    boolean isStickyView(View view);
    int getStickyViewType();//需要吸附的View一般都会有两个item type;
}
