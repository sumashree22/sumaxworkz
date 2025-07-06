package com.xworkz.polymorphism.task;

public class EmailRunner {
    
        public static void main(String[] args) {
            System.out.println("--- Task ---");
            Task task = new Task();
            task.create();
            task.assign();
            task.execute();
            task.complete();
            task.archive();

            System.out.println("\n--- Task as EmailTask ---");
            Task task1 = new Email();
            task1.create();
            task1.assign();
            task1.execute();
            task1.complete();
            task1.archive();

            System.out.println("\n--- EmailTask ---");
            Email emailTask = new Email();
            emailTask.create();
            emailTask.assign();
            emailTask.execute();
            emailTask.complete();
            emailTask.archive();
        }
    }

