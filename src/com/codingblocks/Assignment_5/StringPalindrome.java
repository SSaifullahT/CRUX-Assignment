package com.codingblocks.Assignment_5;

public class StringPalindrome {
    public static void main(String[] args) {
        System.out.println(palindrome("abbac",0));
    }
    public static boolean palindrome(String str,int index){
        if(index == str.length() / 2){
            return true;
        }
        if(str.charAt(index) == str.charAt(str.length() - index - 1)){
            return palindrome(str, index + 1);
        }
        return false;
    }
}
