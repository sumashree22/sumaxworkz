package com.xworkz.toString.Course;


public class CourseRunner {
    public static void main(String[] args) {
        Course course = new Course();

        course.setCourseName("Advanced Java Programming");
        course.setInstructor("John Doe");
        course.setDuration(12); // 12 weeks
        course.setSyllabus(new String[]{"Object-Oriented Programming", "Data Structures", "Multithreading", "GUI Development"});
        course.setFee(499.99);
        course.setOnline(true);

        System.out.println(course.toString());
    }
}

