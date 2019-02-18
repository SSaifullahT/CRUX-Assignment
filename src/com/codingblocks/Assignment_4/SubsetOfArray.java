package com.codingblocks.Assignment_4;

import java.util.Scanner;

public class SubsetOfArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i <arr.length ; i++) {
            arr[i] = s.nextInt();
        }
        subset(arr);
    }
    public static void subset(int[] arr) {
        for (int increment = 1; increment < arr.length ; increment++) {
            for (int n = 0; n < arr.length; n++) {
                for (int i = n; i < arr.length; i++) {
                    System.out.print("{");
                    for (int j = n; j <= i; j= j + increment) {
                        System.out.print(arr[j] + " ");
                    }
                    System.out.print("}, ");
                }
            }
        }
    }
}
