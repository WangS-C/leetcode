package com.wsc.array;

public class Code_122 {
    public static int maxProfit(int[] prices) {
        int tmp = prices[0];
        int max = 0;
        int length = prices.length;
        for (int i = 1; i < length; i++) {
            int price = prices[i];
            max += Math.max(price - tmp, 0);
            tmp = price;
        }
        return max;
    }

    public static void main(String[] args) {
        int[] arr1 = {7, 1, 5, 3, 6, 4};
        System.out.println(maxProfit(arr1));

        int[] arr2 = {1, 2, 3, 4, 5};
        System.out.println(maxProfit(arr2));

        int[] arr3 = {7, 6, 4, 3, 1};
        System.out.println(maxProfit(arr3));


        System.out.println(-arr3[0]);
    }
}