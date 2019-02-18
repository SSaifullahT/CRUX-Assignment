package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int num = 1;
        while(row < n)
        {
            column = 0;
            while (column <= row)
            {
                System.out.print(num);
                System.out.print(" ");
                num++;
                column++;
            }
            System.out.println();
            row++;
        }

    }
}
