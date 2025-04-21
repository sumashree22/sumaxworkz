package com.xworkz.polymorphism.paper;

public class TicketRunner {

        public static void main(String[] args) {
            System.out.println("--- Paper ---");
            Paper paper = new Paper();
            paper.create();
            paper.print();
            paper.fold();
            paper.recycle();
            paper.use();

            System.out.println("\n--- Paper as Ticket ---");
            Paper paper1 = new Ticket();
            paper1.create();
            paper1.print();
            paper1.fold();
            paper1.recycle();
            paper1.use();

            System.out.println("\n--- Ticket ---");
            Ticket ticket = new Ticket();
            ticket.create();
            ticket.print();
            ticket.fold();
            ticket.recycle();
            ticket.use();
        }
    }



