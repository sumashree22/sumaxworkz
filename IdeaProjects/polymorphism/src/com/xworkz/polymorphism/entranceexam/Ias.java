package com.xworkz.polymorphism.entranceexam;

public class Ias extends EntranceExam{


        @Override
        public void register() {
            System.out.println("IAS: Registering for the UPSC Civil Services Examination.");
        }

        @Override
        public void prepare() {
            System.out.println("IAS: Preparing with NCERTs, standard books, and mock tests.");
        }

        @Override
        public void appear() {
            System.out.println("IAS: Appearing for Prelims, Mains, and Interview.");
        }

        @Override
        public void result() {
            System.out.println("IAS: Result announced by UPSC after all stages are completed.");
        }

        @Override
        public void counseling() {
            System.out.println("IAS: Based on rank, attending services allocation and training.");
        }
    }


