package com.daypocket.xiangtiangu.daydaypocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

public class KeepBorrowPayActivity extends AppCompatActivity {
    private TextView maxBorrowBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_borrow_pay);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        maxBorrowBalance = (TextView)findViewById(R.id.maxBorrowBalance);
        maxBorrowBalance.setText("$3000");

    }
}
