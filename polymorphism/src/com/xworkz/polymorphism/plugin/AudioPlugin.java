package com.xworkz.polymorphism.plugin;

public class AudioPlugin extends Plugin{

        @Override
        public void load() {
            System.out.println("AudioPlugin: Loading audio processing module");
        }

        @Override
        public void initialize() {
            System.out.println("AudioPlugin: Setting up audio environment");
        }

        @Override
        public void execute() {
            System.out.println("AudioPlugin: Processing audio effects");
        }

        @Override
        public void unload() {
            System.out.println("AudioPlugin: Releasing audio resources");
        }
    }

