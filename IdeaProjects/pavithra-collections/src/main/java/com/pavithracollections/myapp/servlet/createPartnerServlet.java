package com.pavithracollections.myapp.servlet;

import com.pavithracollections.myapp.dto.DistributersPartnerDto;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet("/createPartner") //servelet mapping

public class createPartnerServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String distributerName=req.getParameter("distributersName");
        String adress=req.getParameter("adress");
        String mobileNumber= req.getParameter("mobileNumber");
        String totalCost=req.getParameter("totalCost");
        String emailId=req.getParameter("emailId");

        DistributersPartnerDto dto=new DistributersPartnerDto();
        dto.setDistributerName(distributerName);
        dto.setAdress(adress);
        dto.setMobileNumber(mobileNumber);
        dto.setTotalCost(totalCost);
        dto.setEmailId(emailId);

        PrintWriter printWriter = resp.getWriter();
        printWriter.write("thank you   "+distributerName);
        System.out.println(dto);
    }

}