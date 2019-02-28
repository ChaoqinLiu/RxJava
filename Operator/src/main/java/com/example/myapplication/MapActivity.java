package com.example.myapplication;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.widget.TextView;


import io.reactivex.Observable;
import io.reactivex.functions.Consumer;
import io.reactivex.functions.Function;


public class MapActivity extends AppCompatActivity {

    private TextView text_map;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        supportRequestWindowFeature(Window.FEATURE_NO_TITLE);
        setContentView(R.layout.activity_map);

        text_map = findViewById(R.id.text_map);

        Observable.just("HELLO")
                .map(new Function<String, String>(){
                    @Override
                    public String apply(String s) throws Exception{
                        return s.toLowerCase();
            }
        }).map(new Function<String, String>(){
            @Override
            public String apply(String s) throws Exception{
                return s+" world";
            }
        }).subscribe(new Consumer<String>(){
            @Override
            public void accept(String s) throws Exception{
                System.out.println(s);
                text_map.setText(s);
            }
        });
    }
}
