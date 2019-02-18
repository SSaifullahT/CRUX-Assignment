package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class NumberOfArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        armstrongNum(n1,n2);
        //System.out.print(armstrongNum(n1,n2)+" ");
    }
    public static int lengthOfNum(int n)
    {
        int l = 0;
        //int a = n;
        while(n > 0)
        {
            n = n/10;
            l++;
        }
        return l;
    }
    public static void armstrongNum(int n1, int n2)
    {
        int a;
        int b;
        int num = n1;
        while(num <= n2)
        {
            b = 0;
            int n = num;
            while(n > 0)
            {
                a = n % 10;
                n = n / 10;
                b = b + (int)Math.pow(a,lengthOfNum(num));
            }
            if(num == b)
                System.out.print(num+" ");
            num++;
        }

    }
}
