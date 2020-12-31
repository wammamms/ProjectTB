package com.seventyseven.projecttb.utils

import android.app.Activity
import android.content.Intent
import android.graphics.Color
import android.graphics.Paint
import android.view.View
import android.widget.GridView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.appcompat.widget.Toolbar
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.databinding.BindingAdapter
import androidx.lifecycle.ViewModelProviders
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.StaggeredGridLayoutManager
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout
import com.bumptech.glide.Glide
import com.seventyseven.projecttb.R
import com.seventyseven.projecttb.adapter.ActionAdapter
import com.seventyseven.projecttb.adapter.GridViewAdapter
import com.seventyseven.projecttb.adapter.RecommendAdapter
import com.seventyseven.projecttb.model.bean.Product
import com.seventyseven.projecttb.ui.LoginActivity
import com.seventyseven.projecttb.ui.home.HomeViewModel
import com.seventyseven.projecttb.viewmodel.SplashViewModel
import com.nostra13.universalimageloader.core.ImageLoader

class DatabindingHelper {

    companion object {
        @BindingAdapter("imageUrl")
        @JvmStatic
        fun loadImage(iv: ImageView, url: String?) {
            ImageLoader.getInstance().displayImage(url, iv)
        }

        @BindingAdapter("resId")
        @JvmStatic
        fun loadImageResource(iv: ImageView, resId: Int) {
            iv.setImageResource(resId)
        }


        @BindingAdapter("toolbar")
        @JvmStatic
        fun toolbarMenu(toolbar: Toolbar, menu: Int) {
            toolbar.inflateMenu(menu)
            toolbar.setOnMenuItemClickListener {
                when(it.itemId){
                    R.id.logout ->{
                        val intent= Intent(toolbar.context,LoginActivity::class.java)
                        (toolbar.context as Activity).startActivity(intent)
                        return@setOnMenuItemClickListener true
                    }
                    else ->{return@setOnMenuItemClickListener false}
                }
            }
        }

        @BindingAdapter(value = ["picList", "nameList"], requireAll = true)
        @JvmStatic
        fun loadGridView(
                gridView: GridView,
                picList: MutableList<Int>?,
                nameList: MutableList<String>?
        ) {
            if (picList.isNullOrEmpty() || nameList.isNullOrEmpty())
                return
            gridView.adapter = GridViewAdapter(picList, nameList)
        }

        @BindingAdapter("loadActivityBackground")
        @JvmStatic
        fun loadBActivityBackground(
                view: LinearLayout,
                i:Int
        ) {
            when (i) {
                0 -> {//促销
                    view.setBackgroundResource(R.drawable.bg_nomal_bitmap)
                }
                1 -> {//中秋
                    view.setBackgroundResource(R.drawable.bg_midautum_bitmap)
                }
                2 -> {//圣诞
                    view.setBackgroundResource(R.drawable.bg_chrismas_bitmap)
                }
            }
        }

        @BindingAdapter("loadActivityIcon")
        @JvmStatic
        fun loadCActivityBackground(
                view: ImageView,
                i:Int
        ) {
            when (i) {
                0 -> {//促销
                    view.setBackgroundResource(R.drawable.bg_nomal_bitmap)
                }
                1 -> {//中秋
                    view.setBackgroundResource(R.drawable.midautumicon)
                }
                2 -> {//圣诞
                    view.setBackgroundResource(R.drawable.chrismasoldmanicon)
                }
            }
        }
        @BindingAdapter("productList")
        @JvmStatic
        fun loadRecyclerView(
                recyclerView: RecyclerView,
                productList: MutableList<Product>?
        ) {
            if (productList.isNullOrEmpty())
                return

            val layoutManager = LinearLayoutManager(recyclerView.context)
            layoutManager.orientation = LinearLayoutManager.HORIZONTAL
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = ActionAdapter(productList as ArrayList<Product>)
        }

        @BindingAdapter("recommendList")
        @JvmStatic
        fun loadRecommendView(
            recyclerView: RecyclerView,
            productList: MutableList<Product>?
        ) {
            if (productList.isNullOrEmpty())
                return

            val layoutManager = StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL)
            recyclerView.layoutManager = layoutManager
            recyclerView.adapter = RecommendAdapter(productList as ArrayList<Product>)
        }

        @BindingAdapter("refreshData")
        @JvmStatic
        fun refresh(
            view: SwipeRefreshLayout,
            refreshData : HomeViewModel
        ) {
            view.setOnRefreshListener {
                view.isRefreshing = false
                refreshData.loadDatas()
            }
        }

        @BindingAdapter("isVisiable")
        @JvmStatic
        fun setVisiable(
            view: View,
            productList: MutableList<Product>?
        ) {
            if(productList.isNullOrEmpty())
                view.visibility = View.GONE
            else
                view.visibility = View.VISIBLE
        }

        @BindingAdapter("RecommendBg")
        @JvmStatic
        fun setRecommendBg(
                view : ConstraintLayout,
                actionType: Int
        ){
            when(actionType) {
                0 -> {
                    view.setBackgroundResource(R.drawable.bg_common)
                }
                1 -> {
                    view.setBackgroundResource(R.drawable.midautumn_recommend)
                }
                2 -> {
                    view.setBackgroundResource(R.drawable.chrismas_recommend)
                }
            }
        }

        @BindingAdapter("RecommendTextColor")
        @JvmStatic
        fun setRecommendTextColor(
                tv : TextView,
                actionType : Int
        ){
            when(actionType) {
                0->{
                    tv.setTextColor(Color.parseColor("#000000"))
                }
                2 ->{
                    tv.setTextColor(Color.parseColor("#FFFFFF"))
                }
                1 -> {
                    tv.setTextColor(Color.parseColor("#DA941F"))
                }
            }
        }

        @BindingAdapter("ActionTextBg")
        @JvmStatic
        fun setActionTextBg(
            tv : TextView,
            actionType : Int
        ){
            when(actionType) {
                1 -> {
                    tv.setBackgroundResource(R.drawable.bg_text_moon)
                }
                2->{
                    tv.setBackgroundResource(R.drawable.bg_text_christmas)
                }
            }
        }

        @BindingAdapter("ActionTextColor")
        @JvmStatic
        fun setActionTextColor(
            tv : TextView,
            actionType : Int
        ){
            when(actionType) {
                1 -> {
                    tv.setTextColor(Color.parseColor("#B61F1D"))
                }
                2->{
                    tv.setTextColor(Color.parseColor("#154C22"))
                }
            }
        }

        @BindingAdapter("priceType")
        @JvmStatic
        fun setTextType(
            view: TextView,
            flag : Boolean
        ) {
            if (flag) {
                view.paint.flags = Paint.STRIKE_THRU_TEXT_FLAG
                view.paint.isAntiAlias = true //抗锯齿
            }
        }

        @BindingAdapter("activityBanner")
        @JvmStatic
        fun setActivityBanner(
            view: ImageView,
            actionType : Int
        ) {
            when (actionType) {
                0 -> {
                    view.visibility = View.GONE
                }
                1 -> {
                    view.visibility = View.VISIBLE
                    Glide.with(view.context).load(R.drawable.bg_moon_banner).into(view)
                }
                2 -> {
                    view.visibility = View.VISIBLE
                    Glide.with(view.context).load(R.drawable.bg_christmas).into(view)
                }
            }
        }

        @BindingAdapter("activityBg")
        @JvmStatic
        fun setActivityBg(
            view: ImageView,
            actionType : Int
        ) {
            when (actionType) {
                0->{
                    Glide.with(view.context).load(R.drawable.bg_nomal).into(view)
                }
                1 -> {
                    Glide.with(view.context).load(R.drawable.bg_moon).into(view)
                }
                2 -> {
                    Glide.with(view.context).load(R.drawable.bg_christmas).into(view)
                }
            }
        }
    }
}