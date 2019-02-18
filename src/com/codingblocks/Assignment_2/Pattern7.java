package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern7 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int k = 0;
        while(row < n)
        {
            column = 0;
            while (column < n - row - 1)
            {
                System.out.print(" ");
                column++;
            }
            column = 0;
            k = row;
            while (column < 2 * row + 1)
            {
                if (column < row )
                {
                    System.out.print(k + 1);
                    column++;
                    k++;
                }
                else
                {
                    System.out.print(k + 1);
                    column++;
                    k--;
                }
            }
            row++;
            System.out.println();
        }
    }
}
