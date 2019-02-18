package com.codingblocks.Assignment_8;

import java.util.ArrayList;

public class SubStrings {
    public static void main(String[] args) {
       // printSubString("","abcd");
        ArrayList<String> list = subStringArray("","abc");
        System.out.println(list);
        System.out.println(countSubString("","abc"));
    }

    public static void printSubString(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        printSubString(processed, unprocessed);

        printSubString(processed + ch, unprocessed);
    }

    public static ArrayList<String> subStringArray(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

                list.add(processed);

            return list;
        }
        //ArrayList list = new ArrayList();
        char first = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        ArrayList<String> left = subStringArray(processed + first, unprocessed);
        ArrayList<String> right = subStringArray(processed , unprocessed);
        left.addAll(right);
        return left;
    }

    public static int countSubString(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;

        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        int a = 0;
        a = a + countSubString(processed, unprocessed);

        a = a + countSubString(processed + ch, unprocessed);

        return a;
    }

}
