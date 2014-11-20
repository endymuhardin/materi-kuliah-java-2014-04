package com.muhardin.endy.belajar.servlet;

public class Mahasiswa {
    private Integer id;
    private String npm;
    private String nama;
    private String email;
    
    public Integer getId(){
        return this.id;
    }
    
    public void setId(Integer x){
        this.id = x;
    }
    
    public String getNpm(){
        return this.npm;
    }
    
    public void setNpm(String x){
        this.npm = x;
    }
    
    public String getNama(){
        return this.nama;
    }
    
    public void setNama(String x){
        this.nama = x;
    }
    
    public String getEmail(){
        return this.email;
    }
    
    public void setEmail(String x){
        this.email = x;
    }
}
