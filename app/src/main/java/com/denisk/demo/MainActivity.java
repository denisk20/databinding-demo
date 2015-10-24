package com.denisk.demo;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onOnewayActivityClicked(View v) {
        start(OnewayActivity.class);
    }

    public void onTwowayActivityClicked(View v) {
        start(TwowayActivity.class);
    }

    private void start(Class<? extends Activity> clazz) {
        Intent intent = new Intent(this, clazz);
        startActivity(intent);
    }
}


