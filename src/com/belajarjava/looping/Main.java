package com.belajarjava.looping;

public class Main {

    public static void main(String[] args) {

        //      doLooping(10);
        doLooping(1, 10);
    }

    public static void doLooping(int value) {
        for (int initialValue = 0; initialValue < value; initialValue++) {
            System.out.println(initialValue);
        }

    }

    public static void doLooping(int startValue, int endValue) {
        if (startValue < endValue) {
            for (int initialValue = startValue; initialValue < endValue; initialValue++) {
                System.out.println(initialValue);
            }
        } else {
            for (int initialValue = startValue; initialValue > endValue; initialValue--) {
                System.out.println(initialValue);
            }
        }


    }

    /**
     *  for --> do something, dari x sampe y
     *
     * do while --> lakukan itu, sampe
     *
     * while --> lakukan pengulangan, sampe
     */
}
