package com.denisk.demo.model;

import android.databinding.BaseObservable;
import android.databinding.Bindable;
import android.databinding.ObservableInt;
import com.denisk.demo.BR;

/**
 * @author denisk
 * @since 10/24/15.
 */
public class ObservableZooModel extends BaseObservable {
    private String name;
    private int monkeyCount;

    public final ObservableInt elephantCount = new ObservableInt();

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

    public void setElephantCount(int elephantCount) {
        this.elephantCount.set(elephantCount);
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

    public void addElephant() {
        setElephantCount(elephantCount.get() + 1);
    }
}
