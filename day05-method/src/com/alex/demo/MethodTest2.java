package com.alex.demo;

public class MethodTest2 {
    public static void main(String[] args) {

        check(10);
        check(11);
    }

    public  static  void check(int number){
        if (number%2==0){
            System.out.println(number + " is an even number");
        }
        else{
            System.out.println(number + " is an odd number");
        }
    }
}
