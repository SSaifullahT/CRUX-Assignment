package com.codingblocks.Assignment_8;

import java.util.ArrayList;

public class Keypad {
    public static void main(String[] args) {
       // printKeypad("","12");
        ArrayList<String> list = new ArrayList<>();

        list = keypadArray("","12");
        System.out.println(list);
        System.out.println(countKeypad("","12"));
    }
    public static void printKeypad(String processed, String unprocessed){
         if(unprocessed.isEmpty()){
             System.out.println(processed);
             return;
         }
         int n = unprocessed.charAt(0) - '0';
         unprocessed = unprocessed.substring(1);
        for (int i = 3 * (n - 1); i <= 3 * n - 1 ; i++) {
            if(i == 26){
                continue;
            }
            char ch = (char)((int)'a' + i);
            printKeypad(processed + ch, unprocessed);
        }
    }

    public static ArrayList<String> keypadArray(String processed, String unprocessed){
       if(unprocessed.isEmpty()){
           ArrayList<String> list = new ArrayList<>();
           list.add(processed);
           return list;
       }
        ArrayList link = new ArrayList<>();
        int n = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);
        for (int i = 3 * (n - 1); i <= 3 * n - 1 ; i++) {
            if(i == 26){
                continue;
            }
            char ch = (char)((int)'a' + i);
            link.addAll(keypadArray(processed + ch, unprocessed));
        }
        return link;
    }

    public static int countKeypad(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;
        }
        int a = 0;
        int n = unprocessed.charAt(0) - '0';
        unprocessed = unprocessed.substring(1);
        for (int i = 3 * (n - 1); i <= 3 * n - 1 ; i++) {
            if(i == 26){
                continue;
            }
            char ch = (char)((int)'a' + i);
            a = a + countKeypad(processed + ch, unprocessed);
        }
        return a;
    }
}
