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


        int m = 3;
        int n = 7;

        /*
                m 3 4 5 4 5
                n 7 8 7
                res3 = 3 + 5 - 4 + 8 - 8 + 4 +1;
         */
        int res3 = m++ + ++m - --m + ++n - n-- + m++ +1;
        System.out.println(m); //5
        System.out.println(n); //7
        System.out.println(res3);//9

    }
}
