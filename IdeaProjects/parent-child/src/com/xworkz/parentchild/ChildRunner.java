package com.xworkz.parentchild;

import com.xworkz.parentchild.child.Child;
import com.xworkz.parentchild.parent.Parent;

public class ChildRunner {
    public static void main(String[] args) {
        Parent parent=new Child(10);
        parent.doBusiness();

        Child child=new Child();
        child.doBusiness();
    }
}
