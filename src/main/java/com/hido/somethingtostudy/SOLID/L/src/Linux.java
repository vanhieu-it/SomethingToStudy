package com.hido.somethingtostudy.SOLID.L.src;

public class Linux extends OperatingSystem{
    @Override
    public void startUp() {
        throw new IllegalStateException("Error");
        //Không thỏa
    }
}
