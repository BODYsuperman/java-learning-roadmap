package com.alex.operator;

public class OperationDemo7 {
    public static void main(String[] args) {

        int a = 110;
        int  b = 30;
        int max= a > b? a:b;
        System.out.println("max is "+  max);

        int i = 10;
        int j = 23;
        int k = 12;

        int temp = i > j ? i : j;
        int max2 = temp > k ? temp: k;
        System.out.println("max is " + max2);

        System.out.println("------------------------------------");

        int max3 = i > j ?  i > k ? i:j:  j > k ? j : k;
        System.out.println(max3);



    }
}
