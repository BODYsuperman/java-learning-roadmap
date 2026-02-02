package com.alex.constructor;

public class Student {

    public Student(){
        System.out.println("none parameter constructor is running");
    }
    public Student(String n){
        System.out.println("1 parameter constructor is running");
    }
    public Student(String n ,double s){
        System.out.println("2 parameters constructor is running");
    }
}
