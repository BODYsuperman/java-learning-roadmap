package com.alex.javabean;

public class Test {
    public static void main(String[] args) {

        Student s = new Student("Tom",'m', 180, 99);
        StdudentOperator stdudentOperator = new StdudentOperator(s);
        stdudentOperator.printPass();
    }
}
