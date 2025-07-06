package com.xworkz.polymorphism.actor;

public class Artist extends Actor{

        @Override
        public void arrive() {
            System.out.println("Artist: Entering the studio with flair");
        }

        @Override
        public void rehearse() {
            System.out.println("Artist: Perfecting expressions and gestures");
        }

        @Override
        public void perform() {
            System.out.println("Artist: Delivering an emotional performance");
        }

        @Override
        public void wrapUp() {
            System.out.println("Artist: Signing autographs and leaving set");
        }


}


