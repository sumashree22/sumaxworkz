package com.xworkz.inheritance.accesory;

public class AccesoryRunner {

    public static void main(String[] args) {

        Accesory accesory = new Accesory();
        accesory.color();
        accesory.gen();
        accesory.model();
        accesory.type();
        accesory.warrenty();

        Mobile mobile = new Mobile();
        mobile.camera();
        mobile.charge();
        mobile.network();
        mobile.storage();
        mobile.sim();

        Accesory accesory1 = new Mobile();
        accesory1.warrenty();
        accesory1.type();
        accesory1.model();
        accesory1.gen();
        accesory1.color();
    }
}
