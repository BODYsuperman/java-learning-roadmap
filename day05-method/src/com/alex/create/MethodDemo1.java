package com.alex.create;

public class MethodDemo1 {
    public static void main(String[] args) {


        System.out.println("Max value is " + getMax(10, 20));
    }

    public  static int getMax(int a, int b){
        return a > b?a:b;
    }




}
