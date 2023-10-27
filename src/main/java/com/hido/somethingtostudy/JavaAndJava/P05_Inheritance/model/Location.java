package com.hido.somethingtostudy.JavaAndJava.P05_Inheritance.model;

public class Location {
    private String ke;
    private String tang;

    public Location(String ke, String tang) {
        this.ke = ke;
        this.tang = tang;
    }

    @Override
    public String toString() {
        return "Location{" +
                "ke='" + ke + '\'' +
                ", tang='" + tang + '\'' +
                '}';
    }
}
