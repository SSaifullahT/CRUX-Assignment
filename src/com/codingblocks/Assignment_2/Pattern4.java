package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        int first = 0;
        int second = 1;
        int temp;
        while(row < n)
        {
            column = 0;
            while( column < row)
            {
                System.out.print(first);
                System.out.print(" ");
                temp = first + second;
                first = second;
                second = temp;
                column++;

            }
            System.out.println();
            row++;
        }
    }
}
