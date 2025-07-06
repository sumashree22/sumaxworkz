package com.xworkz.governmentjobsapp;

import com.xworkz.governmentjobsapp.governmentjobs.GovernmentJobs;

public class GovernmanetJobsRunner {

        public static void main(String[] args) {

            GovernmentJobs job1 = new GovernmentJobs();
            job1.setJobTitle("IAS Officer");
            job1.setDepartment("Administrative Services");
            job1.setQualification("Graduate");
            job1.setLocation("Delhi");
            job1.setSalary(120000.0);
            job1.setIsPermanent(true);
            job1.setApplicationDeadline("15/05/2025");

            String ref1 = job1.getJobTitle();
            System.out.println("Job Title: " + ref1);
            String ref2 = job1.getDepartment();
            System.out.println("Department: " + ref2);
            String ref3 = job1.getQualification();
            System.out.println("Qualification: " + ref3);
            String ref4 = job1.getLocation();
            System.out.println("Location: " + ref4);
            double ref5 = job1.getSalary();
            System.out.println("Salary: " + ref5);
            boolean ref6 = job1.getIsPermanent();
            System.out.println("Permanent: " + ref6);
            String ref7 = job1.getApplicationDeadline();
            System.out.println("Application Deadline: " + ref7);
            System.out.println();

            GovernmentJobs job2 = new GovernmentJobs();
            job2.setJobTitle("Forest Ranger");
            job2.setDepartment("Forest Department");
            job2.setQualification("B.Sc in Forestry");
            job2.setLocation("Karnataka");
            job2.setSalary(65000.0);
            job2.setIsPermanent(true);
            job2.setApplicationDeadline("20/06/2025");

            String ref8 = job2.getJobTitle();
            System.out.println("Job Title: " + ref8);
            String ref9 = job2.getDepartment();
            System.out.println("Department: " + ref9);
            String ref10 = job2.getQualification();
            System.out.println("Qualification: " + ref10);
            String ref11 = job2.getLocation();
            System.out.println("Location: " + ref11);
            double ref12 = job2.getSalary();
            System.out.println("Salary: " + ref12);
            boolean ref13 = job2.getIsPermanent();
            System.out.println("Permanent: " + ref13);
            String ref14 = job2.getApplicationDeadline();
            System.out.println("Application Deadline: " + ref14);
            System.out.println();

            GovernmentJobs job3 = new GovernmentJobs();
            job3.setJobTitle("Police Sub-Inspector");
            job3.setDepartment("Home Affairs");
            job3.setQualification("Any Degree");
            job3.setLocation("Mumbai");
            job3.setSalary(70000.0);
            job3.setIsPermanent(true);
            job3.setApplicationDeadline("30/04/2025");

            String ref15 = job3.getJobTitle();
            System.out.println("Job Title: " + ref15);
            String ref16 = job3.getDepartment();
            System.out.println("Department: " + ref16);
            String ref17 = job3.getQualification();
            System.out.println("Qualification: " + ref17);
            String ref18 = job3.getLocation();
            System.out.println("Location: " + ref18);
            double ref19 = job3.getSalary();
            System.out.println("Salary: " + ref19);
            boolean ref20 = job3.getIsPermanent();
            System.out.println("Permanent: " + ref20);
            String ref21 = job3.getApplicationDeadline();
            System.out.println("Application Deadline: " + ref21);
            System.out.println();

            GovernmentJobs job4 = new GovernmentJobs();
            job4.setJobTitle("Junior Engineer");
            job4.setDepartment("PWD");
            job4.setQualification("Diploma in Civil");
            job4.setLocation("Bangalore");
            job4.setSalary(58000.0);
            job4.setIsPermanent(false);
            job4.setApplicationDeadline("10/07/2025");

            String ref22 = job4.getJobTitle();
            System.out.println("Job Title: " + ref22);
            String ref23 = job4.getDepartment();
            System.out.println("Department: " + ref23);
            String ref24 = job4.getQualification();
            System.out.println("Qualification: " + ref24);
            String ref25 = job4.getLocation();
            System.out.println("Location: " + ref25);
            double ref26 = job4.getSalary();
            System.out.println("Salary: " + ref26);
            boolean ref27 = job4.getIsPermanent();
            System.out.println("Permanent: " + ref27);
            String ref28 = job4.getApplicationDeadline();
            System.out.println("Application Deadline: " + ref28);
            System.out.println();

            GovernmentJobs job5 = new GovernmentJobs();
            job5.setJobTitle("Bank Clerk");
            job5.setDepartment("Finance");
            job5.setQualification("Any Graduate");
            job5.setLocation("Chennai");
            job5.setSalary(40000.0);
            job5.setIsPermanent(true);
            job5.setApplicationDeadline("05/08/2025");

            String ref29 = job5.getJobTitle();
            System.out.println("Job Title: " + ref29);
            String ref30 = job5.getDepartment();
            System.out.println("Department: " + ref30);
            String ref31 = job5.getQualification();
            System.out.println("Qualification: " + ref31);
            String ref32 = job5.getLocation();
            System.out.println("Location: " + ref32);
            double ref33 = job5.getSalary();
            System.out.println("Salary: " + ref33);
            boolean ref34 = job5.getIsPermanent();
            System.out.println("Permanent: " + ref34);
            String ref35 = job5.getApplicationDeadline();
            System.out.println("Application Deadline: " + ref35);
            System.out.println();
        }

}
