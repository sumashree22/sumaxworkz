package com.xworkz.jobapplication.servlet;

import com.xworkz.jobapplication.dto.RegisterUserDto;
import com.xworkz.jobapplication.service.RegisterUserService;
import com.xworkz.jobapplication.service.impl.RegisterUserServiceImpl;

import javax.servlet.Registration;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/registerUser")
public class RegisterUserServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name=req.getParameter("userName");
        String emailId=req.getParameter("emailId");
        String age=req.getParameter("age");
        String gender=req.getParameter("gender");

        RegisterUserDto registerUserDto=new RegisterUserDto();
        registerUserDto.setName(name);
        registerUserDto.setEmailId(emailId);
        registerUserDto.setAge(age);
        registerUserDto.setGender(gender);

        RegisterUserService registerUserService= new RegisterUserServiceImpl();
           registerUserService.ValidateAndSave(registerUserDto);


    }
}
