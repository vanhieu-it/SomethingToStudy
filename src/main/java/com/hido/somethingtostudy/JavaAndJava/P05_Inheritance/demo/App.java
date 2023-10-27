package com.hido.somethingtostudy.JavaAndJava.P05_Inheritance.demo;

import java.util.ArrayList;
import java.util.Scanner;

import com.hido.somethingtostudy.JavaAndJava.P05_Inheritance.model.SchoolBook;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner sc = new Scanner(System.in);
        System.out.println("Nhap so luong sach can them: ");
        int num = sc.nextInt();

        ArrayList<SchoolBook> listBooks = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            SchoolBook schoolBook = new SchoolBook();
            schoolBook.input();

            listBooks.add(schoolBook);

        }

        System.out.println("Danh sach : ");
        for (SchoolBook schoolBook : listBooks) {
            System.out.println(schoolBook);
        }
    }
}
