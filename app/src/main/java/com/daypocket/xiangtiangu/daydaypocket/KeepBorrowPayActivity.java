package com.daypocket.xiangtiangu.daydaypocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class KeepBorrowPayActivity extends AppCompatActivity {
    private TextView maxBorrowBalance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_keep_borrow_pay);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        maxBorrowBalance = (TextView)findViewById(R.id.maxBorrowBalance);
        maxBorrowBalance.setText("   $3000");

    }

    public void borrow(View view) {
        Intent intent = new Intent(getApplicationContext(), BorrowActivity.class);
        intent.putExtra("Payamount", 800);
        startActivity(intent);

    }

    public void cancel(View view) {
        Intent intent = new Intent(getApplicationContext(), BorrowKeepBorrowActivity.class);
        startActivity(intent);

    }
}
