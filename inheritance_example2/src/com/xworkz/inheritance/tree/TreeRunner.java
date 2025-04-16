package com.xworkz.inheritance.tree;

public class TreeRunner {

        public static void main(String[] args) {
            Tree tree = new Tree();
            tree.grow();
            tree.shedLeaves();
            tree.photosynthesize();
            tree.giveOxygen();
            tree.provideShade();

            MangoTree mango = new MangoTree();
            mango.grow();
            mango.shedLeaves();
            mango.photosynthesize();
            mango.giveOxygen();
            mango.provideShade();

            Tree tree1 = new MangoTree();
            tree1.grow();
            tree1.shedLeaves();
            tree1.photosynthesize();
            tree1.giveOxygen();
            tree1.provideShade();
        }
}
