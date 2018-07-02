package com.daypocket.xiangtiangu.daydaypocket;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.EditText;
import android.view.View;
import android.util.Log;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.koushikdutta.ion.Ion;
import com.koushikdutta.async.future.FutureCallback;
import android.content.Intent;
import java.io.IOException;

public class SignInActivity extends AppCompatActivity {
    private EditText username;
    private EditText password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);
        overridePendingTransition(R.anim.fadein, R.anim.fadeout);
        username = (EditText)findViewById(R.id.userName);
        password = (EditText)findViewById(R.id.password);
    }

    public void signIn(View view) {
        //http://10.0.2.2:8080
        String url = "";
        try {
            url = Util.getProperty("get_customer",getApplicationContext());

        }catch(IOException e){
            e.printStackTrace();
        }

        Ion.with(getApplicationContext())
                .load(url + username.getText())
                .asJsonObject()
                .setCallback(new FutureCallback<JsonObject>() {
                    @Override
                    public void onCompleted(Exception e, JsonObject result) {
                        try{
                            Util util = new Util();

                            if (!result.has("status")) {

                                JsonObject jsonObject = result.getAsJsonObject();
                                JsonElement jsonElement = jsonObject.get("user");
                                String pass = jsonElement.getAsJsonArray().get(0).getAsJsonObject().get("password").toString();

                                if(util.equal(password.getText().toString(), pass)) {
                                    Intent intent = new Intent(getBaseContext(), MainActivity.class);

                                    startActivity(intent);
                                }else {
                                    // More security credential checks needed here
                                    Log.i("Wrong password", password.getText().toString());
                                    Log.i("Should be", pass);
                                }
                            }else {
                                Log.i("Wrong username", username.getText().toString());
                            }
                        }catch (Exception je) {

                            Log.i("Bad", "Bad");
                        }
                    }
                });





    }

}
