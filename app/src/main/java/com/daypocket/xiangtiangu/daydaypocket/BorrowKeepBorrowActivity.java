package com.daypocket.xiangtiangu.daydaypocket;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class BorrowKeepBorrowActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_borrow_keep_borrow);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);



    }

    public void applyBorrow(View view) {
        Intent intent = new Intent(getBaseContext(), KeepBorrowPayActivity.class);
        startActivity(intent);
    }
}
