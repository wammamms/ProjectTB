package com.seventyseven.projecttb.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.seventyseven.projecttb.R;
import com.seventyseven.projecttb.model.bean.Product;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

import static com.seventyseven.projecttb.MyApplication.getContext;

public class commonAdapter extends RecyclerView.Adapter<commonAdapter.ViewHolder> {

    private List<Product> list = new ArrayList<Product>();

    public void setList(ArrayList<Product> list){
        this.list = list;
    }

    public void updateList(ArrayList<Product> list){
        this.list = list;
        this.notifyDataSetChanged();
    }

    @NonNull
    @Override
    public commonAdapter.ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(),R.layout.item_shoppingcar,parent);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull commonAdapter.ViewHolder holder, int position) {
        Glide.with(getContext()).load(list.get(position).getPicture()).asBitmap().into(holder.img);
        holder.price.setText(String.valueOf('￥'+list.get(position).getPrice()));
        holder.title.setText(list.get(position).getName());
        holder.count.setText(String.valueOf('×'+list.get(position).getCount()));
        holder.total.setText(String.valueOf('￥'+list.get(position).getCount()*list.get(position).getPrice()));
        holder.sub.setOnClickListener(view -> {
            if(list.get(position).getCount() > 1) {
                list.get(position).setCount(list.get(position).getCount() - 1);
            }
            else{
                LitePal.deleteAll(Product.class,"name = ?",list.get(position).getName());
                list.get(position).delete();
            }
            notifyDataSetChanged();
        });
    }

    @Override
    public int getItemCount() {
        return 0;
    }

    public static class ViewHolder extends RecyclerView.ViewHolder{
        ImageView img;
        TextView title;
        TextView price;
        TextView count;
        TextView total;
        Button sub;
        public ViewHolder(View view){
            super(view);
            img = (ImageView)view.findViewById(R.id.img);
            title = (TextView)view.findViewById(R.id.title);
            price = (TextView)view.findViewById(R.id.price);
            count = (TextView)view.findViewById(R.id.count);
            total = (TextView)view.findViewById(R.id.total);
            sub = (Button)view.findViewById(R.id.sub);
        }
    }
}
