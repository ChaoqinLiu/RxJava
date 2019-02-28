package com.example.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;
import io.reactivex.observables.GroupedObservable;

public class GroupByActivity extends AppCompatActivity {

    private TextView text_groupby;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_groupby);

        text_groupby = findViewById(R.id.text_groupby);

        Observable.range(1, 8).groupBy(new Function<Integer, String>() {
            @Override
            public String apply(Integer integer) throws Exception{
                return (integer % 2 == 0) ? "偶数组" : "奇数组";
            }
        }).subscribe(new Consumer<GroupedObservable<String, Integer>>() {
            @Override
            public void accept(final GroupedObservable<String, Integer> stringIntegerGroupedObservable) throws Exception {

                //System.out.println("group name: " + stringIntegerGroupedObservable.getKey());
                //text_groupby.setText("group name: " + stringIntegerGroupedObservable.getKey());
                if (stringIntegerGroupedObservable.getKey().equalsIgnoreCase("偶数组")){
                    stringIntegerGroupedObservable.subscribe(new Consumer<Integer>() {
                        @Override
                        public void accept(Integer integer) throws Exception {
                            System.out.println(stringIntegerGroupedObservable.getKey() + "member" + integer);
                        }
                    });
                }
            }
        });
    }
}
