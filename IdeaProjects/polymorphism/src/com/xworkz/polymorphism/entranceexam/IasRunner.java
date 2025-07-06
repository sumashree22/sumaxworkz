package com.xworkz.polymorphism.entranceexam;

public class IasRunner {

        public static void main(String[] args) {
            System.out.println("--- Entrance Exam ---");
            EntranceExam exam = new EntranceExam();
            exam.register();
            exam.prepare();
            exam.appear();
            exam.result();
            exam.counseling();

            System.out.println("\n--- Entrance Exam as IAS ---");
            EntranceExam exam1 = new Ias();
            exam1.register();
            exam1.prepare();
            exam1.appear();
            exam1.result();
            exam1.counseling();

            System.out.println("\n--- IAS ---");
            Ias ias = new Ias();
            ias.register();
            ias.prepare();
            ias.appear();
            ias.result();
            ias.counseling();
        }
    }


