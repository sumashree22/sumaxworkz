package com.job.applicationJob.servlet;

import com.job.applicationJob.dto.JobDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/jobApplication")
public class JobApplicationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        JobDto jobDto = new JobDto();
        // Basic Info
        jobDto.setPosition(req.getParameter("position"));
        jobDto.setName(req.getParameter("name"));
        jobDto.setGender(req.getParameter("gender"));
        jobDto.setPostalAddress(req.getParameter("postalAddress"));
        jobDto.setPermanentAddress(req.getParameter("permanentAddress"));
        jobDto.setPhone(req.getParameter("phone"));
        jobDto.setAlternatePhone(req.getParameter("alternatePhone"));
        jobDto.setEmail(req.getParameter("email"));
        jobDto.setDob(req.getParameter("dob"));
        jobDto.setMaritalStatus(req.getParameter("maritalStatus"));

        // Education
        jobDto.setQualification(req.getParameter("qualification"));
        jobDto.setUniversity(req.getParameter("university"));
        jobDto.setPassingYear(req.getParameter("passingYear"));

        // Experience / Skills
        jobDto.setInternships(req.getParameter("internships"));
        jobDto.setSkills(req.getParameter("skills"));
        jobDto.setLanguages(req.getParameter("languages"));

        // Job Preferences
        jobDto.setRelocate(req.getParameter("relocate"));
        jobDto.setJobLocation(req.getParameter("jobLocation"));
        jobDto.setJoiningDate(req.getParameter("joiningDate"));

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks for the Application");

        System.out.println(jobDto);
    }
}