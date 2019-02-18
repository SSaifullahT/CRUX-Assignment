package com.codingblocks.Assignment_5;

public class CountSubstringPalindrome {
    public static void main(String[] args) {
        countPalindromeSub("abaabaa");
    }
    public static void countPalindromeSub(String line) {
        int count = 0;
        for (int i = 0; i < line.length() ; i++) {
            int left = i;
            int right = i;
            while(left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right))
            {
                count++;
                left--;
                right++;
            }
        }
        for (int i = 0; i < line.length() ; i++) {
            int left = i;
            int right = i + 1;
            while (left >= 0 && right < line.length() && line.charAt(left) == line.charAt(right)) {
                count++;
                left--;
                right++;
            }
        }
        System.out.println(count);
    }
}
