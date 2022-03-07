package com.company;

public class MultidimensionalArrays {
    public static void main(String[] args) {
        int[][] arrayInception = {
                {1, 1, 1},
                {1, 1, 1},
                {1, 1, 1},
        };
        for (int i = 0; i < arrayInception.length; i++) {
            for (int j = 0; j < arrayInception[i].length; j++) {

                System.out.print(arrayInception[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("--------------------");

        arrayInception[1][1]=9;

        arrayInception[0][0]=3;
        arrayInception[0][2]=3;
        arrayInception[2][0]=3;
        arrayInception[2][2]=3;

        //
        for (int [] array : arrayInception) {
            for (int element : array) { //hier sagen wir dem Computer, dass jede Sache in einem Array "Element" heißt
                System.out.print(element + " "); // das schreiben wir, damit wir die gewünschte Form bekommen!!!
            }
            System.out.println();
        }
    }
}
