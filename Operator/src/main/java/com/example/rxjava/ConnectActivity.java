package com.example.rxjava;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.concurrent.TimeUnit;

import io.reactivex.Observable;
import io.reactivex.Observer;
import io.reactivex.disposables.Disposable;
import io.reactivex.observables.ConnectableObservable;

public class ConnectActivity extends AppCompatActivity {

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);

        final SimpleDateFormat sdf = new SimpleDateFormat("HH:mm:ss");

        Observable<Long> obs = Observable.interval(1,TimeUnit.SECONDS).take(6);

        ConnectableObservable<Long> connectableObservable = obs.publish();

        connectableObservable.subscribe(new Observer<Long>() {
            @Override
            public void onSubscribe(Disposable d) {

            }

            @Override
            public void onNext(Long aLong) {
                System.out.println("subscriber1: onNext: " + aLong + "->time:" + sdf.format(new Date()));
            }

            @Override
            public void onError(Throwable e) {
                System.out.println("subscriber1: onError");
            }

            @Override
            public void onComplete() {
                System.out.println("subscriber1: onComplete");
            }
        });

        connectableObservable.delaySubscription(3,TimeUnit.SECONDS) //延迟3秒才订阅
                .subscribe(new Observer<Long>() {
                    @Override
                    public void onSubscribe(Disposable d) {

                    }

                    @Override
                    public void onNext(Long aLong) {
                        System.out.println("subscriber2: onNext: " + aLong + "->time:" + sdf.format(new Date()));
                    }

                    @Override
                    public void onError(Throwable e) {
                        System.out.println("subscriber2: onError");
                    }

                    @Override
                    public void onComplete() {
                        System.out.println("subscriber2: onComplete");
                    }
                });

        connectableObservable.connect();
        try {
            Thread.sleep(15000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
