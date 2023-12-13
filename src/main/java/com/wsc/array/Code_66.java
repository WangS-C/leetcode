package com.wsc.array;

import java.util.Arrays;

public class Code_66 {
    public static int[] plusOne(int[] digits) {

        return digits;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3};
        System.out.println(Arrays.toString(plusOne(arr1)));

        int[] arr2 = {4,3,2,1};
        System.out.println(Arrays.toString(plusOne(arr2)));

        int[] arr3 = {0};
        System.out.println(Arrays.toString(plusOne(arr3)));
    }
}