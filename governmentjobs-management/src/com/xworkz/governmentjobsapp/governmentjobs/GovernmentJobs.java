package com.xworkz.governmentjobsapp.governmentjobs;

public class GovernmentJobs {

        private String jobTitle;
        private String department;
        private String qualification;
        private String location;
        private double salary;
        private boolean isPermanent;
        private String applicationDeadline;

        public void setJobTitle(String jobTitle) {
            this.jobTitle = jobTitle;
        }
        public String getJobTitle() {
            return jobTitle;
        }

        public void setDepartment(String department) {
            this.department = department;
        }
        public String getDepartment() {
            return department;
        }

        public void setQualification(String qualification) {
            this.qualification = qualification;
        }
        public String getQualification() {
            return qualification;
        }

        public void setLocation(String location) {
            this.location = location;
        }
        public String getLocation() {
            return location;
        }

        public void setSalary(double salary) {
            this.salary = salary;
        }
        public double getSalary() {
            return salary;
        }

        public void setIsPermanent(boolean isPermanent) {
            this.isPermanent = isPermanent;
        }
        public boolean getIsPermanent() {
            return isPermanent;
        }

        public void setApplicationDeadline(String applicationDeadline) {
            this.applicationDeadline = applicationDeadline;
        }
        public String getApplicationDeadline() {
            return applicationDeadline;
        }

}
