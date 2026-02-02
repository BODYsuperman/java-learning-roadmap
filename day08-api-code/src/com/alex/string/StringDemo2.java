package com.alex.string;

public class StringDemo2 {
    public static void main(String[] args) {
        String name = "abdarkhorse666";
        System.out.println(name.length());
        System.out.println(name.charAt(2));

        System.out.println("------------------------");

        for (int i = 0; i < name.length(); i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }

        char[] chars = name.toCharArray();
        for (int i = 0; i < chars.length; i++) {
            char c = name.charAt(i);
            System.out.println(c);
        }

        String s1 = new String("666");
        String s2 = new String("666");
        System.out.println(s1 == s2);//false
        System.out.println(s1.equals(s2));//true

        String t1 = new String("AAbbc");
        String t2 = new String("aabbc");
        System.out.println(t1.equals(t2));//false
        System.out.println(t1.equalsIgnoreCase(t2));//true

        String st = "99999darkhorse";
        String rs = st.substring(0, 5);
        System.out.println(rs);

        //from begin index to the end!
        System.out.println(st.substring(5));

        String info = "fuck you , you shit!";

        System.out.println(info.replace("fuck", "f***").replace("shit", "s***"));
        //contains

        //starts with

        //endswith

        String res = "alan,james,jordan";

        String[] names = res.split(",");
        for (int i = 0; i < names.length; i++) {
            System.out.println(names[i]);
        }



    }
}
