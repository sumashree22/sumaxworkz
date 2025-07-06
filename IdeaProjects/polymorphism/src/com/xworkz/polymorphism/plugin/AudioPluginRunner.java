package com.xworkz.polymorphism.plugin;

public class AudioPluginRunner {

        public static void main(String[] args) {
            System.out.println("--- Plugin ---");
            Plugin plugin = new Plugin();
            plugin.load();
            plugin.initialize();
            plugin.execute();
            plugin.unload();
            plugin.status();

            System.out.println("\n--- Plugin as AudioPlugin ---");
            Plugin plugin1 = new AudioPlugin();
            plugin1.load();
            plugin1.initialize();
            plugin1.execute();
            plugin1.unload();
            plugin1.status();

            System.out.println("\n--- AudioPlugin ---");
            AudioPlugin audioPlugin = new AudioPlugin();
            audioPlugin.load();
            audioPlugin.initialize();
            audioPlugin.execute();
            audioPlugin.unload();
            audioPlugin.status();
        }
    }

