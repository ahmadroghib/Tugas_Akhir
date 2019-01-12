/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.koneksi;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import penjualan.koneksi.koneksi;


public class koneksiBarang {
    public static void main(String[] args){
        try {
            Connection c = koneksi.getConnection();
            Statement s = (Statement) c.createStatement();
            String sql = "SELECT * FROM barang";
            ResultSet r = s.executeQuery(sql);
            while(r.next()){
                String kode_barang=r.getString("kode_barang");
                String nama_barang=r.getString("nama_barang");
                String jumlah=r.getString("jumlah");
                String harga=r.getString("harga");
                /*output ke*/
                System.out.println("========================");
                System.out.println("Kode_Barang\t: "+kode_barang);
                System.out.println("Nama_Barang\t: "+nama_barang);
                System.out.println("Jumlah     \t: "+jumlah);
                System.out.println("Harga      \t: "+harga);
            }
            s.close();
            c.close();
        } catch (SQLException e) {e.printStackTrace();           
        }
    }
}
