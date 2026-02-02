package com.alex.demo;

import java.util.Random;
import java.util.Scanner;

public class Test3 {

    public static void main(String[] args) {

        int[] codes = new int[5];

        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < codes.length; i++) {
            System.out.println("Please input number" + (i + 1));
            codes[i] =sc.nextInt();
        }

        Random r = new Random();

        for (int i = 0; i < codes.length; i++) {
            int j = r.nextInt(codes.length);
            int temp = codes[j];
            codes[j] = codes[i];
            codes[i] = temp;
        }

        for (int i = 0; i < codes.length; i++) {
            System.out.print(codes[i] + " ");
        }
    }
}
