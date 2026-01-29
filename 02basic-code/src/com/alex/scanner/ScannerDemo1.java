package com.alex.scanner;

import java.util.Scanner;

public class ScannerDemo1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("please intput your age");
        int age = scanner.nextInt();
        System.out.println( String.format("Your age is %d", age));

        System.out.println("please intput your name");
        String name = scanner.next();
        System.out.println( String.format("Welcome to the programme world, %s !", name));
    }
}
