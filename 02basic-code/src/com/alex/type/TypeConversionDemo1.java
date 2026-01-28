package com.alex.type;

public class TypeConversionDemo1 {

    public static void main(String[] args) {

        //on 32 bit machine int is 32bit -2^31 ~ 2^31-1
        /*

        byte	8	1	-128 ~ 127	唯一 8 位整数类型
        char	16	2	0 ~ 65535（无符号）	Java 中 char 是 Unicode 编码
        short	16	2	-32768 ~ 32767	16 位有符号整数
        int	32	4	-2¹⁰³¹ ~ 2³¹-1（-2147483648 ~ 2147483647）	32 位有符号整数
        long	64	8	-2⁶³ ~ 2⁶³-1	64 位有符号整数（核心修正）
        float	32	4	±1.4×10⁻⁴⁵ ~ ±3.4×10³⁸	单精度浮点，IEEE 754
        double	64	8	±4.9×10⁻³²⁴ ~ ±1.8×10³⁰⁸


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
