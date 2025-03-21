package com.aditya.Day_1;


//Kth Largest Element

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] arr = {1,4,3,8,4,9,2,5,6};
        int ans = kthLargest(arr);
        System.out.println(ans);

    }
    public static int kthLargest(int[] arr) {
        int max = arr[0];
        for (int i = 0; i < arr.length; i++) {
            if (max < arr[i]) {
                max = arr[i];
            }
        }
        return max;
    }

}