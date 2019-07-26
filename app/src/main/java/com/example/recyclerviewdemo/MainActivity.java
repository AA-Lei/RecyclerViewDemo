package com.example.recyclerviewdemo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.example.recyclerviewdemo.RecyclerViewActivity.RecyclerviewActivity;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button btn_tz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn_tz = findViewById(R.id.btn_tz);
        btn_tz.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()){
            case R.id.btn_tz:
                tiaozhuan();
                break;
        }
    }

    private void tiaozhuan() {
        Intent intent = new Intent(MainActivity.this, RecyclerviewActivity.class);
        startActivity(intent);
    }
}
