package com.denisk.demo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.denisk.demo.databinding.ActivityBaseBinding;
import com.denisk.demo.model.ZooModel;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBaseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base);

        ZooModel zoo = new ZooModel();
        zoo.setName("MyZoo");

        binding.setZoo(zoo);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
