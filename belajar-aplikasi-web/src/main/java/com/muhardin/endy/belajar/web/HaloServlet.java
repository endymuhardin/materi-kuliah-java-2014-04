/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.muhardin.endy.belajar.web;

import java.io.IOException;
import java.util.Date;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author endy
 */
public class HaloServlet extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String x = req.getParameter("nama");
        
        String output = "<html>";
        output += "<head><title>Halo Servlet</title></head>";
        
        output += "<body><h1>Halo "+x+", Waktu saat ini : "+new Date()+"</h1></body>";
        
        output += "</html>";
        
        resp.setContentType("text/html");
        resp.getWriter().print(output);
        resp.getWriter().flush();
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
    
    
    
}
