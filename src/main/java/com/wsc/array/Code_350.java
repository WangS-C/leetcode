package com.wsc.array;

import java.util.*;

public class Code_350 {
    public static int[] intersect(int[] nums1, int[] nums2) {
        int length = nums1.length;
        if (length > nums2.length) {
            return intersect(nums2, nums1);
        }

        Map<Integer, Integer> map = new HashMap<>(length);
        for (int num : nums1) {
            int count = map.getOrDefault(num, 0) + 1;
            map.put(num, count);
        }

        int index = 0;
        for (int num : nums2) {
            Integer count = map.getOrDefault(num, 0);
            if (count <= 0) {
                continue;
            }
            nums1[index++] = num;
            if (--count > 0) {
                map.put(num, count);
            } else {
                map.remove(num);
            }
        }

        return Arrays.copyOfRange(nums1, 0, index);
    }

    public static int[] intersect2(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);

        int length1 = nums1.length;
        int length2 = nums2.length;
        int[] ints = new int[Math.min(length1, length2)];
        int index1 = 0, index2 = 0, index = 0;

        while (index1 < length1 && index2 < length2) {
            int num1 = nums1[index1];
            int num2 = nums2[index2];
            if (num1 == num2) {
                ints[index++] = num2;
                index1++;
                index2++;
            } else if (num1 < num2) {
                index1++;
            } else {
                index2++;
            }
        }

        return Arrays.copyOfRange(ints, 0, index);
    }

    public static void main(String[] args) {

        int[] arr1 = {1, 2, 2, 1};
        int[] arr2 = {2, 2};
        System.out.println(Arrays.toString(intersect(arr1, arr2)));

        int[] arr3 = {4, 9, 5};
        int[] arr4 = {9, 4, 9, 8, 4};
        System.out.println(Arrays.toString(intersect(arr3, arr4)));

        System.out.println(Arrays.toString(intersect2(arr1, arr2)));
        System.out.println(Arrays.toString(intersect2(arr3, arr4)));
    }
}