package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int reverse=0;
        int temp;
        while(number>0)
        {
            temp = number%10;
            number = number/10;
            reverse = reverse*10 + temp;
        }
        System.out.println(reverse);
    }
}
