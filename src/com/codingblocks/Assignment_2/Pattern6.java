package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern6 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int k = 0;
        while(k < n)
        {
            column = 0;
            while(column <= n/2 - row)
            {
                System.out.print("*");
                column++;
            }
            column = 0;
            while (column <= 2 * row + 1)
            {
                System.out.print(" ");
                column++;
            }
            column = 0;
            while(column <= n/2 - row)
            {
                System.out.print("*");
                column++;
            }
            System.out.println();
            k++;
            if(k <= n/2)
                row++;
            else
                row--;

        }
    }
}
