package com.muhardin.endy.belajar.servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.google.common.io.CharStreams;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectWriter;
import com.fasterxml.jackson.databind.SerializationFeature;

public class SimpanMahasiswaServlet extends HttpServlet {

    public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException {
        String data = CharStreams.toString(req.getReader());
        System.out.println("Data : "+data);
        
        Mahasiswa m = new ObjectMapper().readValue(data, Mahasiswa.class);
        System.out.println("ID : "+m.getId());
        System.out.println("NPM : "+m.getNpm());
        System.out.println("Nama : "+m.getNama());
        System.out.println("Email : "+m.getEmail());
        System.out.println("Tanggal Lahir : "+m.getTanggalLahir());
        
        // Ambil dao dari ServletContext
        MahasiswaDao md 
            = (MahasiswaDao) req.getSession()
                .getServletContext().getAttribute("mahasiswaDao");
        
        if(md == null){
            md = new MahasiswaDao();
            req.getSession().getServletContext().setAttribute("mahasiswaDao", md);
        }
        
        md.simpan(m);
    }
}
