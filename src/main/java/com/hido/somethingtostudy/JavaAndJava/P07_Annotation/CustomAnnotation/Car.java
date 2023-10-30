package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.CustomAnnotation;

public class Car {
    @JsonField("manufacturer")//Sử dụng giá trị rõ ràng
    private final String make;

    @JsonField //Sử dụng giá trị mặc định
    private final String model;


    @JsonField("year")
    private final String year;

    public Car(String make, String model, String year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }

    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public String getYear() {
        return year;
    }
}
