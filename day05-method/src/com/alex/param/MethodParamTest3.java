package com.alex.param;

public class MethodParamTest3 {

    public static void main(String[] args) {

        int[] arr = {11, 22, 33};
        printArray(arr);

        printArray(new int[]{1, 2, 3});
        printArray(new int[]{});
    }

    public  static  void printArray(int[] arr){

        if(arr==null || arr.length == 0) {
            return;
        }
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(i==arr.length-1?arr[i]:arr[i]+",");
        }
        System.out.print("]");
    }
}
