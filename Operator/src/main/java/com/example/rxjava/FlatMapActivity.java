package com.example.rxjava;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;

import com.example.rxjava.List.User;

import java.util.ArrayList;
import java.util.List;

import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;

public class FlatMapActivity extends AppCompatActivity {

    private TextView text_flatmap;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_flatmap);

        text_flatmap = findViewById(R.id.text_flatmap);


        User user = new User();
        user.userName = "tony";
        user.addresses = new ArrayList<>();
        User.Address address1 = new User.Address();
        address1.street = "ren ming road";
        address1.city = "Suzhou";
        user.addresses.add(address1);

        User.Address address2 = new User.Address();
        address2.street = "tian he road";
        address2.city = "Guangzhou";
        user.addresses.add(address2);

        /*使用map*/
        Observable.just(user)
                .map(new Function<User, List<User.Address>>() {
                    @Override
                    public List<User.Address> apply(User user) throws Exception{
                        return user.addresses;
                    }
                }).subscribe(new Consumer<List<User.Address>>() {
            @Override
            public void accept(List<User.Address> addresses) throws Exception {
                for (User.Address address : addresses){
                    System.out.println(address.street);
                    //text_flatmap.setText(address.street);
                }
            }
        });

        /*使用flatMap操作符*/
        /*Observable.just(user)
                .flatMap(new Function<User, ObservableSource<User.Address>>() {
                    @Override
                    public ObservableSource<User.Address> apply(User user) throws Exception {
                        return Observable.fromIterable(user.addresses);
                    }
                }).subscribe(new Consumer<User.Address>() {
            @Override
            public void accept(User.Address address) throws Exception {
                System.out.println(address.street);
                text_flatmap.setText(address.street);
            }
        });*/

    }
}
