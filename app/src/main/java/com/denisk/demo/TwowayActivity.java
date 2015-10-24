package com.denisk.demo;

import android.app.Activity;
import android.content.Intent;
import android.databinding.DataBindingUtil;
import android.os.AsyncTask;
import android.os.Bundle;
import android.view.View;
import com.denisk.demo.databinding.ActivityTwowayBinding;
import com.denisk.demo.model.ObservablePersonModel;
import com.denisk.demo.model.ObservableZooModel;

/**
 * @author denisk
 * @since 10/24/15.
 */
public class TwowayActivity extends Activity {
    private ActivityTwowayBinding binding;
    private ObservableZooModel zoo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_twoway);
        zoo = new ObservableZooModel();
        zoo.setMonkeyCount(5);
        zoo.setDirector(new ObservablePersonModel("Tuborg"));

        binding.setZoo(zoo);
        binding.directorName.setText(zoo.getDirector().getName());
    }

    public void onBaseBindingClicked(View v) {
        Intent intent = new Intent(this, OnewayActivity.class);
        startActivity(intent);
    }

    public void sellMonkey(View view) {
        new AsyncTask<Void, Void, Void>(

        ) {
            @Override
            protected Void doInBackground(Void... params) {
                zoo.sellMonkey();
                return null;
            }
        }.execute((Void[]) null);
    }

    public void buyElephant(View view) {
        zoo.addElephant();
    }
}
