package com.seventyseven.projecttb.adapter;

import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.databinding.DataBindingUtil;
import androidx.databinding.ViewDataBinding;
import androidx.recyclerview.widget.RecyclerView.Adapter;
import com.seventyseven.projecttb.databinding.ItemRecommendBinding;
import com.seventyseven.projecttb.model.bean.Product;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0015B\u001d\u0012\u0016\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006¢\u0006\u0002\u0010\u0007J\b\u0010\u000b\u001a\u00020\fH\u0016J\u0018\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u0018\u0010\u0011\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016R*\u0010\u0003\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0004j\b\u0012\u0004\u0012\u00020\u0005`\u0006X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0007¨\u0006\u0016"},
        d2 = {"Lcom/example/onlinemarket/adapter/RecommendAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/onlinemarket/adapter/RecommendAdapter$ViewHolder;", "lists", "Ljava/util/ArrayList;", "Lcom/example/onlinemarket/model/bean/Product;", "Lkotlin/collections/ArrayList;", "(Ljava/util/ArrayList;)V", "getLists", "()Ljava/util/ArrayList;", "setLists", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "ViewHolder", "app_debug"}
)
public final class RecommendAdapter extends Adapter {
    @NotNull
    private ArrayList lists;

    @NotNull
    public RecommendAdapter.ViewHolder onCreateViewHolder(@NotNull ViewGroup parent, int viewType) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        ViewDataBinding var10000 = DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), 1300004, parent, false);
        Intrinsics.checkExpressionValueIsNotNull(var10000, "DataBindingUtil.inflate(…t,\n                false)");
        ItemRecommendBinding mBinding = (ItemRecommendBinding)var10000;
        return new RecommendAdapter.ViewHolder(mBinding);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public androidx.recyclerview.widget.RecyclerView.ViewHolder onCreateViewHolder(ViewGroup var1, int var2) {
        return (androidx.recyclerview.widget.RecyclerView.ViewHolder)this.onCreateViewHolder(var1, var2);
    }

    public int getItemCount() {
        return this.lists.size();
    }

    public void onBindViewHolder(@NotNull RecommendAdapter.ViewHolder holder, int position) {
        Intrinsics.checkParameterIsNotNull(holder, "holder");
        Object var10001 = this.lists.get(position);
        Intrinsics.checkExpressionValueIsNotNull(var10001, "lists[position]");
        holder.bind((Product)var10001);
    }

    // $FF: synthetic method
    // $FF: bridge method
    public void onBindViewHolder(androidx.recyclerview.widget.RecyclerView.ViewHolder var1, int var2) {
        this.onBindViewHolder((RecommendAdapter.ViewHolder)var1, var2);
    }

    @NotNull
    public final ArrayList getLists() {
        return this.lists;
    }

    public final void setLists(@NotNull ArrayList var1) {
        Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
        this.lists = var1;
    }

    public RecommendAdapter(@NotNull ArrayList lists) {
        Intrinsics.checkParameterIsNotNull(lists, "lists");
        super();
        this.lists = lists;
    }

    @Metadata(
            mv = {1, 1, 16},
            bv = {1, 0, 3},
            k = 1,
            d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"},
            d2 = {"Lcom/example/onlinemarket/adapter/RecommendAdapter$ViewHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "mBinding", "Lcom/example/onlinemarket/databinding/ItemRecommendBinding;", "(Lcom/example/onlinemarket/databinding/ItemRecommendBinding;)V", "imageView", "Landroid/widget/ImageView;", "getImageView", "()Landroid/widget/ImageView;", "setImageView", "(Landroid/widget/ImageView;)V", "bind", "", "product", "Lcom/example/onlinemarket/model/bean/Product;", "app_debug"}
    )
    public static final class ViewHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @NotNull
        public ImageView imageView;
        private final ItemRecommendBinding mBinding;

        @NotNull
        public final ImageView getImageView() {
            ImageView var10000 = this.imageView;
            if (var10000 == null) {
                Intrinsics.throwUninitializedPropertyAccessException("imageView");
            }

            return var10000;
        }

        public final void setImageView(@NotNull ImageView var1) {
            Intrinsics.checkParameterIsNotNull(var1, "<set-?>");
            this.imageView = var1;
        }

        public final void bind(@NotNull Product product) {
            Intrinsics.checkParameterIsNotNull(product, "product");
            ImageView var10001 = this.mBinding.itemActionIv;
            Intrinsics.checkExpressionValueIsNotNull(var10001, "mBinding.itemActionIv");
            this.imageView = var10001;
            this.mBinding.setData(product);
            this.mBinding.executePendingBindings();
        }

        public ViewHolder(@NotNull ItemRecommendBinding mBinding) {
            Intrinsics.checkParameterIsNotNull(mBinding, "mBinding");
            super(mBinding.getRoot());
            this.mBinding = mBinding;
        }
    }
}