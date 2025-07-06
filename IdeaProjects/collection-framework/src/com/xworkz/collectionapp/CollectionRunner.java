package com.xworkz.collectionapp;

import java.util.ArrayList;
import java.util.List;

public class CollectionRunner {
    public static void main(String[] args) {
        List list=new ArrayList();
        list.add("suma");
        list.add(123);
        list.add( "ssss");

        System.out.println(list);
        list.remove("suma");
        System.out.println(list);
        list.add("rama");
        System.out.println( list.contains("rama"));

    }
}
