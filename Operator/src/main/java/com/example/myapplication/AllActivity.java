package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Predicate;

public class AllActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        Observable.just(1,2,3,4,5)
                .all(new Predicate<Integer>() {
                    @Override
                    public boolean test(Integer integer) throws Exception {
                        return integer < 10;
                    }
                }).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) throws Exception {
                System.out.println(aBoolean);
            }
        });
    }
}
