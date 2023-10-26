package com.hido.somethingtosave.JavaAndJava.P01_DataType.demo;

import java.util.ArrayList;
import java.util.Arrays;

public class DemoNumber {
    public void demoNumber() {
        int i = 0;
        float pi = 3.14159f;

        i = (int) pi;
        System.out.println("i = " + i);

        long primitiveLong = 10L;//Không thể gán null
        Long objectLong = null;//Có thể gán null
        System.out.println("primitiveLong = " + primitiveLong);
        System.out.println("objectLong = " + objectLong);
        objectLong = primitiveLong;
        System.out.println("objectLong = " + objectLong);

        ArrayList<Long> numbers = new ArrayList<>();
        numbers.add(1L);
        numbers.add(2L);
        numbers.add(3L);
        System.out.println(numbers);
    }
    public void compareFloatNumber(){
        double a = 1.414141f;
        double b = Math.sqrt(2.0);
        if(a==b){
            System.out.println("Hai số bằng nhau");
        }else
            System.out.println("Hai số không bằng nhau");
    }
}

