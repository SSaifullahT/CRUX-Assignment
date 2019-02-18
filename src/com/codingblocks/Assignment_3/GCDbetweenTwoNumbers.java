package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class GCDbetweenTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.print(GCD(n1,n2)+" ");
    }
    public static int GCD(int n1, int n2)
    {
        int a = 1;
        int r = 1;
        while((a <= n1)&&(a <= n2))
        {
            if(((n1 % a)==0)&&((n2 % a)==0))
                r = a;

            a++;
        }
        return r;
    }
}
