/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
import penjualan.entity.pelanggan;
import penjualan.koneksi.koneksi;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import penjualan.entity.pelanggan;
import penjualan.interfc.pelangganInterfc;


/**
 *
 * @author rizkiramdani
 */
public class pelangganImplement implements pelangganInterfc {
   
    public List<pelanggan> getAll() throws SQLException {
    Statement st=koneksi.getConnection().createStatement () ;
    ResultSet rs=st.executeQuery("select * from pelanggan");
    List<pelanggan>list=new ArrayList<pelanggan>();
    while(rs.next()){
        pelanggan plg=new pelanggan();
        plg.setidPelanggan(rs.getString("id_pelanggan"));
        plg.setnama(rs.getString("nama"));
        plg.setjenisKelamin(rs.getString("jk"));
        plg.setalamat(rs.getString("alamat"));
        plg.setnoTelepon(rs.getString("notelp"));
        list.add(plg);
    }
return list;
    }
    
    public pelanggan insert(pelanggan o) throws SQLException {
        PreparedStatement
st=koneksi.getConnection().prepareStatement("insert into pelanggan values(?,?,?,?,?)");
   st.setString(1, o.getidPelanggan());
   st.setString(2, o.getnama());
   st.setString(3, (String) o.getjenisKelamin());
   st.setString(4, o.getalamat());
   st.setString(5, o.getnoTelepon());
        int executeUpdate = st.executeUpdate();
return o;
}
    //==untuk update ke database==//
    public void update(pelanggan o) throws SQLException {
   PreparedStatement
st=koneksi.getConnection().prepareStatement("update  pelanggan set nama=?, jk=?, alamat=?, notelp=? where id_pelanggan=?");
   st.setString(1, o.getnama());
   st.setString(2, o.getjenisKelamin());
   st.setString(3, o.getalamat());
   st.setString(4, o.getnoTelepon());
   st.setString(5, o.getidPelanggan());
   st.executeUpdate();
}
    //==untuk delete data berdasarkan id pelanggan==//
    public void delete(String id_pelanggan)throws SQLException {
        PreparedStatement
st=koneksi.getConnection().prepareStatement("delete from pelanggan where id_pelanggan=?");
        st.setString(1, id_pelanggan);
        st.executeUpdate();
    }

}


