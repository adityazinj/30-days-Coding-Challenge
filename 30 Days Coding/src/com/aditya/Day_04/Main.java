package com.aditya.Day_04;

//Write a program to find the factorial of a number using recursion.
public class Main {
    public static void main(String[] args) {
        int x = 5;
        System.out.println(facto(x));

    }
    public static int facto(int x) {
        if (x == 1) {
            return 1;
        }
        return x * facto(x - 1);

    }
}
