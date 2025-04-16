package com.xworkz.task.vegetable;

public class VegetableRunner {
        public static void main(String[] args) {
            Vegetable veg = new Vegetable();
            veg.wash();
            veg.peel();
            veg.cut();
            veg.cook();
            veg.serve();

            Carrot carrot = new Carrot();
            carrot.wash();
            carrot.peel();
            carrot.cut();
            carrot.cook();
            carrot.serve();

            Vegetable veg1 = new Carrot();
            veg1.wash();
            veg1.peel();
            veg1.cut();
            veg1.cook();
            veg1.serve();
        }

}
