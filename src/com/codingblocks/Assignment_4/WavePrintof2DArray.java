package com.codingblocks.Assignment_4;

import java.util.Scanner;

public class WavePrintof2DArray {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr= new int[n][n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        wave_print(arr);
    }
    public static void wave_print(int[][] arr)
    {
        System.out.print("{");
        for (int i = 0; i < arr.length ; i++) {
            if(i % 2 == 0) {
                for (int j = 0; j < arr.length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
            }
            else
                for (int j = arr.length - 1; j >= 0 ; j--) {
                    System.out.print(arr[i][j] + " ");
                }
        }
        System.out.println("}");
    }
}
