package com.alex.loop;

public class WhileTest6 {
    public static void main(String[] args) {

        double peakHeight = 8848860;
        double paper = 0.1;

        int count = 0;
        while (paper < peakHeight){
            paper*=2;
            count++;
        }

        System.out.println(paper);
        System.out.println(count);
    }
}
