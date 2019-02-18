package com.codingblocks.Assignment_3;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {

        calculator();

    }
    public static void calculator()
    {
        Scanner s = new Scanner(System.in);

        char c = ' ';
        int z;
        while(true)
        {
            int a = s.nextInt();
            int b = s.nextInt();
            c = s.next().charAt(0);

            if(c == '+') {
                z = a + b;
                System.out.println(z);
            }
            else if(c == '-')
            {   z = a-b;
                System.out.println(z);
            }

            else if(c == '*') {
                z = a * b;
                System.out.println(z);
            }
            else if(c == '/') {
                z = a / b;
                System.out.println(z);
            }
            else if(c == '%') {
                z = a % b;
                System.out.println(z);
            }
            else if((c == 'x')||(c == 'X'))
                break;
            else
                calculator();


        }
    }
}
