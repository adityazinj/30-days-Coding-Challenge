package com.aditya.Day_3;

//Write a program to check if a given number is prime or not.
public class Main {
    public static void main(String[] args) {
        int x = 7;
        isPrime(x);

    }
    public static void isPrime(int x) {
        if (x == 1) {
            System.out.println("Not Prime");
            return;
        }
        for (int i = 2; i*i < x; i++) {
            if (x%i == 0) {
                System.out.println("Not Prime");
                return;
            }

        }
        System.out.println("Prime");

    }

}
