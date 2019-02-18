package com.codingblocks.Assignment_8;

import java.util.ArrayList;

public class ASCIIsubSequence {
    public static void main(String[] args) {
        //printSubStringASCII("","abcd");
        ArrayList<String> list = subStringArrayASCII("","abc");
        System.out.println(list);
        System.out.println(countSubStringASCII("","abc"));
    }

    public static void printSubStringASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        int fin = (int)(unprocessed.charAt(0));
        unprocessed = unprocessed.substring(1);

        printSubStringASCII(processed, unprocessed);
        printSubStringASCII(processed + ch, unprocessed);
        printSubStringASCII(processed + fin,unprocessed);
    }

    public static ArrayList<String> subStringArrayASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();

            list.add(processed);

            return list;
        }
        //ArrayList list = new ArrayList();
        char first = unprocessed.charAt(0);
        int fin = (int)(unprocessed.charAt(0));
        unprocessed = unprocessed.substring(1);
        ArrayList<String> left = subStringArrayASCII(processed + first, unprocessed);
        ArrayList<String> middle = subStringArrayASCII(processed + fin, unprocessed);
        ArrayList<String> right = subStringArrayASCII(processed , unprocessed);
        left.addAll(middle);
        left.addAll(right);
        return left;
    }

    public static int countSubStringASCII(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            return 1;

        }
        char ch = unprocessed.charAt(0);
        int fin = (int)(unprocessed.charAt(0));
        unprocessed = unprocessed.substring(1);
        int a = 0;
        a = a + countSubStringASCII(processed, unprocessed);
        a = a+ countSubStringASCII(processed + fin, unprocessed);
        a = a + countSubStringASCII(processed + ch, unprocessed);

        return a;
    }
}
