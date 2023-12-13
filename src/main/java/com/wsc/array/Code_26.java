package com.wsc.array;

import java.util.Arrays;

public class Code_26 {
    public static int removeDuplicates(int[] nums) {
        int index = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index]) {
                nums[++index] = nums[i];
            }
            if (index != i) {
                nums[i] = -1;
            }
        }
        System.out.println(Arrays.toString(nums));
        return index + 1;
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 1, 2};
        System.out.println(removeDuplicates(arr1));

        int[] arr2 = {0, 0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr2));

        int[] arr3 = {0, 1, 1, 1, 2, 2, 3, 3, 4};
        System.out.println(removeDuplicates(arr3));


        int[] arr4 = {0, 1, 1, 1, 3, 3, 3, 3, 4};
        System.out.println(removeDuplicates(arr4));

        int[] arr5 = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println(removeDuplicates(arr5));
    }
}