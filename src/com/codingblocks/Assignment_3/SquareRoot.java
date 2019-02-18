package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(sqrt(n));

    }
    public static int sqrt(int n)
    {
        int i = 0;
        while(i*i<= n)
        {

            i++;
        }
        i--;
        return i;

    }
}
