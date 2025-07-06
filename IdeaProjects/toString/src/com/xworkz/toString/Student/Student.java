package com.xworkz.toString.Student;

import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Student {
    private String name;
    private int rollNumber;
    private int age;
    private String grade;
    private String subject;
    private boolean isEnrolled;
    private double marks;

    @Override
    public String toString() {
        return "Student Details:\n" +
                "Name = " + this.name + "\n" +
                "Roll Number = " + this.rollNumber + "\n" +
                "Age = " + this.age + "\n" +
                "Grade = " + this.grade + "\n" +
                "Subject = " + this.subject + "\n" +
                "Is Enrolled = " + this.isEnrolled + "\n" +
                "Marks = " + this.marks + "/100";
    }
}

