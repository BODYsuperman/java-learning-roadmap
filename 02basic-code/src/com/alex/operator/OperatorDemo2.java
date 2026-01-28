package com.alex.operator;

public class OperatorDemo2 {
    public static void main(String[] args) {
        int  number = 986;

        int a = number/100;
        int b = number /10 % 10;
        int c = number %10;



        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
    }
}
