package com.wsc.array;

import java.util.Arrays;

public class Code_283 {
    public static void moveZeroes(int[] nums) {
        int l = 0, r = 0;
        int length = nums.length;
        while (r < length) {
            int v = nums[r];
            if (v == 0) {
                r++;
                continue;
            }
            if (v != nums[l]) {
                swap(nums, l, r);
            }
            l++;
            r++;
        }

    }

    public static void swap(int[] nums, int l, int r) {
        int temp = nums[l];
        nums[l] = nums[r];
        nums[r] = temp;
    }

    public static void main(String[] args) {
        int[] arr1 = {0, 1, 0, 3, 12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));

        int[] arr3 = {1, 2, 21, 1, 3, 0, 3, 12};
        moveZeroes(arr3);
        System.out.println(Arrays.toString(arr3));
    }
}