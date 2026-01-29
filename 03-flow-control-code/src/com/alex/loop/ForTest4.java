package com.alex.loop;

public class ForTest4 {

    public static void main(String[] args) {


        /**
         * Narcissistic Number (水仙花数)
         * Definition: A 3-digit number whose cube of each digit sums to itself
         * e.g. 153 = 1³ + 5³ + 3³
         */
        int count =0;

        for (int i = 100; i <1000 ; i++) {

            int hundreds=  i /100;
            int tens =  (i /10) %10;
            int units = i % 10;

            if (i == (int) (Math.pow(hundreds, 3) + Math.pow(tens, 3) + Math.pow(units, 3))){
                System.out.println("Narcissistic Number is " + i);
                count++;
            }
        }
    }
}
