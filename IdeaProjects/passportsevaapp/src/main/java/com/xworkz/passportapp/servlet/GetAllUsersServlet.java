package com.xworkz.passportapp.servlet;

import com.xworkz.passportapp.dto.UserRegistrationDto;
import com.xworkz.passportapp.service.GetAllUserService;
import com.xworkz.passportapp.service.impl.GetAllUserServiceImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/getAllUsers")
public class GetAllUsersServlet extends HttpServlet {
 String userName=null;
    GetAllUserService getAllUserService;
    public GetAllUsersServlet(){
        getAllUserService = new GetAllUserServiceImpl();
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        UserRegistrationDto[] dtos=getAllUserService.getAllUsers();

        for(UserRegistrationDto dto : dtos){
            System.out.println(dto);
            userName=dto.getGivenName()+" "+dto.getSurName();
            break;
        }
        req.setAttribute("uname",userName);
        req.setAttribute("listOfUsers",dtos);
        RequestDispatcher requestDispatcher=req.getRequestDispatcher("getUsers.jsp");
        requestDispatcher.forward(req,resp);
    }
}
