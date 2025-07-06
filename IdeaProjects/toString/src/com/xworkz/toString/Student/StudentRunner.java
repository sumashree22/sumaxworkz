package com.xworkz.toString.Student;

public class StudentRunner {
    public static void main(String[] args) {
        Student student = new Student();

        student.setName("Aakash Sharma");
        student.setRollNumber(101);
        student.setAge(20);
        student.setGrade("A");
        student.setSubject("Computer Science");
        student.setEnrolled(true);
        student.setMarks(89.5);

        System.out.println(student.toString());
    }
}

