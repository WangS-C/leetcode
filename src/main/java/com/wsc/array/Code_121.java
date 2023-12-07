package com.wsc.array;

public class Code_121 {
    public static int maxProfit(int[] prices) {
        int min = Integer.MAX_VALUE;

        int max = 0;
        for (int price : prices) {
            if (price < min) {
                min = price;
                continue;
            }
            int i = price - min;
            max = Math.max(i, max);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr1));
        int[] arr2 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr2));
    }
}