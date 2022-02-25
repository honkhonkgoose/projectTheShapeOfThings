package com.csc205.project2;

import java.util.StringJoiner;

public class Cube extends Shape {

    double width;

    public Cube(){

        super();
        this.width = 0.0;

    }

    public Cube(double width){

        super();
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

        return 6 * (width * width);

    }

    @Override
    public double volume() {

        return width * width * width;

    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cube{");
        sb.append("width=").append(width);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
