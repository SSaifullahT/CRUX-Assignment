package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Prime {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int i=2;
        int k=1;
        while(i*i<=n)
        {
            if(n%i==0)
                k=0;
            i++;
        }
        if(k==1)
            System.out.println("Prime");
        else
            System.out.println("Not Prime");

    }
}
