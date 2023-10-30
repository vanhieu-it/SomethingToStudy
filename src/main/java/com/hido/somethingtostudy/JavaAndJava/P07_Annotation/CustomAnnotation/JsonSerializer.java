package com.hido.somethingtostudy.JavaAndJava.P07_Annotation.CustomAnnotation;

import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.stream.Collectors;

public class JsonSerializer {
    public String serialize(Object object) throws JsonSerializeException{
        try {
            Class<?> objClass = Objects.requireNonNull(object).getClass();
            //requireNonNull: kiểm tra xem tham chiếu đối tượng có là null hay không
            //nếu phải thì ném ra ngoại lệ NullPointerException
            Map<String, String> jsonElements = new HashMap<>();
            for(Field field : objClass.getDeclaredFields()){
                // Trả về một mảng các đối tượng đại diện cho tất cả các bản ghi
                field.setAccessible(true);
                if(field.isAnnotationPresent(JsonField.class)){
                    //Kiểm tra xem trường đó có được ghi chú bằng @JsonField không
                    jsonElements.put(getSerializedKey(field), (String) field.get(object));
                }
            }
            System.out.println(toJsonString(jsonElements));
            return toJsonString(jsonElements);
        } catch (IllegalAccessException e) {
            throw new JsonSerializeException(e.getMessage());
        }
    }


    private static String getSerializedKey(Field field){
        String annotationValue = field.getAnnotation(JsonField.class).value();
        if(annotationValue.isEmpty()){
            return field.getName();
        }
        else {
            return annotationValue;
        }
    }
    private String toJsonString(Map<String, String> jsonMap){
        //Chuyển đổi chuỗi sang JSON
        String elementsString = jsonMap.entrySet()
                .stream()
                .map(entry -> "\"" + entry.getKey() + "\":\"" + entry.getValue() + "\"")
                .collect(Collectors.joining(","));
        return "{" + elementsString + "}";
    }
}
