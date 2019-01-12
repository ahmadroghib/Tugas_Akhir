/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.koneksi;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import penjualan.koneksi.koneksi;
/**
 *
 * @author rizkiramdani
 */
public class koneksiPelanggan {
    public static void main(String[] args){
        try {
            Connection c = koneksi.getConnection();
            Statement s = (Statement) c.createStatement();
            String sql = "SELECT * FROM pelanggan";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                String id_pelanggan=r.getString("id_pelanggan");
                String nama=r.getString("nama");
                String jk=r.getString("jk");
                String alamat=r.getString("alamat");
                String notip=r.getString("notip");
                /*output ke*/
                System.out.println("========================");
                System.out.println("id_pelanggan  \t: "+id_pelanggan);
                System.out.println("nama_pelanggan\t: "+nama);
                System.out.println("Jenis Kelamin \t: "+jk);
                System.out.println("alamat        \t: "+alamat);
                System.out.println("notip         \t: "+notip);
            }
            s.close();
            c.close();
        } catch (SQLException e) {e.printStackTrace();           
        }
    }
}
