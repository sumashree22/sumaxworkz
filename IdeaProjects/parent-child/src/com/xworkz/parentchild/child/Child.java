package com.xworkz.parentchild.child;

import com.xworkz.parentchild.parent.Parent;

public class Child extends Parent {
    public Child(){
        super();
        System.out.println("child no args Constructor");
    }
    public Child(int i){
        super(i);
        System.out.println("childs paramaterised constructor");
    }




    @Override
    public void doBusiness(){
        System.out.println("teashop");
    }
}
