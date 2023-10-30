package com.hido.somethingtostudy.JavaAndJava.P08_Exception.ExceptionDemo;
//Tự định nghĩa Exception - kiểm tra tuổi
public class AgeCustomException extends Exception{
    public AgeCustomException(String message) {
        super(message);
    }

    @Override
    public String getMessage() {
        return "Lỗi nhập vào một tuổi: " + super.getMessage();
    }
}
