package com.example.cpe_c5_win10.faniot;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        if (savedInstanceState == null) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .add(R.id.contentFragmentMain,new MainFragment())
                    .commit();
        }
    }

    public void setSupportActionBar(Toolbar toolbar) {
    }
}
