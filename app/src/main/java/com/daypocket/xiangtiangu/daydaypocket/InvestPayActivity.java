package com.daypocket.xiangtiangu.daydaypocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InvestPayActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_invest_pay);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
    }

    public void pay(View view) {
        Intent intent = new Intent(getApplicationContext(), InvestActivity.class);
        intent.putExtra("Payamount", 300);
        startActivity(intent);


    }
}
