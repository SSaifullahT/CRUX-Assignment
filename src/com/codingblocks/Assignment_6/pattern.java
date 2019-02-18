package com.codingblocks.Assignment_6;

import java.util.Scanner;

public class pattern {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        // patterndown(n,1,0);
        patternup(n,1,0);

    }
    public static void patterndown(int n, int row, int col){
        if(row == n + 1 || col == n){
            return;
        }
        if(row == col){
            System.out.println();
            patterndown(n, row + 1, 0);
            return;
        }
        System.out.print("* ");
        patterndown(n, row,col + 1);
    }
    public static void patternup(int n, int row, int col){
        if(row == n + 1 || col == n){
            return;
        }
        if(row == col){
            patternup(n, row + 1, 0);

            System.out.println();
            return;
        }
        patternup(n, row,col + 1);

        System.out.print("* ");
    }
}
