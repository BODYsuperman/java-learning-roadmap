package com.alex.demo;

import java.util.Random;

public class Test2 {

    public static void main(String[] args) {


            System.out.println(ceateCode(100000));


    }

    public  static  String ceateCode(int length){
        if (length <= 0) return "";

        String code = "";
        Random r = new Random();

        for (int i = 0; i < length; i++) {

            int type = r.nextInt(3);
            switch (type){
                case 0:
                    int number = r.nextInt(10);
                    code+=number;
                    break;
                case 1:
                    char c1 = (char)(r.nextInt(26) + 65);
                    code+=c1;
                    break;
                case 2:
                    char c2 = (char)(r.nextInt(26) + 97);
                    code+=c2;
                    break;

            }
        }
        return code;
    }
}
