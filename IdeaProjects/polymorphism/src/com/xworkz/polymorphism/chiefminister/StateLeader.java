package com.xworkz.polymorphism.chiefminister;

public class StateLeader extends Chiefminister {
    @Override
    public void start() {
        System.out.println("StateLeader: Custom start");
    }

    @Override
    public void configure() {
        System.out.println("StateLeader: Custom configuration");
    }

    @Override
    public void execute() {
        System.out.println("StateLeader: Custom execution");
    }

    @Override
    public void stop() {
        System.out.println("StateLeader: Custom stop");
    }
}
