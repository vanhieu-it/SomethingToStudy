package com.hido.somethingtostudy.SOLID.I.src;

public class Bird implements Animals{
    @Override
    public void eat() {
        System.out.println("Bird eat");
    }

    @Override
    public void swim() {
        throw new IllegalStateException("Bird can't swim");
        //-->UnderwaterAnimals interface can swim
    }

    @Override
    public void fly() {
        System.out.println("Bird fly");
    }
}
