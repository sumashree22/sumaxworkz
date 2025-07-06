package com.xworkz.commercialspace.shop;

import com.xworkz.commercialspace.CommercialSpace;

public class Runner {
    public static void main(String[] args) {
        CommercialSpace commercialSpace=new HariSuperSandwich();
        System.out.println("implementation of the harisuper sandwich "+commercialSpace.doBusiness());
        CommercialSpace commercialSpace1=new WatchShop();
        System.out.println("implementation of the watchshop "+commercialSpace1.doBusiness());


    }
}
