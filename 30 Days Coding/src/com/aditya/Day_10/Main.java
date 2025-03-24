package com.aditya.Day_10;

//Create a Java program to calculate the area of different
// shapes using interfaces and method overriding.

import java.util.Scanner;

interface Shape{
    double calculateArea();
}
class Circle implements Shape{
    float radius;

    public Circle(float radius) {
        this.radius = radius;
    }

    @Override
    public double calculateArea() {
        return 3.14*radius*radius;
    }
}
class  Rectangle implements Shape{
    float length,width;

    public Rectangle(float length, float width) {
        this.length = length;
        this.width = width;
    }

    @Override
    public double calculateArea() {
        return length*width;
    }
}
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Radius of the circle :-");
        float radius = sc.nextFloat();
        System.out.println("Enter The Length of rectangle :-");
        float length = sc.nextFloat();
        System.out.println("Enter The Width of rectangle :-");
        float width = sc.nextFloat();
        sc.nextLine();

        Shape obj;
        obj = new Circle(radius);
        System.out.println("Area of The Circle : "+String.format("%.2f",obj.calculateArea()));

        Shape obj1;
        obj1 = new Rectangle(length,width);
        System.out.println("Area of the rectangle :"+String.format("%.2f",obj1.calculateArea()));


        sc.close();

    }
}
