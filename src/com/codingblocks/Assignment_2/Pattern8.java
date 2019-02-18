package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern8 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int k = 0;
        int l = 0;
        int z = 2 * n - 1;
        while (l < z)
        {

            //while (row < z)
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
                    if (column < row)
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
                System.out.println();
                l++;
                if (l < n)
                    row++;
                else
                    row--;
                //l++;
            }

        }
    }
}
