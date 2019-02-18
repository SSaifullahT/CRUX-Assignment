package com.codingblocks.Assignment_4;

import java.util.Scanner;

public class WavePrintColumnWise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr= new int[n][n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        wave_print_column(arr);
    }
    public static void wave_print_column(int[][] arr){
        for (int j = 0; j < arr.length ; j++) {
            if(j % 2 == 0)
            {
                for (int i = 0; i < arr.length ; i++) {

                    System.out.print(arr[i][j] +" ");

                }
            }
            else
                for (int i = arr.length - 1; i >= 0 ; i--) {
                    System.out.print(arr[i][j] + " ");
                }
        }
    }
}
