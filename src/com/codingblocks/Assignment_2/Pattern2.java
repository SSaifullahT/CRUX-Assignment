package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class Pattern2 {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int row = 0;
        int column;
        while(row < n)
        {
            column = 0;
            while(column <= row)
            {
                if((column==0)||(column==row))
                    System.out.print(row+1);
                else
                    System.out.print("0");
                column++;
            }
            System.out.println();
            row++;
        }
    }
}
