package com.hido.somethingtosave.JavaAndJava.P04_DemoOOP.demo;

import com.hido.somethingtosave.JavaAndJava.P04_DemoOOP.model.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) throws Exception {
//         Student student1 = new Student();
//         student1.input();
//         System.out.println(student1.toString());

         Student[] arrStudents = new Student[3]; //KHởi tạo mảng có kích thước = 3
         for(int i = 0; i < arrStudents.length; i++){
             Student student = new Student();
             System.out.println("Nhập thông tin sinh viên thứ " +(i+1));
             student.input();
             arrStudents[i] = student;
         }

         System.out.println("Thông tin sinh viên: ");
         for (Student student : arrStudents) {
             System.out.println(student);
         }
    }
}
