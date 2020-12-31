package com.seventyseven.projecttb.adapter;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import androidx.databinding.DataBindingUtil;
import com.seventyseven.projecttb.databinding.ItemFenquGridLayoutBinding;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Metadata(
        mv = {1, 1, 16},
        bv = {1, 0, 3},
        k = 1,
        d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010!\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B!\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0004H\u0016J\u0010\u0010\t\u001a\u00020\n2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\u0010\u0010\f\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\u0004H\u0016J\"\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u000b\u001a\u00020\u00042\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00060\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"},
        d2 = {"Lcom/example/onlinemarket/adapter/GridViewAdapter;", "Landroid/widget/BaseAdapter;", "picList", "", "", "nameList", "", "(Ljava/util/List;Ljava/util/List;)V", "getCount", "getItem", "", "position", "getItemId", "", "getView", "Landroid/view/View;", "convertView", "parent", "Landroid/view/ViewGroup;", "app_debug"}
)
public final class GridViewAdapter extends BaseAdapter {
    private final List picList;
    private final List nameList;

    @NotNull
    public View getView(int position, @Nullable View convertView, @NotNull ViewGroup parent) {
        Intrinsics.checkParameterIsNotNull(parent, "parent");
        ItemFenquGridLayoutBinding binding = (ItemFenquGridLayoutBinding)DataBindingUtil.inflate(LayoutInflater.from(parent.getContext()), 1300009, parent, false);
        Intrinsics.checkExpressionValueIsNotNull(binding, "binding");
        binding.setPic((Integer)this.picList.get(position));
        binding.setName((String)this.nameList.get(position));
        View var10000 = binding.getRoot();
        Intrinsics.checkExpressionValueIsNotNull(var10000, "binding.root");
        return var10000;
    }

    @NotNull
    public Object getItem(int position) {
        return this.nameList.get(position);
    }

    public long getItemId(int position) {
        return (long)position;
    }

    public int getCount() {
        return this.nameList.size();
    }

    public GridViewAdapter(@NotNull List picList, @NotNull List nameList) {
        Intrinsics.checkParameterIsNotNull(picList, "picList");
        Intrinsics.checkParameterIsNotNull(nameList, "nameList");
        super();
        this.picList = picList;
        this.nameList = nameList;
    }
}
