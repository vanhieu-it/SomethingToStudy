package com.hido.somethingtosave.JavaAndJava.P01_DataType.demo;
import java.util.Arrays;
import java.util.List;
public class DemoString {
    public String reverseAString(String strString){
        StringBuilder sb = new StringBuilder();
        for(int i = strString.length()-1; i>=0; i--){
            sb.append(strString. charAt(i));
        }
        return sb.toString();
    }

    public String reverseAString2(String strString){
        return strString.transform(str -> {
            StringBuilder sb = new StringBuilder();
            for (char c: str.toCharArray()){
                sb.insert(0,c);
            }
            return sb.toString();
        });
    }

    public String reverseAString3(String strString){
        return new StringBuilder(strString).reverse().toString();
    }

    public List<String> splitWords(String strString){
        return strString.transform((str ->Arrays.asList(str.split("[\\s,]+"))));
    }
}
