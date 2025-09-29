package com.internship.basicProgramming.abstractDemo;

import java.security.PrivilegedExceptionAction;

abstract class Shape{
    protected String color;
    protected double area;

    // abstract class can have constructor , it cannot be instantiated
    public Shape(String color){
        this.color = color;
    }

    // pure=> all abstract
    // partial => few abstract few concrete
    // concrete => all methods have body

    //concrete methods
    public void setColor(String color){
        this.color = color;
    }
    public String getColor(){
        return color;
    }
    // abstract methods, that will be implemented by the extending classes
    public abstract void calculateArea();
    public abstract void draw();

    // diasplay info concrete method
    public void displayInfo(){
        System.out.println("Shape : " + getClass().getSimpleName());
        System.out.println("Color: " + color);
        System.out.println("Area: " + area);
        draw();
        System.out.println();
    }

}
class Rectangle extends Shape{
    private double length;
    private double width;

    public Rectangle(String color, double length, double width){
        super(color);
        this.length = length;
        this.width = width;
    }

    @Override
    public void calculateArea() {
        area = length * width;
        System.out.println("the are of the rectangle is " + area);
    }
    @Override
    public void draw() {
        System.out.println("drawing rectangle : with length " + length + " and width " + width );
    }
    // it can have its own methods
    public double getPerimeter(){
        return 2 * length + 2 * width;
    }
}
class Circle extends Shape{
    private double radius;
    private static final double PI = 3.14;

    public Circle(String color, double radius){
        super(color);
        this.radius = radius;
    }

    @Override
    public void calculateArea() {
        area = PI * radius * radius;
        System.out.println("the are of the circle is " + area);
    }

    @Override
    public void draw() {
        System.out.println("circle : with radius " + radius + " and color " + color);
    }
}



public class AreaCalc {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle("red", 10, 20);
        rectangle.calculateArea();
        rectangle.displayInfo();

        //create obj for circle also
        Circle circle = new Circle("red", 10);
        circle.calculateArea();
        circle.displayInfo();

    }
}
