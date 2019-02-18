package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class PrintFibionaciNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        int temp;
        while(first<n)
        {
            System.out.println(first);
            temp = first + second;
            first = second;
            second = temp;
        }
    }
}
