package com.wsc.array;

import java.util.Arrays;

public class Code_283 {
    public static void moveZeroes(int[] nums) {


    }

    public static void main(String[] args) {
        int[] arr1 = {0,1,0,3,12};
        moveZeroes(arr1);
        System.out.println(Arrays.toString(arr1));

        int[] arr2 = {0};
        moveZeroes(arr2);
        System.out.println(Arrays.toString(arr2));
    }
}