package com.example.rxjava;

import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.ObservableSource;
import io.reactivex.functions.BiFunction;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public class JoinActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        Observable<Integer> o1 = Observable.just(1,2,3);
        Observable<Integer> o2 = Observable.just(4,5,6);

        o1.join(o2, new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(@NonNull Integer integer) throws Exception {
                return Observable.just(String.valueOf(integer)).delay(200, TimeUnit.MILLISECONDS);
            }
        }, new Function<Integer, ObservableSource<String>>() {
            @Override
            public ObservableSource<String> apply(@NonNull Integer integer) throws Exception {
                return Observable.just(String.valueOf(integer)).delay(200, TimeUnit.MILLISECONDS);
            }
        }, new BiFunction<Integer, Integer, String>() {
            @Override
            public String apply(@NonNull Integer integer1, Integer integer2) throws Exception{
                return integer1 + ":" + integer2;
            }
        }).subscribe(new Consumer<String>() {
            @Override
            public void accept(String s) throws Exception {
                System.out.println("onNext: " + s);
            }
        });

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
