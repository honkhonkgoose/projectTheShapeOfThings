package com.csc205.project2;

public class Cylinder extends Shape{


    private double radius;

    public Cylinder(){

    }

    public Cylinder(double radius){

    }

    //Getters & Setters
    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double surfaceArea() {
        return 0;
    }

    @Override
    public double volume() {
        return 0;
    }
}
