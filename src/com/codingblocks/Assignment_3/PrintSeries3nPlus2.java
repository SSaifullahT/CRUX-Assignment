package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class PrintSeries3nPlus2 {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        series(n1,n2);
    }
    public static void series(int n1,int n2)
    {
        int k;
        int n = 0;
        while(n1 > 0)
        {
            k = 3 * n + 2;
            n++;
            if(k % n2 != 0)
            {
                System.out.println(k);
                n1--;
            }

        }
    }
}
