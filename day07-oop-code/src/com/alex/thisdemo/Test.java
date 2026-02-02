package com.alex.thisdemo;

public class Test {
    public static void main(String[] args) {

        Student s1 = new Student();
        System.out.println(s1);
        s1.print();
        s1.score = 150;

        s1.pass(200);
    }
}
