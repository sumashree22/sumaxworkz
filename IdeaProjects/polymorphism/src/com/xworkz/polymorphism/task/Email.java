package com.xworkz.polymorphism.task;

public class Email extends Task{

        @Override
        public void create() {
            System.out.println("EmailTask: Creating email task");
        }

        @Override
        public void assign() {
            System.out.println("EmailTask: Assigning to email bot");
        }

        @Override
        public void execute() {
            System.out.println("EmailTask: Sending email");
        }

        @Override
        public void complete() {
            System.out.println("EmailTask: Marking email as sent");
        }
    }

