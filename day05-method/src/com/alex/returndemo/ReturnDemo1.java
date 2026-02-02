package com.alex.returndemo;

public class ReturnDemo1 {
    public static void main(String[] args) {

        test();
    }
    public static void test() {
        for (int i = 0; i < 10; i++) {
            if (i == 5) {
                return;
            }
            System.out.println(i);
        }
        System.out.println("This line won't execute");
    }


}
