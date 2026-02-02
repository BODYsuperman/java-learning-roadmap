package com.alex.string;

public class StringDemo1 {
    public static void main(String[] args) {

        String a  = "";
        String s1 = new String();
        System.out.println(s1);

        String s2 = new String("bob");
        System.out.println(s2);

        char[] chars = {'a', 'b', 'c', 'd'};
        String s3 = new String(chars);
        System.out.println(s3);


        byte[] bytes = {97, 98, 99, 65, 66, 67};
        String s4 = new String(bytes);
        System.out.println(s4);
    }
}
