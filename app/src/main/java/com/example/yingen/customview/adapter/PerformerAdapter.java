package com.example.yingen.customview.adapter;

import android.content.Context;
import android.content.MutableContextWrapper;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.webkit.WebView;
import android.widget.TextView;

import com.example.yingen.customview.Model.Performer;
import com.example.yingen.customview.R;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.locks.LockSupport;

/**
 * Created by chuyingen on 2018/4/11.
 * email youguyilin@126.com.
 */

public class PerformerAdapter extends RecyclerView.Adapter<RecyclerView.ViewHolder> {

    private Context mContext;

    private List<Performer>  mPerformers = new ArrayList<>();

    public PerformerAdapter(Context mContext, List<Performer> mPerformers) {
        this.mContext = mContext;
        this.mPerformers = mPerformers;
    }

    @Override
    public RecyclerView.ViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        if (viewType == 10) {
            return  new contentVH(LayoutInflater.from(mContext).inflate(R.layout.adapter_content,parent
                    ,false));
        } else {
            return  new TitleVH(LayoutInflater.from(mContext).inflate(R.layout.adapter_title,parent,false
            ));
        }
    }

    @Override
    public void onBindViewHolder(RecyclerView.ViewHolder holder, int position) {
         Performer mp = mPerformers.get(position);
         if (holder instanceof TitleVH) {
             ((TitleVH)holder).bindData(mp);
         } else {
             ((contentVH)holder).bindData(mp);
         }
    }

    @Override
    public int getItemCount() {
        return mPerformers.size();
    }

    @Override
    public int getItemViewType(int position) {
        return mPerformers.get(position).getItemType();
    }

    static class TitleVH extends RecyclerView.ViewHolder {
        TextView mTextView;

        public TitleVH(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_title);
            itemView.setTag(true);
        }

        public void bindData(Performer mPerformer){
            mTextView.setText(mPerformer.getName());
        }
    }

    static class contentVH extends RecyclerView.ViewHolder  {

        TextView mTextView;

        public contentVH(View itemView) {
            super(itemView);
            mTextView = itemView.findViewById(R.id.tv_content);
            itemView.setTag(false);
        }

        public void bindData(Performer mPerformer){
            mTextView.setText(mPerformer.getName());
        }
    }
}
