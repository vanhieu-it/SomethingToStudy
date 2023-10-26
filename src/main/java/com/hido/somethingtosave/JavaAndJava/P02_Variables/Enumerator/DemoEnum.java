package com.hido.somethingtosave.JavaAndJava.P02_Variables.Enumerator;

public class DemoEnum {
    public static void main(String[] args) throws Exception{
        Season season = Season.WINTER;
        System.out.println(season);

        for (Season s : Season.values()){
            System.out.println(s);
        }

        Day day = Day.SUNDAY;
        System.out.println(day.getValue());
    }
}
