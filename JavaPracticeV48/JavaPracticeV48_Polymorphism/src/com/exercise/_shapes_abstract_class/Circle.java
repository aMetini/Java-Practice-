package com.exercise._shapes_abstract_class;

public class Circle extends Shape {
    protected double radius;

    public Circle(double r) {
        radius = r;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double r) {
        radius = r;
    }

    @Override
    public void computeArea() {
        double circleArea = Math.PI * radius * radius;
        System.out.println("The area of this Triangle is " + String.format("%.2f", circleArea));
    }
    
}
