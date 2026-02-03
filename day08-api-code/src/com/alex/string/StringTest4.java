package com.alex.string;

import java.util.Scanner;

public class StringTest4 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        for (int i = 1; i <= 3 ; i++) {
            System.out.println("Number of the login" + i);
            System.out.println("please input login name");
            String loginName = sc.next();

            System.out.println("please input password");
            String passWord = sc.next();
            String res = login(loginName, passWord);
            if("sucess".equals(res)) {
                System.out.println("login sucessfully");
                break;
            }
            else{
                System.out.println(res);
            }


        }


    }

    public  static  String login(String loginName, String passWord){

        String okLoginName = "alan";
        String okPassWord = "123456";

        //value check use equals not == else
        if(loginName.equals(okLoginName)){
            if (passWord.equals(okPassWord)){
                return "sucess";
            }
            else{
                return "password is wrong, pls check";
            }
        }
        else{
            return "login name is wrong, pls check";
        }


    }

}
