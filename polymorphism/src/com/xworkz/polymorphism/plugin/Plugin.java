package com.xworkz.polymorphism.plugin;

public class Plugin {

        public void load() {
            System.out.println("Plugin: Loading plugin");
        }

        public void initialize() {
            System.out.println("Plugin: Initializing plugin");
        }

        public void execute() {
            System.out.println("Plugin: Executing plugin functionality");
        }

        public void unload() {
            System.out.println("Plugin: Unloading plugin");
        }

        public void status() {
            System.out.println("Plugin: Checking plugin status");
        }
    }

