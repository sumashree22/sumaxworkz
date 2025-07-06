package com.xworkz.polymorphism.sonunigam;

public class PopSong extends Sonunigam {
    @Override
    public void start() {
        System.out.println("PopSong: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("PopSong: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("PopSong: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("PopSong: Custom stop");
    }
}
