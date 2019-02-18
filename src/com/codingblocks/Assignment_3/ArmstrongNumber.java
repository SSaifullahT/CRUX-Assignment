package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class ArmstrongNumber {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        System.out.println(armstrongNum(n));
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
    public static boolean armstrongNum(int n)
    {
        int a;
        int b = 0;
        int num = n;
        while(num > 0)
        {
            a = num % 10;
            num = num / 10;
            b = b + (int)Math.pow(a,lengthOfNum(n));
        }
        if(n == b)
            return true;
        else
            return false;

    }
}
