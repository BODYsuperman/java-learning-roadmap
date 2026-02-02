package com.alex.encapsulation;

public class Girl {
    String name;
    private int age;
    double height;
    double weight;
    String color;

    public void setAge(int age){
        if(age > 0 && age < 150){
            this.age = age;
        }
        else{
            System.out.println("Wrong age");
        }
    }

    public  int getAge(){
        return age;
    }
    public Girl() {

    }

    public Girl(String name, double height, double weight, String color) {
        this.name = name;
        this.height = height;
        this.weight = weight;
        this.color = color;
    }
}