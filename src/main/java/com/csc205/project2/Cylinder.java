package com.csc205.project2;

public class Cylinder extends Shape{


    private double radius;
    private double height;

    public Cylinder(){

        super();
        this.radius = 0.0;
        this.height = 0.0;

    }

    public Cylinder(double height, double radius){

        super();
        this.height = height;
        this.radius = radius;

    }

    //Getters & Setters
    public double getRadius() {

        return radius;

    }

    public void setRadius(double radius) {

        this.radius = radius;

    }

    public double getHeight() {

        return height;

    }

    public void setHeight(double height) {

        this.height = height;

    }

    @Override
    public double surfaceArea() {

        return 2 * Math.PI * radius * (radius + height);

    }

    @Override
    public double volume() {

        return Math.PI * radius * radius * height;

    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Cylinder{");
        sb.append("height=").append(height);
        sb.append(", radius=").append(radius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }
}
