package com.hido.somethingtostudy.JavaAndJava.P10_Stream;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) throws Exception {

        ArrayList<Integer> numbers = new ArrayList<>();
        numbers.add(2);
        numbers.add(8);
        numbers.add(7);
        numbers.add(2);
        numbers.add(5);
        numbers.add(1);
        numbers.add(9);

        System.out.println("Danh sách ban đầu: ");
        numbers.forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nCác phần tử chia hết cho 2: ");
        numbers.stream()
                .filter(num -> num % 2 == 0)
                .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sách sau khi loại bỏ 3 phần tử đầu tiên: ");
        numbers.stream()
                .skip(2)
                .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sách chỉ có 5 phần tử: ");
        numbers.stream()
                .limit(5)
                .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sách các số nhân với 10: ");
        numbers.stream()
                .map(num -> num * 10)
                .forEach(num -> System.out.print(num + "\t"));

        System.out.println("\nDanh sach sau khi sắp xếp: ");
        numbers.stream()
                .sorted()
                .forEach(num -> System.out.print(num + "\t"));

        Stream<String> stream = Stream.of("Linh", "Hung", "Hoa", "Tuan", "Dat");
        List<String> names = stream.collect(Collectors.toList());

        names.forEach(name -> System.out.println(name + "\t"));

        boolean isCheck = names.stream()
                .anyMatch(name -> name.startsWith("H"));
        System.out.print(isCheck);

    }
}
