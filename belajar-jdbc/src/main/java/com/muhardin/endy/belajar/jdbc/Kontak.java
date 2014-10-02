package com.muhardin.endy.belajar.jdbc;

public class Kontak {
    private Integer id;
    private String nama;
    private String email;
    private String noHp;
    
    public Integer getId(){
        return id;
    }
    
    public void setId(Integer id){
        this.id = id;
    }
    
    public String getNama(){
        return nama;
    }
    
    public void setNama(String x){
        this.nama = x;
    }
    
    public String getEmail(){
        return email;
    }
    
    public void setEmail(String x){
        this.email = x;
    }
    
    public String getNoHp(){
        return noHp;
    }
    
    public void setNoHp(String x){
        this.noHp = x;
    }
    
    
}
