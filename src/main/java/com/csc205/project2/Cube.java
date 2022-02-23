package com.csc205.project2;

import java.util.StringJoiner;

public class Cube extends Shape {

    double width;



    public Cube(){

    }

    public Cube(double width){
        this.width = width;
    }

    //Getters & Setters
    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public double surfaceArea() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append('}');
        return sb.toString();
    }
}
