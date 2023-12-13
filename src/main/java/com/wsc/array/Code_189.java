package com.wsc.array;

import java.util.Arrays;

public class Code_189 {
    public static void rotate(int[] nums, int k) {
        int length = nums.length;
//        这是防止越界
        k %= length;
        System.out.println(k);
        System.out.println(Arrays.toString(nums));
//        第一步全量翻转

        reverse(nums, 0, length - 1);
        System.out.println(Arrays.toString(nums));
//        在翻转前面的部分
        reverse(nums, 0, k - 1);
        System.out.println(Arrays.toString(nums));
//        在翻转后面的部分
        reverse(nums, k, length - 1);
        System.out.println(Arrays.toString(nums));
        System.out.println("--------------------------");
    }

    public static void reverse(int[] nums, int start, int end) {
        int tmp;
        while (start < end) {
            tmp = nums[start];
            nums[start++] = nums[end];
            nums[end--] = tmp;
        }
    }

    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7};
        rotate(arr1, 31);

        int[] arr2 = {-1, -100, 3, 99};
        rotate(arr2, 2);
    }
}