package com.xworkz.polymorphism.folkdance;

public class Kathak extends FolkDance{
        @Override
        public void origin() {
            System.out.println("Kathak: Originated in Northern India.");
        }

        @Override
        public void perform() {
            System.out.println("Kathak: Performed in temples and royal courts.");
        }

        @Override
        public void costume() {
            System.out.println("Kathak: Dancers wear long flowing costumes and ankle bells.");
        }

        @Override
        public void music() {
            System.out.println("Kathak: Accompanied by classical Hindustani music.");
        }

        @Override
        public void expression() {
            System.out.println("Kathak: Emphasizes facial expressions, storytelling, and footwork.");
        }
    }


