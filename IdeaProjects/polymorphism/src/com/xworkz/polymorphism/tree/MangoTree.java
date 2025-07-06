package com.xworkz.isarelationship.tree;

import com.xworkz.isarelationship.plantation.Plantation;

public class MangoTree extends Plantation {
    @Override
    public void grow() {
        System.out.println("MangoTree: Overriding grow");
    }
    @Override
    public void water() {
        System.out.println("MangoTree: Overriding water");
    }
    @Override
    public void shade() {
        System.out.println("MangoTree: Overriding shade");
    }
    @Override
    public void fruit() {
        System.out.println("MangoTree: Overriding fruit");
    }
}
