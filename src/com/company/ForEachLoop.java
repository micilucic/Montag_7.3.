package com.company;

import java.util.Arrays;

public class ForEachLoop {
    public static void main(String[] args) {
        int[] array = new int[] {12, 13, 14, 15, 16};
        System.out.println(Arrays.toString(array));

        for (int number : array) {
            array [number - 12] += 13;
        }
        System.out.println(Arrays.toString(array));

    }
}
