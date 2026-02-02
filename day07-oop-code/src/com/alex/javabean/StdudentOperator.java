package com.alex.javabean;

public class StdudentOperator {

    private Student s;


    public StdudentOperator(Student s) {
        this.s = s;
    }

    public   void printPass(){
        if(s.getScore() >= 60){
            System.out.println("Pass");
        }
        else {
            System.out.println("Fail");
        }
    }
}
