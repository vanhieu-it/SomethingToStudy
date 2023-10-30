package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.CustomAnnotation;

public class Application {
    public static void main(String[] args) throws Exception{
        Car car = new Car("BWM","123","2023");
        JsonSerializer serializer = new JsonSerializer();
        serializer.serialize(car);
    }
}
