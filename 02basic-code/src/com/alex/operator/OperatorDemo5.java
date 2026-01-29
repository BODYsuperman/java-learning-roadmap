package com.alex.operator;

public class OperatorDemo5 {
    public static void main(String[] args) {

        int a = 10;
        int b = 5;

        System.out.println(a > b); //true
        System.out.println(a >= b);//true
        System.out.println(a < b); // false
        System.out.println(a <= b);//false
        System.out.println(a == b); //false
        System.out.println(a != b);//true

        System.out.println("-------------------------");
        int i = 10;
        int j = 10;

        System.out.println(i < j);//false
        System.out.println(i <= j);//true
        System.out.println(i > j);//false
        System.out.println(i >= j);//true
        System.out.println(i == j);//true
        System.out.println(i!=j);//false

        //Note in Java: Always use == for equality checks; = is for assignment only.
        int m = 10;
        int n = 3;

        System.out.println(m == n);
        System.out.println(n = m);
    }
}
