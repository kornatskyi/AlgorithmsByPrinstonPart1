package com.kornatskyi.Week1.HelloWorld;

import edu.princeton.cs.algs4.StdIn;
import edu.princeton.cs.algs4.StdRandom;

class RandomWord {
    static int i = 0;

    static int randomNumber = 0;

    public static void recursion(String str) {

        String storage = str;

        if (!StdIn.isEmpty()) {
            String string = StdIn.readString();
            i++;
            recursion(string);
        }
        else {
            randomNumber = (int) (StdRandom.uniform() * i);
        }
        i--;
        if (randomNumber == i) {
            System.out.println(storage);
        }
        return;
    }

    public static void main(String[] args) {
        recursion("");
    }

}
