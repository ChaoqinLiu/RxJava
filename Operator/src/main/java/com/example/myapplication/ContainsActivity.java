package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;


public class ContainsActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        Observable.just(1,2,3,4,5)
                .contains(2)
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        System.out.println("contains(2): " + aBoolean);
                    }
                });

        Observable.just(1,2,3,4,5)
                .isEmpty()
                .subscribe(new Consumer<Boolean>() {
                    @Override
                    public void accept(Boolean aBoolean) throws Exception {
                        System.out.println("isEmpty():" + aBoolean);
                    }
                });
    }
}
