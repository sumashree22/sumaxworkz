package com.xworkz.passportapp.servlet;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.service.UserRegistrationService;
import com.xworkz.passportapp.service.impl.UserRegistrationServiceimpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/userRegistration")
public class UserRegistrationServlet extends HttpServlet {
    public UserRegistrationServlet(){
        System.out.println("registratinservlet object is created");

    }
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("do post method is invoked from the service");
       String registerAt= req.getParameter("registerAt");
       String passportOffice=req.getParameter("passportOffice");
       String givenName=req.getParameter("givenName");
       String surName=req.getParameter("surName");
       String dob=req.getParameter("dob");
       String email=req.getParameter("email");
       String sameEmail=req.getParameter("sameEmail");
       String loginId=req.getParameter("loginId");
       String password=req.getParameter("password");
       String confirmPassword=req.getParameter("confirmPassword");
       String hintQuestion=req.getParameter("hintQuestion");
       String hintAnswer=req.getParameter("hintAnswer");

        UserRegistrationDto dto=new UserRegistrationDto();
        dto.setRegisterAt(registerAt);
        dto.setPassportOffice(passportOffice);
        dto.setGivenName(givenName);
        dto.setSurName(surName);
        dto.setDob(dob);
        dto.setEmail(email);
        dto.setSameEmail(sameEmail);
        dto.setLoginId(loginId);
        dto.setPassword(password);
        dto.setConfirmPassword(confirmPassword);
        dto.setHintQuestion(hintQuestion);
        dto.setHintAnswer(hintAnswer);
        System.out.println(dto);

        UserRegistrationService registrationService=new UserRegistrationServiceimpl();
        registrationService.validateUser(dto);

        PrintWriter printWriter =  resp.getWriter();
        printWriter.write("registration succesfull");



    }
}
