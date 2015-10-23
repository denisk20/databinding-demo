package com.denisk.databindingsdemo;

import android.app.Activity;
import android.os.Bundle;

public class BaseBindingActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_base_binding);
        getActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
