package com.alex.random;

import java.util.Random;

public class RandomDemo1 {
    public static void main(String[] args) {


        Random r = new Random();

        for (int i = 1; i <= 20 ; i++) {
            int number = r.nextInt(1, 11);
            System.out.println(number);
        }

        int number1 = r.nextInt(10) + 1;

        System.out.println(number1);
        //[3,17] ==.-3 [0, 14] + 3

        int number2 = r.nextInt(15) + 3;
        System.out.println(number2);
    }
}
