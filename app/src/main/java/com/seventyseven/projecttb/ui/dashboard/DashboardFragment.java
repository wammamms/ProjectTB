package com.seventyseven.projecttb.ui.dashboard;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.seventyseven.projecttb.R;
import com.seventyseven.projecttb.adapter.commonAdapter;
import com.seventyseven.projecttb.model.bean.Product;

import org.litepal.LitePal;

import java.util.ArrayList;
import java.util.List;

public class DashboardFragment extends Fragment {

    double total = 0;
    ArrayList<Product> list0 = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_dashboard, container, false);
        RecyclerView rv = root.findViewById(R.id.rv);
        TextView tv = root.findViewById(R.id.price_total);
        RecyclerView.LayoutManager rvlm = new LinearLayoutManager(getContext(), LinearLayoutManager.VERTICAL, false);
        rv.setLayoutManager(rvlm);
        List<Product> list;
        list = LitePal.findAll(Product.class);
        for (Product element:list) {
            total+= element.getCount()*element.getPrice();
        }
        tv.setText(String.valueOf(total));
        list0.addAll(list);
        commonAdapter adapter = new commonAdapter(list0);
        rv.setAdapter(adapter);
        return root;
    }
}