package com.example.recyclerviewdemo.RecyclerViewActivity;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import com.example.recyclerviewdemo.R;

import java.util.ArrayList;

public class RecyclerviewActivity extends Activity implements View.OnClickListener {
    private Button btn_add;
    private Button btn_delete;
    private Button btn_list;
    private Button btn_grid;
    private Button btn_flow;
    private RecyclerView recyclerView;
    //准备集合数据
    private ArrayList<String> dates;
    //创建适配器
    private MyRecyclerViewAdapter adapter;

    @SuppressLint("WrongConstant")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recyclerview);
        initview();
        //创建数据（集合数据）
        initdates();
        //设置recyclerview适配器
        adapter = new MyRecyclerViewAdapter(RecyclerviewActivity.this,dates);
        recyclerView.setAdapter(adapter);
        //LayoutManager
        recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerviewActivity.this,LinearLayoutManager.VERTICAL,false));

    }

    private void initdates() {
        dates = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            dates.add("context_" + i);
        }
    }

    private void initview() {
        btn_add = findViewById(R.id.btn_add);
        btn_delete = findViewById(R.id.btn_delete);
        btn_list = findViewById(R.id.btn_list);
        btn_grid = findViewById(R.id.btn_grid);
        btn_flow = findViewById(R.id.btn_flow);
        recyclerView = findViewById(R.id.recyclerview);

        btn_add.setOnClickListener(this);
        btn_delete.setOnClickListener(this);
        btn_list.setOnClickListener(this);
        btn_grid.setOnClickListener(this);
        btn_flow.setOnClickListener(this);
    }

    @SuppressLint("WrongConstant")
    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_add:
                break;
            case R.id.btn_delete:
                break;
            case R.id.btn_list:
                recyclerView.setLayoutManager(new LinearLayoutManager(RecyclerviewActivity.this,LinearLayoutManager.VERTICAL,false));
                break;
            case R.id.btn_grid:
                recyclerView.setLayoutManager(new GridLayoutManager(RecyclerviewActivity.this,3,GridLayoutManager.VERTICAL,false));
                break;
            case R.id.btn_flow:
                recyclerView.setLayoutManager(new StaggeredGridLayoutManager(3,StaggeredGridLayoutManager.VERTICAL));
                break;
        }
    }
}
