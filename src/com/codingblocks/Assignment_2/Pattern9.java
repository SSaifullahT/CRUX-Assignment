package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern9 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int k;
        while (row < n - 1)
        {
            column = 0;
            while (column < row + 1)
            {
                System.out.print(column + 1);
                column++;
            }
            column = 0;
            while (column < 2 * n - 3 - 2 * row)
            {
                System.out.print(" ");
                column++;
            }
            column =0;
            k = row + 1;
            while (column < row +1)
            {
                System.out.print(k);
                k--;
                column++;
            }
            System.out.println();
            row++;
        }
        column = 0;
        k=1;
        while(column < 2 * n - 1)
        {
            if(column <= n)
            {
                System.out.print(k);
                k++;
            }
            else
            {
                System.out.print(k);
                k--;
            }
            column++;
        }
    }
}
