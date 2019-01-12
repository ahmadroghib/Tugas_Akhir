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
public class pelanggan {
    private String id_pelanggan;
    private String nama;
    private String jk;
    private String alamat ;
    private String notip;
    String ntlp = String.valueOf(notip);
    String Jk = String.valueOf(jk);
    
public String getidPelanggan() {
    return id_pelanggan;
}
public void setidPelanggan(String id_pelanggan){
    this.id_pelanggan = id_pelanggan;
}
public String getnama() {
    return nama;
}
public void setnama(String nama){
    this.nama = nama;
}
public String getjenisKelamin() {
    return Jk;
}
public void setjenisKelamin(String Jk){
    this.Jk = Jk;
}
public String getalamat() {
    return alamat;
}
public void setalamat(String alamat){
    this.alamat = alamat;
}
public String getnoTelepon() {
    return ntlp;
}
public void setnoTelepon(String ntlp){
    this.ntlp = ntlp;    
}
}
