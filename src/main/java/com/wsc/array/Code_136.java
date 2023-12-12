package com.wsc.array;

public class Code_136 {
    public static int singleNumber(int[] nums) {
        int i = 0;
        for (int num : nums) {
            i = num ^ i;
        }
        return i;
    }


    public static void main(String[] args) {
        int[] arr1 = {2, 2, 1};
        System.out.println(singleNumber(arr1));

        int[] arr2 = {4, 1, 2, 1, 2};
        System.out.println(singleNumber(arr2));

        int[] arr3 = {1};
        System.out.println(singleNumber(arr3));
    }
}