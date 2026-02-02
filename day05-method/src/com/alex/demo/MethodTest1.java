package com.alex.demo;

public class MethodTest1 {

    public static void main(String[] args) {

        System.out.println(sum(10));
    }

    public static int sum(int n){
        int sum = 0;
        for (int i = 0; i <=n ; i++) {
            sum += i;
        }
        return sum;
    }
}
