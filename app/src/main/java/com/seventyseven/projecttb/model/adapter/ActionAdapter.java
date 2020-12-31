package com.seventyseven.projecttb.model.adapter;

import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.seventyseven.projecttb.R;
import com.seventyseven.projecttb.model.bean.Product;

import java.util.ArrayList;

public class ActionAdapter extends RecyclerView.Adapter<ActionAdapter.Holder> {

    private ArrayList<Product> list;

    public ActionAdapter(ArrayList<Product> list){
        this.list = list;
    }

    @Override
    public ActionAdapter.Holder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = View.inflate(parent.getContext(), R.layout.item_action, null);
        Holder holder = new Holder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(ActionAdapter.Holder holder, int position) {
        Glide.load();
        holder.name.setText(list.get(position).getName());
        holder.introduce.setText(list.get(position).getIntroduce());
        holder.price.setText("￥"+list.get(position).getPrice());
        holder.add.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Product p = list.get(position);
                p.setCount(p.getCount()+1);
                p.save();
            }
        });
    }

    @Override
    public int getItemCount() {
        return list.size();
    }


    public class Holder extends RecyclerView.ViewHolder{

        private final TextView name;
        private final TextView introduce;
        private final TextView price;
        private final ImageView image;
        private final ImageView add;

        public Holder(View itemView) {
            super(itemView);
            name = itemView.findViewById(R.id.tv_product_name);
            introduce = itemView.findViewById(R.id.tv_product_introduce);
            price = itemView.findViewById(R.id.tv_product_price);
            image = itemView.findViewById(R.id.item_action_iv);
            add = itemView.findViewById(R.id.iv_buy);
        }
    }
}
