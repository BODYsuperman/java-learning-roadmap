package com.alex.operator;

public class OperatorDemo3 {

    public static void main(String[] args) {


        int a = 10;

        a++;
        ++a; // no difference between above
        System.out.println(a);

        int b = 10;
        b--;
        --b;// no difference between above

        System.out.println(b);

        int i = 10;
        int res = ++i;
        System.out.println(i);
        System.out.println(res);

        int j = 10;
        int res2 = j++;
        System.out.println(j); //11
        System.out.println(res2); //10
    }
}
