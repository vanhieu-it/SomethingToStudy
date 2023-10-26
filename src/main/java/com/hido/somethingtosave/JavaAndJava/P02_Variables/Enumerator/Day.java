package com.hido.somethingtosave.JavaAndJava.P02_Variables.Enumerator;

public enum Day {
    //Khởi tạo giá trị đặc biệt cho hằng số enum
    MONDAY("Thứ hai"),
    TUESDAY("Thứ ba"),
    WEDNESDAY("Thứ tư"),
    THURSDAY("Thứ năm"),
    FRIDAY("Thứ sáu"),
    SATURDAY("Thứ bảy"),
    SUNDAY("Chủ nhật");
    String value;
    private Day(String value){
        this.value = value;
    }
    public String getValue(){
        return value;
    }
}
