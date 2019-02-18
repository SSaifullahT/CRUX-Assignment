package com.codingblocks.Assignment_4;

import java.util.Scanner;

public class TargetSum {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = s.nextInt();
        }
//        int m = s.nextInt();
//        int[] brr = new int[m];
//        for (int i = 0; i < m; i++) {
//            brr[i] = s.nextInt();
//        }
        int k = s.nextInt();
        target_pair(arr,k);
    }

    public static void target_pair(int[] arr, int k)
    {
        for (int i = 0; i < arr.length ; i++) {
            for (int j = i; j < arr.length ; j++) {
                if (i != j)
                {
                    if(arr[i] + arr[j] == k)
                    {
                        System.out.println(arr[i] + "," + arr[j]);
                        //System.out.print();
                    }

                }
            }
            //System.out.println();
        }
    }
}
