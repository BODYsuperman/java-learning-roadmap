package com.alex.thisdemo;

public class Student {

    double score;
    public  void print(){
        System.out.println(this);
    }

    public  void pass(double score){
        if(this.score >= score){
            System.out.println("Pass");
        }
        else {
            System.out.println("fail");
        }
    }
}
