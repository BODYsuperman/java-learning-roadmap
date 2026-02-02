package com.alex.create;

public class ArrayDemo2 {
    public static void main(String[] args) {

        int[] arr = {12, 24, 36};


        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);
        //index out of bound
        System.out.println(arr[3]);

        arr[1] = 99;
        System.out.println(arr[0]);
        System.out.println(arr[1]);
        System.out.println(arr[2]);

        System.out.println(arr.length);
        //max index
        System.out.println(arr.length - 1);

        int[] arr2 = {};
        System.out.println(arr2.length - 1);
    }
}
