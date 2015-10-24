package com.denisk.demo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import com.denisk.demo.BR;

/**
 * @author denisk
 * @since 10/24/15.
 */
public class ObservableZooModel extends BaseObservable {
    private String name;
    private int monkeyCount;
    private int elephantCount;

    private ObservablePersonModel director;

    @Bindable
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        notifyPropertyChanged(BR.name);
    }

    @Bindable
    public int getMonkeyCount() {
        return monkeyCount;
    }

    public void setMonkeyCount(int monkeyCount) {
        this.monkeyCount = monkeyCount;
        notifyPropertyChanged(BR.monkeyCount);
    }

    @Bindable
    public int getElephantCount() {
        return elephantCount;
    }

    public void setElephantCount(int elephantCount) {
        this.elephantCount = elephantCount;
        notifyPropertyChanged(BR.elephantCount);
    }

    @Bindable
    public ObservablePersonModel getDirector() {
        return director;
    }

    public void setDirector(ObservablePersonModel director) {
        this.director = director;
        notifyPropertyChanged(BR.director);
    }

    public void sellMonkey() {
        setMonkeyCount(monkeyCount - 1);
    }
}
