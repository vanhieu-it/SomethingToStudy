package com.hido.somethingtostudy.JavaAndJava.P09_Generics.PersonGenerics;

public class Person {
    private Long Id;
    private String name;

    public Person(Long id, String name) {
        Id = id;
        this.name = name;
    }

    public Long getId() {
        return Id;
    }

    public void setId(Long id) {
        Id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Person{" +
                "Id='" + Id + '\'' +
                ", name='" + name + '\'' +
                '}';
    }
}
