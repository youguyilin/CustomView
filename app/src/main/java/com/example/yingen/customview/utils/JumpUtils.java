package com.example.yingen.customview.utils;

import android.content.Context;
import android.content.Intent;

import com.example.yingen.customview.Model.Rings;
import com.example.yingen.customview.RingProgressActivity;
import com.example.yingen.customview.StickyItemActivity;

/**
 * Created by chuyingen on 2018/4/11.
 * email youguyilin@126.com.
 */

public class JumpUtils {

    /**
     * 吸附item的RecyclerView
     * @param mContext
     */
    public static void stickyItemActivity(Context mContext){
        mContext.startActivity(new Intent(mContext, StickyItemActivity.class));
    }

    public static void ringProgressActivity(Context mContext){
        mContext.startActivity(new Intent(mContext, RingProgressActivity.class));

    }
}
