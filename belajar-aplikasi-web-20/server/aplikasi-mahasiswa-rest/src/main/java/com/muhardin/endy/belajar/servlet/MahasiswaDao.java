package com.muhardin.endy.belajar.servlet;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;

import java.text.SimpleDateFormat;
import java.text.ParseException;

public class MahasiswaDao {
    private List<Mahasiswa> data = new ArrayList<Mahasiswa>();

    public MahasiswaDao(){
        SimpleDateFormat formatterTanggal 
            = new SimpleDateFormat("yyyy-MM-dd");
    
        Mahasiswa m1 = new Mahasiswa();
        m1.setId(1);
        m1.setNpm("123456789001");
        m1.setNama("Mahasiswa 001");
        m1.setEmail("mhs001@gmail.com");
        m1.setTanggalLahir(new Date());
        
        
        Mahasiswa m2 = new Mahasiswa();
        m2.setId(2);
        m2.setNpm("123456789002");
        m2.setNama("Mahasiswa 002");
        m2.setEmail("mhs002@gmail.com");
        
        try {
            m2.setTanggalLahir(formatterTanggal.parse("1945-08-17"));
        } catch (ParseException err){
            err.printStackTrace();
            System.out.println("Format tanggal salah, harusnya yyyy-MM-dd");
        }
        
        Mahasiswa m3 = new Mahasiswa();
        m3.setId(3);
        m3.setNpm("123456789003");
        m3.setNama("Mahasiswa 003");
        m3.setEmail("mhs003@gmail.com");
        
        
        Mahasiswa m4 = new Mahasiswa();
        m4.setId(4);
        m4.setNpm("123456789004");
        m4.setNama("Mahasiswa 004");
        m4.setEmail("mhs004@gmail.com");
        
        data.add(m1);
        data.add(m2);
        data.add(m3);
        data.add(m4);
    }

    public List<Mahasiswa> semuaMahasiswa(){
        return data;
    }
}
