package com.codingblocks.Assignment_4;

import java.util.Scanner;

public class Spiral2DantiClockwise {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[][] arr= new int[n][n];

        for (int i = 0; i < n ; i++) {
            for (int j = 0; j < n ; j++) {
                arr[i][j] = s.nextInt();
            }
        }
        spiral_anticlock(arr,n);
    }
    public static void spiral_anticlock(int[][] arr, int n)
    {
        int i = 0;
        int j = 0;
        int k = 0;
        int l =0;
        while(k < arr.length * arr[0].length) {
            while (k < n * n && j < arr.length - l) {
                System.out.print(arr[j][i] + " ");
                j++;
                k++;
            }
            j--;
            i++;
            while (k < n * n && i < arr.length - l) {
                System.out.print(arr[j][i] + " ");
                i++;
                k++;
            }
            i--;
            j--;
            while (k < n * n && j >= 0 - l) {
                System.out.print(arr[j][i] + " ");
                j--;
                k++;
            }
            j++;
            i--;
            while (k < n * n && i >= 1 - l) {
                System.out.print(arr[j][i] + " ");
                i--;
                k++;
            }
            i++;
            j++;
            l++;
        }
    }
}
