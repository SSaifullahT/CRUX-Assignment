package com.codingblocks.Assignment_4;

import java.util.Arrays;
import java.util.Scanner;

public class PermutationOfArrayElements {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length ; i++) {
            arr[i] = s.nextInt();
        }
        permutation(arr, 0, arr.length -1);
    }
    public static void swap(int[] a, int first, int second)
    {
        int temp;
        temp = a[first];
        a[first] = a[second];
        a[second] = temp;
    }
    public static void permutation(int[] arr, int start, int end)
    {
        if(start == end)
            System.out.println(Arrays.toString(arr));
        for (int i = start; i <= end ; i++) {
            swap(arr,start,i);
            permutation(arr,start+1,end);
            swap(arr,start,i);
        }
    }
}
