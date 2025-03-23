package com.aditya.Days_9;


import java.util.Scanner;

abstract class Employee {
    String name;
    int id;

    public Employee(int id, String name) {
        this.id = id;
        this.name = name;
    }

    abstract double calculateSalary();

    void display() {
        System.out.println("Employee Id:-"+id);
        System.out.println("Employee Name:-"+name);
        System.out.println("Total Salary :-"+calculateSalary());

    }
}
class Manager extends Employee {
    double baseSalary;
    double bonus;

    public Manager(int id, String name, double baseSalary, double bonus) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.bonus = bonus;
    }


    @Override
    double calculateSalary() {
        return baseSalary+bonus;
    }
}
class Developer extends Employee {
    double baseSalary;
    double projectIncentive;

    public Developer(int id, String name, double baseSalary, double projectIncentive) {
        super(id, name);
        this.baseSalary = baseSalary;
        this.projectIncentive = projectIncentive;
    }

    @Override
    double calculateSalary() {
        return baseSalary + projectIncentive;
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter Id :-");
        int id = sc.nextInt();
        sc.nextLine();
        System.out.println("Enter Name :-");
        String name = sc.nextLine();

        System.out.println("Select the type of employee :-");
        System.out.println("1.Manager");
        System.out.println("2.Developer");
        int choice = sc.nextInt();

        Employee emp;

        switch (choice) {
            case 1:
                System.out.println("Enter Base Salary :-");
                double baseSalary = sc.nextDouble();
                System.out.println("Enter Bonus :-");
                double bonus = sc.nextDouble();
                emp = new Manager(id,name,baseSalary,bonus);
                break;

            case 2:
                System.out.println("Enter Base Salary :-");
                double baseSalary1 = sc.nextDouble();
                System.out.println("Enter Project Incentive :-");
                double bonus1 = sc.nextDouble();
                emp = new Developer(id,name,baseSalary1,bonus1);
                break;

            default:
                System.out.println("Invalid Entry !!! , Exiting ");
                return;
        }
        emp.display();
    }
}
