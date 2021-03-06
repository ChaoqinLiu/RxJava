package com.example.rxjava;

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
        findViewById(R.id.btn_skip).setOnClickListener(this);
        findViewById(R.id.btn_skipLast).setOnClickListener(this);
        findViewById(R.id.btn_elementAt).setOnClickListener(this);
        findViewById(R.id.btn_ignoreElement).setOnClickListener(this);
        findViewById(R.id.btn_distinct).setOnClickListener(this);
        findViewById(R.id.btn_filter).setOnClickListener(this);
        findViewById(R.id.btn_debounce).setOnClickListener(this);
        findViewById(R.id.btn_all).setOnClickListener(this);
        findViewById(R.id.btn_contains).setOnClickListener(this);
        findViewById(R.id.btn_amb).setOnClickListener(this);
        findViewById(R.id.btn_defaultIfEmpty).setOnClickListener(this);
        findViewById(R.id.btn_sequenceEqual).setOnClickListener(this);
        findViewById(R.id.btn_skipUntil).setOnClickListener(this);
        findViewById(R.id.btn_skipWhile).setOnClickListener(this);
        findViewById(R.id.btn_takeUntil).setOnClickListener(this);
        findViewById(R.id.btn_takeWhile).setOnClickListener(this);
        findViewById(R.id.btn_merge).setOnClickListener(this);
        findViewById(R.id.btn_zip).setOnClickListener(this);
        findViewById(R.id.btn_combineLatest).setOnClickListener(this);
        findViewById(R.id.btn_join).setOnClickListener(this);
        findViewById(R.id.btn_startWith).setOnClickListener(this);
        findViewById(R.id.btn_connect).setOnClickListener(this);
        findViewById(R.id.btn_refCount).setOnClickListener(this);
        findViewById(R.id.btn_replay).setOnClickListener(this);
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
        if(v.getId() == R.id.btn_skip){
            Intent intent = new Intent(this,SkipActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_skipLast){
            Intent intent = new Intent(this,SkipLastActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_elementAt){
            Intent intent = new Intent(this,ElementActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_ignoreElement){
            Intent intent = new Intent(this,IgnoreElementActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_distinct){
            Intent intent = new Intent(this,DistinctActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_filter){
            Intent intent = new Intent(this,FilterActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_debounce){
            Intent intent = new Intent(this,DebounceActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_all){
            Intent intent = new Intent(this,AllActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_contains){
            Intent intent = new Intent(this,ContainsActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_amb){
            Intent intent = new Intent(this,AmbActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_defaultIfEmpty){
            Intent intent = new Intent(this,DefaultIfEmptyActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_sequenceEqual){
            Intent intent = new Intent(this,SequenceEqualActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_skipUntil){
            Intent intent = new Intent(this,SkipUntilActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_skipWhile){
            Intent intent = new Intent(this,SkipWhileActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_takeUntil){
            Intent intent = new Intent(this,TakeUntilActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_takeWhile){
            Intent intent = new Intent(this,TakeWhileActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_merge){
            Intent intent = new Intent(this,MergeActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_zip){
            Intent intent = new Intent(this,ZipActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_combineLatest){
            Intent intent = new Intent(this,CombineLatestActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_join){
            Intent intent = new Intent(this,JoinActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_startWith){
            Intent intent = new Intent(this,StartActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_connect){
            Intent intent = new Intent(this,ConnectActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_refCount){
            Intent intent = new Intent(this,RefCountActivity.class);
            startActivity(intent);
        }
        if(v.getId() == R.id.btn_replay){
            Intent intent = new Intent(this,ReplayActivity.class);
            startActivity(intent);
        }
    }
}
