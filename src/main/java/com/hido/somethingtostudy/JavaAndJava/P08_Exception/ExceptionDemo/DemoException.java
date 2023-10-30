package com.hido.somethingtostudy.JavaAndJava.P08_Exception.ExceptionDemo;

import java.util.InputMismatchException;
import java.util.Scanner;

public class DemoException {
    public static void main(String[] args) throws Exception{
        //Try catch
        TryCatchDemo.demoTryCatch();
        TryCatchDemo.demoTryFinally();
        TryCatchDemo.demoTryCatchFinally();
        TryCatchDemo.multiCatchBlock();

        //Throw Demo
        ThrowDemo.validate();
        
        //Throws Demo
        ThrowsDemo.getAge();

        //Custom exception
        try {
            int age = inputAge();
            System.out.println("Tuổi đã nhập: " + age);
        } catch (AgeCustomException e) {
            System.out.println(e.getMessage());
        }
    }
    static int inputAge() throws AgeCustomException {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Hãy nhập tuổi nhân viên: ");
        int age = 0;
        try {
            age = scanner.nextInt();
            if (age < 0) throw new AgeCustomException("tuổi không được nhỏ hơn 0.");
        } catch (InputMismatchException e) {
            throw new AgeCustomException("tuổi phải là một số.");
        }
        return age;
    }
}
