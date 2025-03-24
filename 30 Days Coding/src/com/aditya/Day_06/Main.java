package com.aditya.Day_06;
//Write a program to search is x is present in the array or not
public class Main {
    public static void main(String[] args) {
        int[] arr = {3,8,1,7,5,9,10,14,17,77,54,4};
        int target = 17;
        System.out.println(easySearch(arr,target));

    }
    public static String easySearch(int[]arr,int target) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == target) {
                return "Found";
            }
        }
        return "Not Found";
    }
}
