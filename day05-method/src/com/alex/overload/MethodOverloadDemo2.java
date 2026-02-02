package com.alex.overload;

public class MethodOverloadDemo2 {
    public static void main(String[] args) {

        //methods with the same name but varies in the number of params and types
        // will cause overload of the methods
        max(10, 20);
        max(10.1, 20.1);
    }

    public static int max(int num1, int num2) {
            return num1 > num2?num1:num2;
    }

    public static double max(double num1, double num2) {
        if (num1 > num2)
            return num1;
        else
            return num2;
    }
}
