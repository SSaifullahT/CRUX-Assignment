package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class LCMofTwoNumbers {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n1 = s.nextInt();
        int n2 = s.nextInt();
        System.out.print(LCM(n1, n2) + " ");
    }
    public static int LCM(int n1, int n2)
    {
        int a = 1;
        int r = 1;
        while((a <= n1)&&(a <= n2))
        {
            if(((n1 % a)==0)&&((n2 % a)==0))
            {
                r = r * a;
                n1 = n1 / a;
                n2 = n2 / a;
            }
            else
            if((n1 % a)==0)
            {
                r = r * a;
                n1 = n1 / a;
            }
            else
            if((n2 % a)==0)
            {
                r = r * a;
                n2 = n2 / a;
            }


            a++;
        }
        r = r * n1 * n2;

        return r;
    }
}
