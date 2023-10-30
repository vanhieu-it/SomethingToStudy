package com.hido.somethingtostudy.JavaAndJava.P08_Exception.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ThrowDemo {
    //Kiểm tra tuổi lớn hơn 18
    public static void validate(){
        try {
            int age= inputAge();
            if(age < 18)
                throw new ArithmeticException("Bạn chưa đủ tuổi");
            else
                System.out.println("Bạn đã đủ tuổi");
        }catch (InputMismatchException e){
            System.out.println("Tuổi nhập chưa hợp lệ");
        }
    }
    public static int inputAge(){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Nhập tuổi của bạn: ");
        int age = scanner.nextInt();
        return age;
    }
}
