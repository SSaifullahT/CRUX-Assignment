package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class SquareRootWithPrecision {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int p = s.nextInt();
        double a = sqrtpre(n,p);
        System.out.print(a);

    }
    public static double sqrtpre(int n, int p)
    {
        int i = 0;
        while(i*i<= n)
        {

            i++;
        }
        i--;
        double a = i;
        double b = 0.1;
        i = 0;
        while(i < p)
        {
            while(a * a <= n)
            {
                a = a + b;
            }
            a = a - b;
            i++;
            b = b/10;
        }
        return a;


    }
}
