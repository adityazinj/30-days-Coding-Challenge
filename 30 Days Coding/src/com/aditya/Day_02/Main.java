package com.aditya.Day_02;
//Given a sorted array arr[] and a number x,
//write a function to count the occurrences of x in arr[].
public class Main {
    public static void main(String[] args) {
        int[] arr = {10,14,19,26,27,14,33,35,42,14};
        int x = 14;
        int ans = occOfX(arr,x);
        System.out.println(ans);

    }
    public static int occOfX(int[] arr,int x) {
        int rep = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == x) {
                rep++;
            }
        }
        return rep;
    }
}
