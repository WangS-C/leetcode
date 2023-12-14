package com.wsc.array;

import java.util.Arrays;

public class Code_66 {
    public static int[] plusOne(int[] digits) {
        int length = digits.length;
        int index = length - 1;
        for (int i = index; i >= 0; i--) {
            if (digits[i] == 9) {
                digits[i] = 0;
            } else {
                digits[i] += 1;
                return digits;
            }
        }

        int[] result = new int[length + 1];
        result[0]=1;
        return result;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        System.out.println(Arrays.toString(plusOne(arr1)));

        int[] arr2 = {4, 3, 2, 1};
        System.out.println(Arrays.toString(plusOne(arr2)));

        int[] arr3 = {0};
        System.out.println(Arrays.toString(plusOne(arr3)));

        int[] arr4 = {9,9,9};
        System.out.println(Arrays.toString(plusOne(arr4)));
    }
}