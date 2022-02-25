package com.csc205.project2;

public class Torus extends Shape{

    private double innerRadius;
    private double outerRadius;

    public Torus(){

        super();
        this.innerRadius = 0.0;
        this.outerRadius = 0.0;

    }

    public Torus(double innerRadius, double outerRadius){

        super();
        this.innerRadius = innerRadius;
        this.outerRadius = outerRadius;

    }

    @Override
    public double surfaceArea() {

        return  Math.pow(Math.PI, 2) * (outerRadius-innerRadius) * (outerRadius+innerRadius);
    }

    @Override
    public double volume() {

        return 0.25 * Math.pow(Math.PI, 2)  * Math.pow((outerRadius-innerRadius) , 2) * (outerRadius+innerRadius);
    }

    //Getters & Setters
    public double getInnerRadius() {

        return innerRadius;

    }

    public void setInnerRadius(double innerRadius) {

        this.innerRadius = innerRadius;

    }
    public double getOuterRadius() {

        return outerRadius;

    }

    public void setOuterRadius(double outerRadius) {

        this.outerRadius = outerRadius;

    }

    @Override
    public String toString() {

        final StringBuilder sb = new StringBuilder("Torus{");
        sb.append("inner radius=").append(innerRadius);
        sb.append(", outer radius=").append(outerRadius);
        sb.append(", surface area=").append(surfaceArea());
        sb.append(", volume=").append(volume());
        sb.append('}');
        return sb.toString();

    }

}
