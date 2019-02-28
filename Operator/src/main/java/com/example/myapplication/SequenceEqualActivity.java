package com.example.myapplication;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import io.reactivex.Observable;
import io.reactivex.functions.BiPredicate;
import io.reactivex.functions.Consumer;

public class SequenceEqualActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        /*Observable.sequenceEqual(
                //Observable.just(1,2,3,4,5),
                Observable.just(1,2,3,4,5,6),
                Observable.just(1,2,3,4,5)
        ).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) throws Exception {
                System.out.println("sequenceEqual: " + aBoolean);
            }
        });*/

        //sequenceEqual第三个参数，可以传递用于比较两个数据项是否相同，适用于复杂的对象
        Observable.sequenceEqual(
                Observable.just(1, 2, 3, 4, 5),
                Observable.just(1, 2, 3, 4, 5),
                new BiPredicate<Integer, Integer>() {
                    @Override
                    public boolean test(Integer integer, Integer integer2) throws Exception {
                        return integer == integer2;
                    }
                }
        ).subscribe(new Consumer<Boolean>() {
            @Override
            public void accept(Boolean aBoolean) throws Exception {
                System.out.println("sequenceEqual: " + aBoolean);
            }
        });
    }
}
