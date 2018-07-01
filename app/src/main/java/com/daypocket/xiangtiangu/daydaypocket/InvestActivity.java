package com.daypocket.xiangtiangu.daydaypocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class InvestActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }


}
