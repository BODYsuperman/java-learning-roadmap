package com.alex.operator;

public class OperatorDemo4 {
    public static void main(String[] args) {

        //byte < short < char < int < long < float < double
        int i = 5;
        int j = 2;

        i+=j;// => i = i+j;
        System.out.println(i);

        double m = 9.9;
        double n = 100;
        m +=n;
        System.out.println(m);

        double m2 = 1000;
        double m3 = 521;

        m2-=m3; //m2=m2.type
        System.out.println(m2);


        int a1 = 10;
        int b1 = 3;

        a1*= a1;
        a1 /=b1;
        a1%= b1;

        System.out.println(a1);

        byte t1 = 110;
        byte t2 = 120;

        //byte t3 = t1 + t2;//error
        byte t3 = (byte)(t1 + t2);
        t1+=t2;

        System.out.println(t1);


    }
}
