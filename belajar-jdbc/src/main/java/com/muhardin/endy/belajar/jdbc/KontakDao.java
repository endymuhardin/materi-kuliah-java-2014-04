package com.muhardin.endy.belajar.jdbc;

import java.sql.*;
import java.util.*;

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
    
    public List<Kontak> cariSemua(){
        List<Kontak> hasil = new ArrayList<Kontak>();
        
        try {
            String sql = "select * from kontak order by nama";
            Connection c = koneksi.connect();
            PreparedStatement ps = c.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Kontak k = konversiResultSet(rs);
                hasil.add(k);
            }
            
            koneksi.disconnect(c);
        } catch (SQLException err){
            err.printStackTrace();
        }
        
        return hasil;
    }
    
    private Kontak konversiResultSet(ResultSet rs) throws SQLException {
        Kontak k = new Kontak();
        k.setId(rs.getInt("id"));
        k.setNama(rs.getString("nama"));
        k.setEmail(rs.getString("email"));
        k.setNoHp(rs.getString("no_hp"));
        return k;
    }
}
