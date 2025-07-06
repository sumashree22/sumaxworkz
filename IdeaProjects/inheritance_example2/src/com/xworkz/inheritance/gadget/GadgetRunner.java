package com.xworkz.inheritance.gadget;

public class GadgetRunner {

        public static void main(String[] args) {
            Gadget gadget = new Gadget();
            gadget.start();
            gadget.shutdown();
            gadget.update();
            gadget.charge();
            gadget.reset();

           SmartPhone smartPhone = new SmartPhone();
            smartPhone.start();
            smartPhone.shutdown();
            smartPhone.update();
            smartPhone.charge();
            smartPhone.reset();

            Gadget gadget1 = new SmartPhone();
            gadget1.start();
            gadget1.shutdown();
            gadget1.update();
            gadget1.charge();
            gadget1.reset();
        }

}
