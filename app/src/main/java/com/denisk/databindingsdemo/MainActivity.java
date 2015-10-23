package com.denisk.databindingsdemo;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void onBaseBindingClicked(View v) {
        Toast.makeText(this, "Clicked", Toast.LENGTH_SHORT).show();
    }
}


