package com.codingblocks.Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class IntersectionOf2Arrays {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr =new int[n];
        for (int i = 0; i <n ; i++) {
            arr[i] = s.nextInt();
        }
        int m = s.nextInt();
        int[] brr = new int[m];
        for (int i = 0; i <m ; i++) {
            brr[i] = s.nextInt();

        }

        //int[] arr = {1, 2, 3, 1, 2, 4, 10};
        //int[] brr = {2, 1, 3, 1, 5, 2, 2};
        System.out.println(Arrays.toString(intersection(arr, brr)));
        //intersection(arr,brr);
    }
    public static int[] intersection(int[] arr, int[] brr)
    {
        int k = 0;
        //int[] crr = new int[arr.length];
        int[] crr = arr.clone();
        int[] drr = brr.clone();

        for (int i = 0; i <arr.length ; i++) {
            for (int j = 0; j <brr.length ; j++) {
                if(arr[i] == brr[j]){
                    k++;
                    arr[i] = -10000;
                    brr[j] = 10000;
                }


            }

        }
        //System.out.println(Arrays.toString(crr));
        //System.out.println(Arrays.toString(drr));

        //System.out.println(k);
        int l = 0;
        int[] inter = new int[k];
        for (int i = 0; i <crr.length ; i++) {
            for (int j = 0; j <drr.length ; j++) {
                if(crr[i] == drr[j]){
                    inter[l] = crr[i];
                    l++;
                    crr[i] = -10000;
                    drr[j] = 10000;
                }


            }

        }
        Arrays.sort(inter);
        return inter;
    }
}
