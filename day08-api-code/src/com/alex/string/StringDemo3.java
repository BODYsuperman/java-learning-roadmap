package com.alex.string;

public class StringDemo3 {
    public static void main(String[] args) {

        String name = "darkhorse";
        name+="1";
        name+="2";
        System.out.println(name);

        String  s1 = "abc";
        String s2 = "ab";
        String s3 = s2 + "c";//comupte malloc heap

        System.out.println(s1 == s3);//false


        String t1 = "abc";
        String t2 = "a"+ "b" + "c";
        System.out.println(t1 == t2);//true
    }
}
