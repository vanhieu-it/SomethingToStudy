package com.hido.somethingtostudy.JavaAndJava.P09_Generics.DemoGenerics;

public class App {
    public static void main(String[] args) throws Exception {
        //Generics Array
        String[] strings = new String[3];
        strings[0] = "First";
        strings[1] = "Second";
        strings[2] = "Last";
        GenericsArray<String> demo = new GenericsArray<String>(strings);
        demo.print(strings);
        String lastElement = demo.getLast();
        System.out.println(lastElement);

        //Extends
        Extends<Integer> integerExtends = new Extends<>(5);
        System.out.println(integerExtends.getNumber());

        Extends<Double> doubleExtends = new Extends<>(5.5);
        System.out.println(doubleExtends.getNumber());

        //FindMaxGenerics
        FindMaxGenerics maxGenerics = new FindMaxGenerics();
        System.out.println("Giá trị lớn nhất trong hai số 4 , 5: " + maxGenerics.findMax(4, 5));
        System.out.println("Giá trị lớn nhất trong hai sô 7.6 và 4.2 : " + maxGenerics.findMax(7.6, 4.2));
        System.out.println("Giá trị lớn nhất trong hai chuỗi  Java và HTML: " + maxGenerics.findMax("Java", "HTML"));

    }
}
