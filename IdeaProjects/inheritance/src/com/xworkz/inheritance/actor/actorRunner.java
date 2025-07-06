package com.xworkz.inheritance.actor;

public class actorRunner {

        public static void main(String[] args) {

            System.out.println("=== 1. Artist Object (Parent class reference and object) ===");
            Artist artist1 = new Artist();
            artist1.perform();
            artist1.attendEvent();
            artist1.signAutograph();
            artist1.rehearse();
            artist1.introduce();

            System.out.println("\n=== 2. Actor Object using Artist Reference (Parent reference, Subclass object) ===");
            Artist artist2 = new Actor(); // Polymorphism
            artist2.perform();
            artist2.attendEvent();
            artist2.signAutograph();
            artist2.rehearse();
            artist2.introduce();
            // actor-specific methods are not accessible here

            System.out.println("\n=== 3. Actor Object using Actor Reference (Subclass reference and object) ===");
            Actor actor1 = new Actor();
            actor1.actInMovie();
            actor1.doStunt();
            actor1.promoteMovie();
            actor1.attendPremiere();
            actor1.rehearseScript();
        }
    }

