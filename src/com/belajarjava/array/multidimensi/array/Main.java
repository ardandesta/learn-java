package com.belajarjava.array.multidimensi.array;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[][] array_2D = {{1, 2, 3}, {4, 5, 6}};

        System.out.println(array_2D);
        System.out.println(Arrays.toString(array_2D));
        System.out.println(array_2D[0]);
        System.out.println(array_2D[1]);

        System.out.println(Arrays.deepToString(array_2D));
        System.out.print("\n");

        char[] array_char1 = {'a', 'b', 'c'};
        char[] array_char2 = {'d','e'};

        char[][] array_char2D = {{'a','b','c'},{'d','e'}};

        System.out.println(array_char2D);
        System.out.println(Integer.toHexString(System.identityHashCode(array_char1)));
        System.out.println(Integer.toHexString(System.identityHashCode(array_char2)));
        System.out.println(Arrays.toString(array_char2D));


    }
}
