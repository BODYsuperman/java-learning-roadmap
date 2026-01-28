package com.alex.type;

public class TypeConversionDemo3 {
    public static void main(String[] args) {

        int a = 20;

        byte b = (byte) a;
        System.out.println(a);
        System.out.println(b);

        int i = 1500;
        byte j = (byte) i;
        System.out.println(i);//1500
        System.out.println(j);//data overflow -36

        double score = 99.5;
        int number = (int) score;
        System.out.println(number);//99
    }
}
