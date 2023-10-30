package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.CustomAnnotation;

import java.lang.annotation.*;

@Retention(RetentionPolicy.RUNTIME)//Annotation sẽ tồn tại khi runtime
@Target(ElementType.FIELD)// Chỉ có thể áp dụng cho các trường (Field)
public @interface JsonField {
    public String value() default "";
    //Nội dung của annotation là một chuỗi có tên là value
    //Ta gán giá trị mặc định là một chuỗi rỗng
}
