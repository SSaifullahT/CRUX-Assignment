package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class UpperAndLowerCase {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        char a = s.next().charAt(0);
        System.out.println(cases(a));
    }
    public static char cases(char a)
    {

        if((a >= 65)&&(a <= 90))
            return 'U';
        else
        if((a >= 97)&&(a <= 122))
            return 'L';
        else
            return 'I';
    }
}
