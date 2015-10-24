package com.denisk.demo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.text.Editable;
import android.text.TextWatcher;
import com.denisk.demo.BR;

/**
 * @author denisk
 * @since 10/24/15.
 */
public class ObservablePersonModel extends BaseObservable {
    private String name;


    public ObservablePersonModel(String name) {
        this.name = name;
    }

    public final TextWatcher onNameChangedListener = new TextWatcher() {
        @Override
        public void beforeTextChanged(CharSequence s, int start, int count, int after) {

        }

        @Override
        public void onTextChanged(CharSequence s, int start, int before, int count) {

        }

        @Override
        public void afterTextChanged(Editable s) {
            setName(s.toString());
        }
    };

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

}
