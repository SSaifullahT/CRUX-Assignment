package com.codingblocks.Assignment_6;

import java.util.ArrayList;

public class RecursiveSorting {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 3, 2, 1};
        System.out.println(isSorted(arr,0));
        System.out.println(isPresent(arr,0,5));
        System.out.println(isPresentIndexFirst(arr,0,3));
        System.out.println(isPresentIndexLast(arr,arr.length - 1,3));
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println((find(arr,list,0,3)));
        System.out.println(isPalindrome(arr,0));
    }
    public static boolean isSorted(int[] arr, int index){
        if(index == arr.length - 1){
            return true;
        }
        if(arr[index] <= arr[index + 1]){
            return isSorted(arr, index + 1);
        }
        return false;
    }

    public static boolean isPresent(int[] arr, int index, int target){
        if(index == arr.length){
            return false;
        }
        if(arr[index] == target){
            return true;
        }
        return isPresent(arr,index + 1,target);
    }
    public static int isPresentIndexFirst(int[] arr, int index, int target){
        if(index == arr.length){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return isPresentIndexFirst(arr,index + 1,target);
    }
    public static int isPresentIndexLast(int[] arr, int index, int target){
        if(index < 0){
            return -1;
        }
        if(arr[index] == target){
            return index;
        }
        return isPresentIndexLast(arr,index - 1,target);
    }
    public static ArrayList<Integer> find(int[] arr, ArrayList<Integer> list, int index, int target){
        if(index == arr.length){
            return list;
        }
        if(arr[index] == target){
            list.add(index);
            return find(arr, list,index + 1,target);

        }
        return find(arr,list,index + 1,target);
    }
    public static boolean isPalindrome(int[] arr, int index){
        if(index == (arr.length - 1)/ 2){
            return true;
        }
        if(arr[index] == arr[arr.length - 1 - index]){
            return isPalindrome(arr,index + 1);
        }
        return false;
    }
}
