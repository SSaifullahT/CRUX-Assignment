package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class PrintingPrimeNumbers {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int k;
        int i;
        int a=2;
        while(a<=n)
        {
            k=1;
            i=2;
            while(i*i<=a)
            {
                if(a%i==0)
                    k=0;
                i++;
            }
            if(k==1)
                System.out.println(a);
            a++;
        }
    }
}
