package com.codingblocks.Assignment_8;

import java.util.ArrayList;

public class Permutation {
    public static void main(String[] args) {
       // printPermutation("","abc");
        System.out.println(permutationArray("","abc"));
        System.out.println(countPermutation("","abc"));
    }
    public static void printPermutation(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            System.out.println(processed);
            return;
        }
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i < processed.length() + 1 ; i++) {
            printPermutation(processed.substring(0,i) + ch + processed.substring(i),unprocessed);

        }
    }

    public static ArrayList<String> permutationArray(String processed, String unprocessed){
        if(unprocessed.isEmpty()){
            ArrayList<String> list = new ArrayList<>();
            list.add(processed);
            return list;
        }
        ArrayList<String> list = new ArrayList<>();
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i < processed.length() + 1 ; i++) {
           list.addAll(permutationArray(processed.substring(0,i) + ch + processed.substring(i),unprocessed));

        }
        return list;
    }

    public static int countPermutation(String processed, String unprocessed) {
        if (unprocessed.isEmpty()) {

            return 1;
        }
        int a = 0;
        char ch = unprocessed.charAt(0);
        unprocessed = unprocessed.substring(1);
        for (int i = 0; i < processed.length() + 1; i++) {
            a = a + countPermutation(processed.substring(0, i) + ch + processed.substring(i), unprocessed);

        }
        return a;
    }
}
