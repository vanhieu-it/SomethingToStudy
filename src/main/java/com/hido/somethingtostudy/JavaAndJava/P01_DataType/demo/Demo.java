package com.hido.somethingtostudy.JavaAndJava.P01_DataType.demo;

public class Demo {
    public static void main(String[] args){
        demoString();
        demoNumber();
    }
    public static void demoString(){
        DemoString demoString = new DemoString();
        String strString = "Do Van Hieu";
        System.out.println(demoString.reverseAString(strString));
        System.out.println(demoString.reverseAString2(strString));
        System.out.println(demoString.reverseAString3(strString));

    }
    public static void demoNumber(){
        DemoNumber number = new DemoNumber();
        number.demoNumber();
        number.compareFloatNumber();
    }
}
