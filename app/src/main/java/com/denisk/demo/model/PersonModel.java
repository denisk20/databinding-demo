package com.denisk.demo.model;

/**
 * @author denisk
 * @since 10/23/15.
 */
public class PersonModel {
    private String name;


    public PersonModel(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
