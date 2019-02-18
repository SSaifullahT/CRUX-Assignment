package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Fibionaci {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int first = 0;
        int second = 1;
        int temp;
        while(n>0)
        {
            temp = first + second;
            first = second;
            second = temp;
            n--;
        }
        System.out.println(first);
    }
}
