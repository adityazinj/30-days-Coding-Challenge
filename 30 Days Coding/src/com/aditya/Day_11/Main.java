package com.aditya.Day_11;

//Create a Java program to store
//and retrieve student details using Encapsulation.

import java.util.Scanner;

class Student{
    private String name;
    private int rollNumber;
    private char grade;

    public char getGrade() {
        return grade;
    }

    public String getName() {
        return name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setGrade(char grade) {
        this.grade = grade;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }
}
public class Main {
    public static void main(String[] args) {
            String name;
            int rollNumber;
            char grade;

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter The Name Of Student :-");
            name = sc.nextLine();
            System.out.println("Enter The rollNumber of student :-");
            rollNumber = sc.nextInt();
            System.out.println("Enter The Grade Obtained By Student :-");
            grade = sc.next().charAt(0);

            Student s1 = new Student();
            s1.setName(name);
            s1.setRollNumber(rollNumber);
            s1.setGrade(grade);

            System.out.print(s1.getName()+" "+s1.getRollNumber()+" "+s1.getGrade());

    }
}
