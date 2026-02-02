package com.alex.demo;

public class Test1 {


    public static void main(String[] args) {
        int[] faceScore = {15, 9000, 10000, 20000, 9500};
        int max = faceScore[0];

        for (int i = 0; i < faceScore.length; i++) {
            int score = faceScore[i];
            if(score > max){
                max = score;
            }

        }
        System.out.println("Max score is  "+ max);
    }
}
