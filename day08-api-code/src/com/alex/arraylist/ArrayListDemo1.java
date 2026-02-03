package com.alex.arraylist;

import java.util.ArrayList;

public class ArrayListDemo1 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList();

        list.add("alan");
        list.add("jack");
        list.add("rose");
        list.add("shirly");

        System.out.println(list);

        list.add(1, "tom");
        System.out.println(list);

        String ele = list.get(3);
        System.out.println(ele);

        System.out.println(list.remove(1));
        System.out.println(list);

        //remove the first appearance
        list.remove("alan");
        System.out.println(list);

        list.set(1, "tom");
        System.out.println(list);


    }
}
