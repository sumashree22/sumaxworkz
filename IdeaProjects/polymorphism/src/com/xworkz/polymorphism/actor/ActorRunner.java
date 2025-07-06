package com.xworkz.polymorphism.actor;

public class ActorRunner {

        public static void main(String[] args) {
            System.out.println("Actor");
            Actor actor = new Actor();
            actor.arrive();
            actor.rehearse();
            actor.perform();
            actor.wrapUp();
            actor.giveInterview();

            System.out.println(" Actor as Artist ");
            Actor actor1 = new Actor();
            actor1.arrive();
            actor1.rehearse();
            actor1.perform();
            actor1.wrapUp();
            actor1.giveInterview();

            System.out.println(" Artist ");
            Artist artist = new Artist();
            artist.arrive();
            artist.rehearse();
            artist.perform();
            artist.wrapUp();

        }
    }


