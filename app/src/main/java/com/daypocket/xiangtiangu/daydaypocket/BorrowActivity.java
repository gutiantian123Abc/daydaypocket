package com.daypocket.xiangtiangu.daydaypocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BorrowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }
}
