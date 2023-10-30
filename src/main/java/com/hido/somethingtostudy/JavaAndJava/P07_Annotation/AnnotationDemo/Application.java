package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.AnnotationDemo;

import java.util.Date;

public class Application {
    public static void main(String[] args) throws Exception{
        Student student = new Student("Hieu", 24, "Ho Chi Minh City");
        student.display();
        student.show();//sẽ có cảnh báo bỏ qua do annotation @Deprecated
    }
}
