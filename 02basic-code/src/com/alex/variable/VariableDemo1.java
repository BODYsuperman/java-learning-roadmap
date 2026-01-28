package com.alex.variable;

public class VariableDemo1 {

    public static void main(String[] args) {

        //'a' transfer to ASCII == 97
        System.out.println('a' + 1);//98
        System.out.println('A'  + 1); //66
        System.out.println('0' + 1);//49

        //binary starts with 0B or 0b
        int a1 = 0B11111010;
        System.out.println(a1); //250

        //octal starts with 0
        int a2 = 0372;
        System.out.println(a2);

        //hexadecimal starts with 0X 0x
        int a3 = 0XFA;
        System.out.println(a3);



    }
}
