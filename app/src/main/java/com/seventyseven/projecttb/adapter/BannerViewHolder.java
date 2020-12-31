package com.seventyseven.projecttb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.ImageView;
import com.bumptech.glide.Glide;
import com.seventyseven.projecttb.R;
import com.zhouwei.mzbanner.holder.MZViewHolder;

public class BannerViewHolder implements MZViewHolder<String> {

    private ImageView mImageView = null;

    @Override
    public View createView(Context context) {
        View view = LayoutInflater.from(context).inflate(R.layout.banner_item, null);
        mImageView = view.findViewById(R.id.banner_image);
        return view;
    }

    @Override
    public void onBind(Context context, int position, String data) {
        Glide.with(context).load(data).into(mImageView);
    }
}