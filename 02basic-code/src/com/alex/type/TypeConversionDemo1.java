package com.alex.type;

public class TypeConversionDemo1 {

    public static void main(String[] args) {

        //on 32 bit machine int is 32bit -2^31 ~ 2^31-1
        /*

        byte    8   1 range -128 -- 127
        char	8	1
        short	16	2
        int	    32	4
        long	32	4
        float   32  4
        double  64  8


        byte --> short--> int --> long --> float-->double

                */
        byte a = 12;

        int b = a;//automatic type conversion
        System.out.println(a);
        System.out.println(b);

        int i = 999;
        double j = i;
        System.out.println(i);
        System.out.println(j);

        char ch = 'b';
        int it = ch;//98
        System.out.println(ch);
        System.out.println(it);
    }
}
