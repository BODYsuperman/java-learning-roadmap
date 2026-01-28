package com.alex.type;

public class TypeConversionDemo2 {

    public static void main(String[] args) {

        byte a = 10;
        int b = 20;
        long c = 30;

        //int res = a + b + c + 10; error
        long res = a + b + c + 10;
        System.out.println(res);

        //long res2 = c + b + 3.14;
        double res2 = c + b + 3.14;


        //In expressions,
        // byte, short, and char are directly converted to int for calculation.
        byte a1 = 110;
        byte a2 = 120;

        //byte a3 = a1 + a2;
        int a3 = a1 + a2;
    }
}
