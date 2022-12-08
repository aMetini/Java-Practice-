package com.exercise._shapes_abstract_class;

public class Triangle extends Shape {
    protected double base;
    protected double height;

    public Triangle(double base, double height) {
        this.base = base;
        this.height = height;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    @Override
    public void computeArea() {
        double triangleArea = (base * height) / 2; 
        System.out.println("The area of this Triangle is " + String.format("%.2f", triangleArea));
    }


    
}
