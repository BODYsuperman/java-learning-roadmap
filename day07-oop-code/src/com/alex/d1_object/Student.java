package com.alex.d1_object;

public class Student {

    String name;
    double chinese;
    double math;

    public  void printAllScore(){
        System.out.println(name + "score is" + (chinese + math));
    }

    public  void printAverageScore(){
        System.out.println(name + "averge score is" + (chinese + math)/2);
    }
}
