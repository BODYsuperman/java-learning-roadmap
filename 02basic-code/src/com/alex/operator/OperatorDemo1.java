package com.alex.operator;

public class OperatorDemo1 {

    public static void main(String[] args) {


        int i = 5;
        int j = 2;
        System.out.println((i + j));
        System.out.println((i - j));
        System.out.println((i * j));
        System.out.println((i / j));
        System.out.println(1.0 * (i / j));
        System.out.println(i % j);

        System.out.println("---------------------------------");


        int a = 5;
        System.out.println("abc" + a);

        System.out.println(a + 5);
        System.out.println("alex" + a + 'a');
        //'a' is 97
        System.out.println(a + 'a' + "alex"); //102alex
    }
}
