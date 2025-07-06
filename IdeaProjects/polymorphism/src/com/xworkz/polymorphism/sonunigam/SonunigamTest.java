package com.xworkz.polymorphism.sonunigam;

public class SonunigamTest {
    public static void main(String[] args) {
        System.out.println("--- Sonunigam ---");
        Sonunigam base = new Sonunigam();
        base.start();
        base.configure();
        base.execute();
        base.stop();

        System.out.println("\n--- Sonunigam as PopSong ---");
        Sonunigam base1 = new PopSong();
        base1.start();
        base1.configure();
        base1.execute();
        base1.stop();

        System.out.println("\n--- PopSong ---");
        PopSong child = new PopSong();
        child.start();
        child.configure();
        child.execute();
        child.stop();
    }
}
