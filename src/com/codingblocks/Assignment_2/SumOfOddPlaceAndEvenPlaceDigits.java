package com.codingblocks.Assignment_2;

import java.util.Scanner;

public class SumOfOddPlaceAndEvenPlaceDigits {
    public static void main(String[] args) {
        // write your code here
        Scanner s = new Scanner(System.in);
        int number = s.nextInt();
        int sum_odd = 0;
        int sum_even = 0;
        int temp;
        while(number > 0)
        {
            temp = number % 10;
            number = number / 10;
            sum_odd = sum_odd + temp;
            temp = number % 10;
            number = number /10;
            sum_even = sum_even + temp;
        }
        System.out.println(sum_odd);
        System.out.println(sum_even);
    }
}
