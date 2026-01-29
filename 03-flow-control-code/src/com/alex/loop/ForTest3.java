package com.alex.loop;

public class ForTest3 {
    public static void main(String[] args) {

        int sum = 0;

        for (int i = 0; i <=10 ; i++) {

            if(i%2==1){
                sum+=i;
            }
        }

        int sum2 = 0;
        for (int i = 0; i <=10 ; i+=2) {

            sum2 += i;
        }
    }
}
