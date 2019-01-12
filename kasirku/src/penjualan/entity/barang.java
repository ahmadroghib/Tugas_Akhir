/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.entity;

/**
 *
 * @author rizkiramdani
 */
public class barang {
    private String kode_barang;
     private String namaBarang;
     private int jumlah;
     private double harga;
     String jml = String.valueOf(jumlah);
     String hrg = String.valueOf(harga);
     
     public String getkodeBarang(){
         return kode_barang;
     }
     
     public void setkodeBarang(String kode_barang){
         this.kode_barang = kode_barang;
     }
     
     public String getnamaBarang(){
         return namaBarang;
     }
     
     public void setnamaBarang(String namaBarang){
         this.namaBarang = namaBarang;
     }
     
     public String getJumlah(){
         return jml;
     }
     
     public void setJumlah(String jml){
         this.jml = jml;
     }
     
     public String getHarga(){
         return hrg;
     }
     
     public void setHarga(String hrg){
         this.hrg = hrg;
     }
}
