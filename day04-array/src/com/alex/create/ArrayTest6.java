package com.alex.create;

import java.util.Scanner;

public class ArrayTest6 {
    public static void main(String[] args) {

        double[] scores = new double[6];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i < scores.length ; i++) {

            System.out.println("please input " + (i + 1) + "referee");
            double score = sc.nextDouble();
            scores[i] = score;
        }


        double sum = 0;
        for (int i = 0; i < scores.length ; i++) {
            sum+=scores[i];
        }

        System.out.println(sum/scores.length);
    }
}
