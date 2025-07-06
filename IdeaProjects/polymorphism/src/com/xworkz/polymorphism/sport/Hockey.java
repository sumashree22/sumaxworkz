package com.xworkz.polymorphism.sport;

public class Hockey extends  Sport{
    @Override
        public void play() {
            System.out.println("Hockey: Playing with sticks and a puck or ball.");
        }

        @Override
        public void train() {
            System.out.println("Hockey: Training in skating, passing, and shooting.");
        }

        @Override
        public void compete() {
            System.out.println("Hockey: Competing in matches with two teams on a field or ice rink.");
        }

        @Override
        public void score() {
            System.out.println("Hockey: Scoring goals by hitting the puck into the net.");
        }

        @Override
        public void rules() {
            System.out.println("Hockey: Following rules like offside, penalties, and face-offs.");
        }
    }


