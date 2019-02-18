package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class xPowerN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int x = s.nextInt();
        int n = s.nextInt();
        System.out.println(power(x,n));
    }
    public static int power(int x, int n)
    {
        int X = x;
        while(n > 1)
        {
            X = X * x;
            n--;
        }
        return X;
    }
}
