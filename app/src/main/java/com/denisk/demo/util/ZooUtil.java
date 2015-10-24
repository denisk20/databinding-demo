package com.denisk.demo.util;

import android.view.View;
import android.widget.Toast;
import com.denisk.demo.model.ZooModel;

/**
 * @author denisk
 * @since 10/23/15.
 */
public class ZooUtil {
    public static final String CAGE_WESTERN = "western";

    public static int getTotalAnimals(ZooModel zoo) {
        return zoo.getMonkeyCount() + zoo.getElephantCount();
    }

    public static void onMonkeys(View v) {
        Toast.makeText(v.getContext(), "There are monkeys!", Toast.LENGTH_SHORT).show();
    }
    public static void onNoMonkeys(View v) {
        Toast.makeText(v.getContext(), "No monkeys", Toast.LENGTH_SHORT).show();
    }
}
