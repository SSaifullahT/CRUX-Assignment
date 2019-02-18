package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class SequenceSpiliting {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int a[];
        a = new int[n];
        int i = 0;
        int num = n;
        while(n > 0)
        {
            a[i] = s.nextInt();
            i++;
            n--;

        }

        sequence(a,num);

    }
    public static void sequence(int[] a ,int  num)
    {
        int i = 0;
        int l = 0;

        while(i < num-1 && a[i] > a[i + 1])
        {
            i++;

        }
        while(i < num - 1)
        {
            if(a[i] > a[i + 1])
                l = 1;
            i++;
        }
        if(l == 1)
            System.out.println(false);
        else
            System.out.println(true);
    }

}
