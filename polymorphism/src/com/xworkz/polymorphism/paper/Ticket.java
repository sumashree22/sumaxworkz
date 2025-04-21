package com.xworkz.polymorphism.paper;

public class Ticket extends  Paper {
        @Override
        public void create() {
            System.out.println("Ticket: Creating a ticket with event or travel information.");
        }

        @Override
        public void print() {
            System.out.println("Ticket: Printing seat number, date, and barcode.");
        }

        @Override
        public void fold() {
            System.out.println("Ticket: Folding the ticket to fit in a wallet or holder.");
        }

        @Override
        public void recycle() {
            System.out.println("Ticket: Recycling old or expired tickets.");
        }

        @Override
        public void use() {
            System.out.println("Ticket: Using the ticket for entry to an event or travel.");
        }
    }


