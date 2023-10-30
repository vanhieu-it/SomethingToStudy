package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.AnnotationDemo;

public class Student extends Person{
    public Student(String name, int age, String address) {
        super(name, age, address);
    }

    @Override
    public void display() {
        super.display();
    }
    @Deprecated
    //Deprecated: Đánh dấu rằng phương thức này không nên sử dụng nữa và nó có thể sẽ bị gỡ bỏ trong tương lai
    public void show(){
        System.out.printf("Tôi tên là %s, năm nay tôi %d tuổi và tôi đến từ %s", getName(),getAge(), getAddress());
    }
}
