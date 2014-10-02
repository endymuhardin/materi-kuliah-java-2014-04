package com.muhardin.endy.belajar;

import com.muhardin.endy.belajar.jdbc.*;

public class App {
    public static void main( String[] args ) {
        System.out.println( "Hello World!" );
        
        String driver = "com.mysql.jdbc.Driver";
        String url = "jdbc:mysql://localhost/belajar";
        String username = "belajar";
        String password = "java";
        
        
        KoneksiDatabase koneksi = new KoneksiDatabase(driver, url, username, password);
        
        Kontak k = new Kontak();
        k.setNama("Endy Muhardin");
        k.setEmail("endy.muhardin@gmail.com");
        k.setNoHp("081234567890");
        
        KontakDao kd = new KontakDao(koneksi);
        kd.simpan(k);
    }
}
