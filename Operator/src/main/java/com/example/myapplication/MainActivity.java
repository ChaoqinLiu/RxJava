package com.example.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.Window;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_main);

        findViewById(R.id.btn_map).setOnClickListener(this);
        findViewById(R.id.btn_flatMap).setOnClickListener(this);
        findViewById(R.id.btn_groupBy).setOnClickListener(this);
        findViewById(R.id.btn_buffer).setOnClickListener(this);
        findViewById(R.id.btn_window).setOnClickListener(this);
        findViewById(R.id.btn_first).setOnClickListener(this);
        findViewById(R.id.btn_last).setOnClickListener(this);
        findViewById(R.id.btn_take).setOnClickListener(this);
        findViewById(R.id.btn_takelast).setOnClickListener(this);
    }

    @Override
    public void onClick(View v){
        if(v.getId() == R.id.btn_map){
            Intent intent = new Intent(this,MapActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_flatMap){
            Intent intent = new Intent(this,FlatMapActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_groupBy){
            Intent intent = new Intent(this,GroupByActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_buffer){
            Intent intent = new Intent(this,BufferActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_window){
            Intent intent = new Intent(this,WindowActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_first){
            Intent intent = new Intent(this,FirstActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_last){
            Intent intent = new Intent(this,LastActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_take){
            Intent intent = new Intent(this,TakeActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_takelast){
            Intent intent = new Intent(this,TakeLastActivity.class);
            startActivity(intent);
        }
    }
}
