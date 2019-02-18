package com.codingblocks.Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class SumOf2Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n ; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i < m ; i++) {
            brr[i] = s.nextInt();
        }
        System.out.println(Arrays.toString(sum_of_arrays(arr,brr)));
    }
    public static int[] sum_of_arrays(int[] arr, int[] brr){
        int a = 0;
        int b = 0;
        int place = 1;
        for (int i =arr.length - 1 ; i >= 0 ; i--) {
            a = a + arr[i] * place;
            place = place * 10;
        }
        place = 1;
        for (int i = brr.length - 1; i >= 0 ; i--) {
            b = b + brr[i] * place;
            place = place * 10;
        }
        int c = a + b;
        int d = c;
        int count = 0;
        while(d > 0)
        {
            d = d / 10;
            count++;
        }
        int[] crr = new int[count];
        for (int i = crr.length - 1; i >= 0 ; i--) {
            crr[i] = c % 10;
            c = c / 10;
        }
        return crr;
    }
}
