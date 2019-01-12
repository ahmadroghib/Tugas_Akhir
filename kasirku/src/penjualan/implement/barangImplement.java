/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package penjualan.implement;
    import penjualan.entity.barang;
    import penjualan.koneksi.koneksi;
    import java.sql.PreparedStatement;
    import java.sql.ResultSet;
    import java.sql.SQLException;
    import java.sql.Statement;
    import java.util.ArrayList;
    import java.util.List;
    import penjualan.interfc.barangInterfc;
/**
 *
 * @author rizkiramdani
 */
public class barangImplement implements barangInterfc{
    public List<barang> getALL() throws SQLException {
       Statement st=koneksi.getConnection().createStatement();
       ResultSet rs=st.executeQuery("select * from barang");
       List<barang>list=new ArrayList<barang>();
       while(rs.next()){
           barang brg=new barang();
           brg.setkodeBarang(rs.getString("kode_barang"));
           brg.setnamaBarang(rs.getString("nama_barang"));
           brg.setJumlah(rs.getString("jumlah"));
           brg.setHarga(rs.getString("harga"));
           list.add(brg);
       }
       return list;
   }
    
    //Untuk Insert Ke database//
    
    public barang insert(barang o) throws SQLException {
        PreparedStatement
st=koneksi.getConnection().prepareStatement("insert into barang values (?,?,?,?)");
    st.setString(1, o.getkodeBarang());
    st.setString(2, o.getnamaBarang());
    st.setString(3, o.getJumlah());
    st.setString(4, o.getHarga()+" ");
    st.executeUpdate();
    return o;
}
    
    //Untuk Update KE database//
    
    public void update (barang o) throws SQLException {
        PreparedStatement
st=koneksi.getConnection().prepareStatement("update barang set nama_barang=?,jumlah=?,harga=? where kode_barang=?");
    st.setString(1, o.getnamaBarang());
    st.setString(2, o.getJumlah());
    st.setString(3, o.getHarga());
    st.setString(4, o.getkodeBarang()+" ");
    st.executeUpdate();
}
    
    //Untuk delete data berdasarkan kode_barang//
    public void delete (String kode_barang) throws SQLException {
        PreparedStatement
st=koneksi.getConnection().prepareStatement("delete from barang where kode_barang=?");
    st.setString(1, kode_barang);
    st.executeUpdate();
}
    
}