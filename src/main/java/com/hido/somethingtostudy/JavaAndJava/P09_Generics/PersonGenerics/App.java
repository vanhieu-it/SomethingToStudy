package com.hido.somethingtostudy.JavaAndJava.P09_Generics.PersonGenerics;

public class App {
    public static void main(String[] args) throws Exception {
        PersonController<Student> student = new PersonController<>();
        Student student1 = new Student(1l, "Hiếu", 24, 9);
        Student student2 = new Student(2l, "Hằng", 24, 9.5);

        student.add(student1);
        student.add(student2);

        System.out.println("Danh sách học sinh: ");
        student.display();

        System.out.println("Danh sách học sinh có điểm lớn hơn 9: ");
        student.list.stream().filter(students -> students.getPoint() > 9).forEach(System.out::println);

        PersonController<Teacher> teachers = new PersonController<Teacher>();
        Teacher teacher1 = new Teacher(1L, "ABC", 10000000);
        Teacher teacher2 = new Teacher(2L, "CBA", 11000000);

        teachers.add(teacher1);
        teachers.add(teacher2);

        System.out.println("Danh sách giảng viên: ");
        teachers.display();
    }
}
