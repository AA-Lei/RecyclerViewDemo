package com.example.recyclerviewdemo.RecyclerViewActivity;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.recyclerviewdemo.R;

import java.util.ArrayList;

public class MyRecyclerViewAdapter extends RecyclerView.Adapter<MyRecyclerViewAdapter.MyViewHodler> {

    private final Context context;
    private  ArrayList<String> dates;

    public MyRecyclerViewAdapter(Context context, ArrayList<String> dates) {
        this.context = context;
        this.dates = dates;
    }

    //相当于getview方法中创建view和viewholder
    @NonNull
    @Override
    public MyViewHodler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View itemView  = View.inflate(context, R.layout.item_recycelerview,null);
        return new MyViewHodler(itemView);
    }

//相当于getview绑定数据部分的代码
    //数据和view绑定
    @Override
    public void onBindViewHolder(@NonNull MyViewHodler holder, int position) {
            //根据位置得到对应的数据
        String date = dates.get(position);
        holder.tv_title.setText(date);
    }

//得到总条数
    @Override
    public int getItemCount() {
        return dates.size();
    }

    class MyViewHodler extends RecyclerView.ViewHolder{

        private ImageView iv_icon;
        private TextView tv_title;


        public MyViewHodler(@NonNull View itemView) {
            super(itemView);
            iv_icon = itemView.findViewById(R.id.iv_icon);
            tv_title = itemView.findViewById(R.id.tv_title);
        }
    }
}
