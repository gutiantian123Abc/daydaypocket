package com.daypocket.xiangtiangu.daydaypocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BorrowPaySelectActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_pay_select);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }

    public void cancel(View view) {
        Intent intent = new Intent(getBaseContext(), BorrowActivity.class);
        intent.putExtra("Payamount", 500);
        startActivity(intent);
    }

    public void pay(View view) {
        Intent intent = new Intent(getBaseContext(), BorrowActivity.class);
        intent.putExtra("Payamount", 200);
        startActivity(intent);
    }
}
