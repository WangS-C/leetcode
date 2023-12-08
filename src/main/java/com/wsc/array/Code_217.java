package com.wsc.array;

import java.util.Arrays;

public class Code_217 {
    public static boolean containsDuplicate(int[] nums) {
        Arrays.sort(nums);
        int size = nums.length-1;
        for (int i = 0; i < size; i++) {
            if (nums[i]==nums[i+1]){
                return true;
            }
        }

        return false;
    }

    public static void main(String[] args) {
        int[] arr1 = {1,2,3,1};
        System.out.println(containsDuplicate(arr1));

        int[] arr2 = {1,2,3,4};
        System.out.println(containsDuplicate(arr2));

        int[] arr3 = {1,1,1,3,3,4,3,2,4,2};
        System.out.println(containsDuplicate(arr3));
    }
}