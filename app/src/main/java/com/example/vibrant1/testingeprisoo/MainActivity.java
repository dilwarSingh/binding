package com.example.vibrant1.testingeprisoo;

import android.databinding.DataBindingUtil;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.vibrant1.testingeprisoo.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    User user;
    ActivityMainBinding mainBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mainBinding = DataBindingUtil.setContentView(this, R.layout.activity_main);
        User user = new User("jhavfuy", "lajfgyua");
        mainBinding.setUser(user);

    }
}
