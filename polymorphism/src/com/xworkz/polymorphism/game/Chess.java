package com.xworkz.polymorphism.game;



public class Chess extends Recreation {
    @Override
    public void play() {
        System.out.println("Chess: Overriding play");
    }
    @Override
    public void pause() {
        System.out.println("Chess: Overriding pause");
    }
    @Override
    public void restart() {
        System.out.println("Chess: Overriding restart");
    }
    @Override
    public void end() {
        System.out.println("Chess: Overriding end");
    }
}
