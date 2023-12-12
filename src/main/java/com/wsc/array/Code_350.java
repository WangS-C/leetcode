package com.wsc.array;

import java.util.Arrays;

public class Code_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {

        return nums1;
    }

    public static void main(String[] args) {

        int[] arr1 = {1,2,2,1};
        int[] arr2 = {2,2};
        System.out.println(Arrays.toString(intersect(arr1,arr2)));

        int[] arr3 = {4,9,5};
        int[] arr4 = {9,4,9,8,4};
        System.out.println(Arrays.toString(intersect(arr3,arr4)));
    }
}