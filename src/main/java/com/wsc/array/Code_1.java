package com.wsc.array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Code_1 {
    public static int[] twoSum(int[] nums, int target) {
        int length = nums.length;
        Map<Integer, Integer> map = new HashMap<>(length);
        for (int i = 0; i < length; i++) {
            int num = nums[i];
            int k = target - num;
            Integer v = map.getOrDefault(k, null);
            if (v != null) {
                return new int[]{v, i};
            }
            map.put(num, i);
        }

        return new int[]{0};
    }


    public static void main(String[] args) {

        int[] arr1 = {2, 7, 11, 15};
        System.out.println(Arrays.toString(twoSum(arr1, 9)));

        int[] arr2 = {3, 2, 4};
        System.out.println(Arrays.toString(twoSum(arr2, 6)));

        int[] arr3 = {3, 3};
        System.out.println(Arrays.toString(twoSum(arr3, 6)));
    }
}