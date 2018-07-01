package com.daypocket.xiangtiangu.daydaypocket;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;

import com.google.gson.JsonObject;
import com.koushikdutta.async.future.FutureCallback;
import com.koushikdutta.ion.Ion;

import java.io.IOException;

public class FirstActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);

    }

    public void signIn(View view) {
        Intent intent = new Intent(getBaseContext(), SignInActivity.class);
        startActivity(intent);
    }
}
