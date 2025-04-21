package com.xworkz.polymorphism.TrainingInstitute;

public class XworkzRunner {

        public static void main(String[] args) {
            System.out.println("--- Training Institute ---");
            TrainingInstitute institute = new TrainingInstitute();
            institute.provideCourses();
            institute.conductExams();
            institute.offerCertifications();
            institute.mentorStudents();
            institute.hostWorkshops();

            System.out.println("\n--- Training Institute as Xworkz ---");
            TrainingInstitute institute1 = new Xworkz();
            institute1.provideCourses();
            institute1.conductExams();
            institute1.offerCertifications();
            institute1.mentorStudents();
            institute1.hostWorkshops();

            System.out.println("\n--- Xworkz ---");
            Xworkz xworkz = new Xworkz();
            xworkz.provideCourses();
            xworkz.conductExams();
            xworkz.offerCertifications();
            xworkz.mentorStudents();
            xworkz.hostWorkshops();
        }
    }


