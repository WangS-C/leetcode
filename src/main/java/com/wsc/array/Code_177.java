package com.wsc.array;

import java.util.Arrays;

public class Code_177 {
    public static int[] sockCollocation(int[] sockets) {
        int i = 0;
        for (int socket : sockets) {
            i = socket ^ i;
        }
        System.out.println(Integer.toBinaryString(i));

        int lowestBit = i & -i;
        System.out.println(Integer.toBinaryString(lowestBit));

        int a = 0, b = 0;
        for (int socket : sockets) {
            if ((socket & lowestBit) == 0) {
                a = socket ^ a;
            } else {
                b = socket ^ b;
            }
        }

        return new int[]{a, b};
    }

    public static void main(String[] args) {
        System.out.println(Integer.toBinaryString(0));

        int[] arr1 = {4, 5, 2, 4, 6, 6};
        System.out.println(Arrays.toString(sockCollocation(arr1)));

        int[] arr2 = {1, 2, 4, 1, 4, 3, 12, 3};
        System.out.println(Arrays.toString(sockCollocation(arr2)));
    }
}