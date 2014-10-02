package com.muhardin.endy.belajar.jdbc;

import java.sql.*;

public class KontakDao {
    private KoneksiDatabase koneksi;
    
    public KontakDao(KoneksiDatabase k){
        this.koneksi = k;
    }
    
    public void simpan(Kontak k){
        try {
            String sql = "insert into kontak (nama,email,no_hp) values (?,?,?)";
            Connection c = koneksi.connect();
            PreparedStatement ps = c.prepareStatement(sql);
            ps.setString(1, k.getNama());
            ps.setString(2, k.getEmail());
            ps.setString(3, k.getNoHp());
            ps.executeUpdate();
            koneksi.disconnect(c);
        } catch (SQLException err){
            err.printStackTrace();
        }
    }
}
