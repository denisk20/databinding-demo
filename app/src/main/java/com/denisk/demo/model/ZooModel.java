package com.denisk.demo.model;

/**
 * @author denisk
 * @since 10/23/15.
 */
public class ZooModel {
    private String name;
    private int monkeyCount;
    private int elephantCount;

    private PersonModel director;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMonkeyCount() {
        return monkeyCount;
    }

    public void setMonkeyCount(int monkeyCount) {
        this.monkeyCount = monkeyCount;
    }

    public int getElephantCount() {
        return elephantCount;
    }

    public void setElephantCount(int elephantCount) {
        this.elephantCount = elephantCount;
    }

    public PersonModel getDirector() {
        return director;
    }

    public void setDirector(PersonModel director) {
        this.director = director;
    }
}
