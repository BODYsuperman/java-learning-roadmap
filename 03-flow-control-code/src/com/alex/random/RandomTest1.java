package com.alex.random;

import java.util.Random;
import java.util.Scanner;

public class RandomTest1 {

    public static void main(String[] args) {

        Random r = new Random();

        int randomNum = r.nextInt(0,100)+1;

        while (true){
            System.out.println("please input guess number 1-100");

            Scanner sc = new Scanner(System.in);
            int guessNum = sc.nextInt();

            if(guessNum > randomNum){
                System.out.println("too big");
            }
            else if(guessNum < randomNum){
                System.out.println("too small");
            }
            else {
                System.out.println("Bingo!");
                break;
            }
        }
    }
}
