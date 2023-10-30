package com.hido.somethingtostudy.JavaAndJava.P10_Stream;

public class App {
    public static void main(String[] args) throws Exception{
         Animal animal = new Animal();
         Repository repository = new Repository();
         repository.printList();

         System.out.println("Danh sách động vật có số chân bằng 4 là: ");
         repository.getAnimal4Legs();
         repository.countAnimal4Legs();
    }
}
