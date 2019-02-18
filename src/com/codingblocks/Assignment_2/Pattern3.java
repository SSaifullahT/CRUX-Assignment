package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        while(row < n)
        {
            column = 0;
            int a = 1;
            while(column <= row)
            {
//                if((column==0)||(column==row))
//                    System.out.println("1");
//                else
//
//                System.out.println("");
                System.out.print(a+" ");
                a = ((row - column)*a /(column + 1));
                //System.out.print(a);

                column++;
            }
            System.out.println();
            row++;
        }
    }
}
