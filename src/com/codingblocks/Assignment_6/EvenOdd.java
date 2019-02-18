package com.codingblocks.Assignment_6;

import java.util.Scanner;

public class EvenOdd {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
       // printOdd(n,n / 2);
       // printeven(n, 1);
        int N = n;
        printEvenOdd(n,N);
    }
    public static void printOdd(int n, int point){
        if(point <= 0){
            return;
        }
        System.out.print((2 * point - 1) + ",");
        printOdd(n, point - 1);
    }
    public static void printeven(int n, int point){
        if(point >= n / 2){
            return;
        }
        System.out.print(2* point + ",");
        printeven(n, point + 1);
    }
    public static void printEvenOdd(int n, int N){
        if(n < 1 || n > N){
            return;
        }
        if (N % 2 == 0) {
            System.out.print(n - 1 + ", ");
            printEvenOdd(n - 2,N);

           if(n != N) {
               System.out.print(n + ", ");
           }
        }else{
            System.out.print(n + ", ");
            printEvenOdd(n - 2,N);
            if(n < N) {
                System.out.print(n + 1 + ", ");
            }
            //printEvenOdd(n + 2,N);
        }
        //printEvenOdd(n - 2);
       // System.out.print(n + 1);
        //printEvenOdd(n + 1);
    }
}
