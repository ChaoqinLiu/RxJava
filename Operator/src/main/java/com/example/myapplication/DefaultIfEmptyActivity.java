package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;

public class DefaultIfEmptyActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        Observable.just(1,2,3)
                .defaultIfEmpty(6)
                .subscribe(new Consumer<Object>() {

                    @Override
                    public void accept(Object o) throws Exception{
                        System.out.println("defaultIfEmpty:" + o);
                    }
                });
    }
}
