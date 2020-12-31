package com.seventyseven.projecttb.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.nostra13.universalimageloader.core.ImageLoader;
import com.zhouwei.mzbanner.holder.MZViewHolder;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0003J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J$\u0010\n\u001a\u00020\u000b2\b\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002H\u0016R\u0010\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"},
        d2 = {"Lcom/example/onlinemarket/adapter/BannerViewHolder;", "Lcom/zhouwei/mzbanner/holder/MZViewHolder;", "", "()V", "mImageView", "Landroid/widget/ImageView;", "createView", "Landroid/view/View;", "context", "Landroid/content/Context;", "onBind", "", "position", "", "data", "app_debug"}
)
public final class BannerViewHolder implements MZViewHolder {
    private ImageView mImageView;

    @NotNull
    public View createView(@Nullable Context context) {
        View var10000 = LayoutInflater.from(context).inflate(1300005, (ViewGroup)null);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "LayoutInflater.from(cont…layout.banner_item, null)");
        View view = var10000;
        View var10001 = view.findViewById(1000079);
        if (var10001 == null) {
            throw new TypeCastException("null cannot be cast to non-null type android.widget.ImageView");
        } else {
            this.mImageView = (ImageView)var10001;
            return view;
        }
    }

    public void onBind(@Nullable Context context, int position, @Nullable String data) {
        ImageLoader.getInstance().displayImage(data, this.mImageView);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBind(Context var1, int var2, Object var3) {
        this.onBind(var1, var2, (String)var3);
    }
}
