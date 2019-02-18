package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class LogX {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(log(x,n));
    }
    public static int log(int x, int n)
    {
        int a = 1;
        int b = n;
        while(b < x)
        {
            b = b * n;
            a++;
        }
        return a;

    }
}
