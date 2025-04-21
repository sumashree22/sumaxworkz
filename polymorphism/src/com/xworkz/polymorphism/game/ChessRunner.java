package com.xworkz.polymorphism.game;



public class ChessRunner {
    public static void main(String[] args) {
        System.out.println("--- Recreation ---");
        Recreation base = new Recreation();
        base.play();
        base.pause();
        base.restart();
        base.end();

        System.out.println("\n--- Recreation as Chess ---");
        Recreation base1 = new Chess();
        base1.play();
        base1.pause();
        base1.restart();
        base1.end();

        System.out.println("\n--- Chess ---");
        Chess child = new Chess();
        child.play();
        child.pause();
        child.restart();
        child.end();
    }
}
