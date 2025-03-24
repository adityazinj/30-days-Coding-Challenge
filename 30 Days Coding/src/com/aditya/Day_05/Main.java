package com.aditya.Day_05;

// write a program to arrange the numbers in:
//Ascending And Descending Order

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {12,10,43,55,89,33};
        arraySorting(arr);

    }
    public static void arraySorting(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] > arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Ascending Order :-"+Arrays.toString(arr));

        for (int i = 0; i < arr.length; i++) {
            for (int j = 1; j < arr.length; j++) {
                if (arr[j-1] < arr[j]) {
                    int temp = arr[j-1];
                    arr[j-1] = arr[j];
                    arr[j] = temp;
                }
            }
        }
        System.out.println("Descending Order :-"+Arrays.toString(arr));
    }
}
