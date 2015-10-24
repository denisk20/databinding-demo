package com.denisk.demo;

import android.app.Activity;
import android.databinding.DataBindingUtil;
import android.os.Bundle;
import com.denisk.demo.databinding.ActivityBaseBinding;
import com.denisk.demo.model.PersonModel;
import com.denisk.demo.model.ZooModel;

import java.util.ArrayList;

public class BaseActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityBaseBinding binding = DataBindingUtil.setContentView(this, R.layout.activity_base);

        ZooModel zoo = new ZooModel();
        zoo.setName("MyZoo");
        zoo.setMonkeyCount(10);
        zoo.setElephantCount(0);

        binding.setZoo(zoo);

        ArrayList<PersonModel> visitorList = new ArrayList<>();
        visitorList.add(new PersonModel("Josh"));
        visitorList.add(new PersonModel("Mary"));
        visitorList.add(new PersonModel("Nick"));

        binding.setVisitorList(visitorList);

        getActionBar().setDisplayHomeAsUpEnabled(true);
    }


}
