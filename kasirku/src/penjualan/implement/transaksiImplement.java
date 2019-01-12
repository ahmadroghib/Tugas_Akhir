/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.implement;
    import penjualan.koneksi.koneksi;
    import java.sql.PreparedStatement;
    import java.sql.SQLException;
    import penjualan.entity.transaksi;
    import penjualan.koneksi.koneksi;
    import java.sql.ResultSet;
    import java.sql.Statement;
    import java.util.ArrayList;
    import penjualan.view.transaksiView;
    import penjualan.interfc.transaksiInterfc;
/*
 *
 * @author rizkiramdani
 */

public class transaksiImplement {
    public int urutanDb() throws SQLException{
        Statement st=koneksi.getConnection().createStatement();
        int jml = 0;
        try{
            ResultSet rs=st.executeQuery("SELECT COUNT(*) AS urutan FROM "
+ "         penjualan");
            while (rs.next()){
                jml = rs.getInt ("urutan");
            }
                st.close();
                rs.close();
            } catch (Exception e){
            e.printStackTrace();
                    }
            return ++jml;
            }
    
    public ArrayList<String> viewKdBrg() throws SQLException{
        ArrayList<String> viewNamaBrg = new ArrayList();
        try{
            Statement kt=koneksi.getConnection().createStatement();
            ResultSet rsKb=kt.executeQuery("SELECT kode_barang, nama_barang FROM barang");
            while (rsKb.next()){
                viewNamaBrg.add(rsKb.getString("kode_barang")+ "-" + (rsKb.getString("nama_barang")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaBrg;

    }
      public ArrayList<String> viewKdPlgn() throws SQLException{
        ArrayList<String> viewNamaPlgn = new ArrayList();
        try{
            Statement kt=koneksi.getConnection().createStatement();
            ResultSet rsKp=kt.executeQuery("SELECT id_pelanggan, nama FROM pelanggan");
            while (rsKp.next()){
                viewNamaPlgn.add(rsKp.getString("id_pelanggan")+ "-" + (rsKp.getString("nama")));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return viewNamaPlgn;
}
}

