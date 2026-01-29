package com.alex.operator;

public class OperatorDemo6 {
    public static void main(String[] args) {


        double height = 177;
        char sex = 'f';
        System.out.println(height> 170 & sex == 'f');

        double height2 = 177;
        int age = 37;
        System.out.println(height2> 170 | age < 30);

        System.out.println(!(2>1));
        System.out.println(!true);
        System.out.println(!false);

        System.out.println(true ^ true);
        System.out.println(false ^ false);
        System.out.println(false ^ true);
        System.out.println(true ^ false);

        //It has a short-circuit feature: if the left expression evaluates to false,
        // the right expression is not executed at all (since the final result is already
        // determined to be false), which avoids unnecessary computations.
        int i = 10;
        int j = 666;
        System.out.println(i<1 && ++j>333);
        System.out.println(j);


        //It also has a short-circuit feature: if the left expression evaluates to true, the right expression
        // is not executed at all (since the final result is already determined to be true).
        int m = 100;
        int n = 999;

        System.out.println(m > 1 || ++n > 198);
        System.out.println(n);


    }
}
