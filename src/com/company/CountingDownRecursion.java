package com.company;

public class CountingDownRecursion {
    public static void main(String[] args) {

        countDown(10, 0);
        System.out.println("-----------");
        countDown2(10, 0);
    }

    public static void countDown(int start, int stop) {
        System.out.println(start);
        start--;
        if (start < stop) {
            return;
        } else {
            countDown(start, stop);
        }

    }

    public static void countDown2(int start, int stop) {
        System.out.println(start);
        start--;
        if (start >= stop) {
            countDown2(start, stop);
        }
    }
}
