package com.seventyseven.projecttb.ui.home;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.seventyseven.projecttb.R;
import com.seventyseven.projecttb.adapter.BannerViewHolder;
import com.seventyseven.projecttb.model.adapter.ActionAdapter;
import com.seventyseven.projecttb.model.bean.Product;
import com.zhouwei.mzbanner.MZBannerView;
import com.zhouwei.mzbanner.holder.MZHolderCreator;

import java.util.ArrayList;

public class HomeFragment extends Fragment {

    ArrayList<Product> list = new ArrayList<>();
    ArrayList<String> bannerList = new ArrayList<>();

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_home, container, false);
        initData();
        initView(root);
        return root;
    }

    private void initData() {
        Product p0 = new Product("苹果","又脆又甜","https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fa1.att.hudong.com%2F60%2F73%2F19300001208974132461736256243_950.jpg&refer=http%3A%2F%2Fa1.att.hudong.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1611988720&t=4d76a01aefa931b249ecdb9d2e5bb909",12.5);
        Product p1 = new Product("香蕉","又软又甜","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%8B%B9%E6%9E%9C&step_word=&hs=0&pn=8&spn=0&di=65450&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=2467399165%2C2458535836&os=1253416120%2C2377484529&simid=3451014450%2C476482579&adpicid=0&lpn=0&ln=1191&fr=&fmq=1609395209832_R&fm=&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fa1.att.hudong.com%2F60%2F73%2F19300001208974132461736256243_950.jpg%26refer%3Dhttp%3A%2F%2Fa1.att.hudong.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1611987216%26t%3Ddd0ea2f285e6780e552134199134c808&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Biw51jowr_z%26e3Bv54AzdH3Fetftpf_z%26e3B15%3Fowr76s%3Dippr_z2C%24qAzdH3FAzdH3Fxtgqtg2ywg2kw_z%26e3Bkwthj_z%26e3Bv54AzdH3Fw6ptvsj-8dnnma_z%26e3Bip4s&gsm=9&rpstart=0&rpnum=0&islist=&querylist=&force=undefined",13.5);
        Product p2 = new Product("桃子","水嫩多汁","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%8B%B9%E6%9E%9C&step_word=&hs=0&pn=8&spn=0&di=65450&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=2467399165%2C2458535836&os=1253416120%2C2377484529&simid=3451014450%2C476482579&adpicid=0&lpn=0&ln=1191&fr=&fmq=1609395209832_R&fm=&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fa1.att.hudong.com%2F60%2F73%2F19300001208974132461736256243_950.jpg%26refer%3Dhttp%3A%2F%2Fa1.att.hudong.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1611987216%26t%3Ddd0ea2f285e6780e552134199134c808&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Biw51jowr_z%26e3Bv54AzdH3Fetftpf_z%26e3B15%3Fowr76s%3Dippr_z2C%24qAzdH3FAzdH3Fxtgqtg2ywg2kw_z%26e3Bkwthj_z%26e3Bv54AzdH3Fw6ptvsj-8dnnma_z%26e3Bip4s&gsm=9&rpstart=0&rpnum=0&islist=&querylist=&force=undefined",14.0);
        Product p3 = new Product("火龙果","红心更甜","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%8B%B9%E6%9E%9C&step_word=&hs=0&pn=8&spn=0&di=65450&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=2467399165%2C2458535836&os=1253416120%2C2377484529&simid=3451014450%2C476482579&adpicid=0&lpn=0&ln=1191&fr=&fmq=1609395209832_R&fm=&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fa1.att.hudong.com%2F60%2F73%2F19300001208974132461736256243_950.jpg%26refer%3Dhttp%3A%2F%2Fa1.att.hudong.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1611987216%26t%3Ddd0ea2f285e6780e552134199134c808&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Biw51jowr_z%26e3Bv54AzdH3Fetftpf_z%26e3B15%3Fowr76s%3Dippr_z2C%24qAzdH3FAzdH3Fxtgqtg2ywg2kw_z%26e3Bkwthj_z%26e3Bv54AzdH3Fw6ptvsj-8dnnma_z%26e3Bip4s&gsm=9&rpstart=0&rpnum=0&islist=&querylist=&force=undefined",16.5);
        Product p4 = new Product("荔枝","福建特产","https://image.baidu.com/search/detail?ct=503316480&z=0&ipn=d&word=%E8%8B%B9%E6%9E%9C&step_word=&hs=0&pn=8&spn=0&di=65450&pi=0&rn=1&tn=baiduimagedetail&is=0%2C0&istype=2&ie=utf-8&oe=utf-8&in=&cl=2&lm=-1&st=-1&cs=2467399165%2C2458535836&os=1253416120%2C2377484529&simid=3451014450%2C476482579&adpicid=0&lpn=0&ln=1191&fr=&fmq=1609395209832_R&fm=&ic=&s=undefined&hd=&latest=&copyright=&se=&sme=&tab=0&width=&height=&face=undefined&ist=&jit=&cg=&bdtype=0&oriquery=&objurl=https%3A%2F%2Fgimg2.baidu.com%2Fimage_search%2Fsrc%3Dhttp%3A%2F%2Fa1.att.hudong.com%2F60%2F73%2F19300001208974132461736256243_950.jpg%26refer%3Dhttp%3A%2F%2Fa1.att.hudong.com%26app%3D2002%26size%3Df9999%2C10000%26q%3Da80%26n%3D0%26g%3D0n%26fmt%3Djpeg%3Fsec%3D1611987216%26t%3Ddd0ea2f285e6780e552134199134c808&fromurl=ippr_z2C%24qAzdH3FAzdH3Fooo_z%26e3Biw51jowr_z%26e3Bv54AzdH3Fetftpf_z%26e3B15%3Fowr76s%3Dippr_z2C%24qAzdH3FAzdH3Fxtgqtg2ywg2kw_z%26e3Bkwthj_z%26e3Bv54AzdH3Fw6ptvsj-8dnnma_z%26e3Bip4s&gsm=9&rpstart=0&rpnum=0&islist=&querylist=&force=undefined",7.5);
        list.add(p0);
        list.add(p1);
        list.add(p2);
        list.add(p3);
        list.add(p4);
    }

    private void initView(View root) {
        bannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2Fattach.66rpg.com%2Fbbs%2Fattachment%2Fforum%2F201607%2F28%2F105622etzdo7n1s19a7d1m.jpg&refer=http%3A%2F%2Fattach.66rpg.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1611988636&t=f5089a265b1c32b5f3404a003e248069");
        bannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180402%2F30cf34603277467b999714dac8b90233.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1611988643&t=ac70fa35b84b7276757e562272203832");
        bannerList.add("https://gimg2.baidu.com/image_search/src=http%3A%2F%2F5b0988e595225.cdn.sohucs.com%2Fimages%2F20180402%2F30cf34603277467b999714dac8b90233.jpeg&refer=http%3A%2F%2F5b0988e595225.cdn.sohucs.com&app=2002&size=f9999,10000&q=a80&n=0&g=0n&fmt=jpeg?sec=1611988643&t=ac70fa35b84b7276757e562272203832");
        MZBannerView banner = root.findViewById(R.id.banner);
        banner.setPages(bannerList,new MZHolderCreator<BannerViewHolder>() {
            @Override
            public BannerViewHolder createViewHolder() {
                return new BannerViewHolder();
            }
        });

        RecyclerView rv = root.findViewById(R.id.rv_action);
        LinearLayoutManager layoutManager = new LinearLayoutManager(getContext());
        layoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rv.setLayoutManager(layoutManager);
        rv.setAdapter(new ActionAdapter(list));
    }
}