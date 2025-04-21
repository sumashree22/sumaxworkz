package com.xworkz.polymorphism.programminglanguage;

public class Java extends ProgrammingLanguage {


        @Override
        public void define() {
            System.out.println("Java: A high-level, object-oriented programming language.");
        }

        @Override
        public void syntax() {
            System.out.println("Java: Uses a syntax similar to C, with curly braces.");
        }

        @Override
        public void usage() {
            System.out.println("Java: Used for web development, mobile apps (Android), and enterprise systems.");
        }

        @Override
        public void compile() {
            System.out.println("Java: Compiled into bytecode to run on the Java Virtual Machine (JVM).");
        }

        @Override
        public void execute() {
            System.out.println("Java: Executes on any platform with JVM support.");
        }
    }


