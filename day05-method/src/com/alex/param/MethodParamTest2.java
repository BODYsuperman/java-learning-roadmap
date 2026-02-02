package com.alex.param;

public class MethodParamTest2 {
    public static void main(String[] args) {

        int[] arrs = new int[]{10 , 20 ,30};
        change(arrs);
        System.out.println("main " + arrs[1]);
    }

    public  static  void change(int[] arrs){
        System.out.println("Method1: "+ arrs[1]);
        arrs[1] = 222;
        System.out.println("Method2: " + arrs[1]);
    }
}
