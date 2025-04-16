package com.xworkz.inheritance.clothing;

public class ClothingRunner {

        public static void main(String[] args) {
            Clothing clothing = new Clothing();
            clothing.method1();
            clothing.method2();
            clothing.method3();
            clothing.method4();
            clothing.method5();

            Jacket jacket = new Jacket();
            jacket.sub1();
            jacket.sub2();
            jacket.sub3();
            jacket.sub4();
            jacket.sub5();

            Clothing clothing1 = new Jacket();
            clothing1.method1();
            clothing1.method2();
            clothing1.method3();
            clothing1.method4();
            clothing1.method5();
        }
}
