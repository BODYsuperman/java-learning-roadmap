package com.alex.branch;

import java.util.Scanner;

public class SwitchDemo1 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("input a number");
        int i = sc.nextInt();
        switch(i){
            case 0:
                System.out.println("0");
                break;
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("your input is " + i);
                break;
        }
    }

}
