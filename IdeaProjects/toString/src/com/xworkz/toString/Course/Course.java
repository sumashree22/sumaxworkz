package com.xworkz.toString.Course;


import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Course {
    private String courseName;
    private String instructor;
    private int duration; // in weeks
    private String[] syllabus;
    private double fee; // in USD
    private boolean isOnline;

    @Override
    public String toString() {
        return "Course Details:\n" +
                "Course Name = " + this.courseName + "\n" +
                "Instructor = " + this.instructor + "\n" +
                "Duration = " + this.duration + " weeks\n" +
                "Syllabus = " + String.join(", ", this.syllabus) + "\n" +
                "Fee = $" + this.fee + "\n" +
                "Online Course = " + this.isOnline;
    }
}

