package com.muhardin.endy.belajar.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class DaftarMahasiswaServlet extends HttpServlet {

    public void doGet(HttpServletRequest req, HttpServletResponse res) throws IOException {
        res.setContentType("application/json");
        
        // Ambil dao dari ServletContext
        MahasiswaDao md 
            = (MahasiswaDao) req.getSession()
                .getServletContext().getAttribute("mahasiswaDao");
        
        if(md == null){
            md = new MahasiswaDao();
            req.getSession().getServletContext().setAttribute("mahasiswaDao", md);
        }
        
        List<Mahasiswa> dataMahasiswa = md.semuaMahasiswa();

        final ObjectWriter writer = new ObjectMapper().writer();
        String jsonMahasiswa = writer
                                .with(SerializationFeature.INDENT_OUTPUT)
                                .writeValueAsString(dataMahasiswa);
                            
        
        //String output = "{nama:\"Endy Muhardin\"}";
        res.getWriter().println(jsonMahasiswa);
        res.getWriter().flush();
    }
}
