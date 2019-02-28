package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class AmbActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        Observable.ambArray(
                //第一个Observable延迟1秒后再发射数据
                Observable.just(1,2,3).delay(1,TimeUnit.SECONDS),
                //Observable.just(1,2,3),
                Observable.just(4,5,6)
        ).subscribe(new Consumer<Integer>() {
            @Override
            public void accept(Integer integer) throws Exception {
                System.out.println("integer: " + integer);
            }
        });
    }
}
