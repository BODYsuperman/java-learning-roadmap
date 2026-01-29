package com.alex.branch;

import java.util.Scanner;

public class IfDemo1 {

    public static void main(String[] args) {
        //three format of demo

        double t = 36.5;
        if(t> 37){
            System.out.println("Current temperature is too high");
        }
        System.out.println("Check is over");


        double money = 10;
        if(money>= 90){
            System.out.println("Balacne is enough");
        }
        else{
            System.out.println("Balance is not enough");
        }

        Scanner sc = new Scanner(System.in);
        System.out.println("please input the score");
        double score = sc.nextDouble();

        if(score >= 0 && score < 60){
            System.out.println("fail");
        }
        else if(score >=60 && score < 80){
            System.out.println("level is C");
        }
        else  if(score >=80 && score < 90){
            System.out.println("level is B");
        }
        else  if(score >=90 && score < 100){
            System.out.println("level is A");
        }
        else{
            System.out.println("Wrong input");
        }

    }
}
