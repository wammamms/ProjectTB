package com.seventyseven.projecttb.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.seventyseven.projecttb.R;
import com.seventyseven.projecttb.model.adapter.ActionAdapter;
import com.seventyseven.projecttb.model.bean.Product;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ArrayList<Product> list = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initData();
        initView(root);
        return root;
    }

    private void initData() {
        Product p = new Product("苹果","又脆又甜","",12.5);
        list.add(p);
    }

    private void initView(View root) {

        RecyclerView rv = root.findViewById(R.id.rv_action);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new ActionAdapter());
    }
}