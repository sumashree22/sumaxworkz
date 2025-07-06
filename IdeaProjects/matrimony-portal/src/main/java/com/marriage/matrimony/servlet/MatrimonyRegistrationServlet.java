package com.marriage.matrimony.servlet;

import com.marriage.matrimony.dto.MatrimonyRegistrationDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/matrimonyRegistration")
public class MatrimonyRegistrationServlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        MatrimonyRegistrationDto matrimonyDto = new MatrimonyRegistrationDto();
        // Personal Details
        matrimonyDto.setFullName(req.getParameter("fullName"));
        matrimonyDto.setDob(req.getParameter("dob"));
        matrimonyDto.setAge(Integer.parseInt(req.getParameter("age")));
        matrimonyDto.setContact(req.getParameter("contact"));
        matrimonyDto.setEmail(req.getParameter("email"));
        matrimonyDto.setAddress(req.getParameter("address"));

        // Family Background
        matrimonyDto.setFatherName(req.getParameter("fatherName"));
        matrimonyDto.setFatherOccupation(req.getParameter("fatherOccupation"));
        matrimonyDto.setMotherName(req.getParameter("motherName"));
        matrimonyDto.setMotherOccupation(req.getParameter("motherOccupation"));
        matrimonyDto.setSiblings(Integer.parseInt(req.getParameter("siblings")));
        matrimonyDto.setSiblingsDetails(req.getParameter("siblingsDetails"));

        // Education & Career
        matrimonyDto.setHighestEducation(req.getParameter("highestEducation"));
        matrimonyDto.setQualification(req.getParameter("qualification"));
        matrimonyDto.setOccupation(req.getParameter("occupation"));
        matrimonyDto.setEmployer(req.getParameter("employer"));
        matrimonyDto.setWorkLocation(req.getParameter("workLocation"));
        matrimonyDto.setAnnualIncome(req.getParameter("annualIncome"));

        // Partner Preferences
        matrimonyDto.setPartnerReligion(req.getParameter("partnerReligion"));
        matrimonyDto.setPartnerCaste(req.getParameter("partnerCaste"));
        matrimonyDto.setPartnerDiet(req.getParameter("partnerDiet"));
        matrimonyDto.setPartnerLifestyle(req.getParameter("partnerLifestyle"));

        // Physical Details (Optional)
        matrimonyDto.setHeight(req.getParameter("height"));
        matrimonyDto.setWeight(req.getParameter("weight"));
        matrimonyDto.setComplexion(req.getParameter("complexion"));

        // Family Values
        matrimonyDto.setFamilyValues(req.getParameter("familyValues"));

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("Thanks for the Registration...");

    }
}
