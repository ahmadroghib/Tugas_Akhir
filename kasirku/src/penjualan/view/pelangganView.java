/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package penjualan.view;
import penjualan.entity.pelanggan;
import penjualan.implement.pelangganImplement;
import penjualan.interfc.pelangganInterfc;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JOptionPane;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import kasir.MenuUtama;

/**
 *
 * @author rizkiramdani
 */
public class pelangganView extends javax.swing.JFrame {
    List<pelanggan> record=new ArrayList<pelanggan>();
    pelangganInterfc plgServis;
    int row;
   
        
    /**
     * Creates new form pelangganView
     */
    public pelangganView() {
        initComponents();
        plgServis = new pelangganImplement();
        tabelPelanggan.getSelectionModel().addListSelectionListener(
                new ListSelectionListener() {
                    public void valueChanged(ListSelectionEvent e) {
                        row=tabelPelanggan.getSelectedRow();
                        if(row!=-1){
                            isiText();
                        }
                    }
                });
        this.statusAwal();
    }

    
    void loadData(){
        try {
            record = plgServis.getAll();
        }
        catch (SQLException ex) {
            Logger.getLogger(pelangganView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
  
    
    void isiTabel(){
        Object data[][]=new Object[record.size()][5];
        int x=0;
        for (pelanggan plg:record) {
            data[x][0]=plg.getidPelanggan();
            data[x][1]=plg.getnama();
            data[x][2]=plg.getjenisKelamin();
            data[x][3]=plg.getalamat();
            data[x][4]=plg.getnoTelepon();
            x++;
        }
        String judul[]={"id_pelanggan","Nama Pelanggan","Jenis Kelamin","Alamat","No Tlp"};
        tabelPelanggan.setModel(new DefaultTableModel(data, judul));
        jScrollPane1.setViewportView(tabelPelanggan);
    }
    void kosongkanText(){
        txtKodePelanggan.setText("");
        txtNamaPelanggan.setText("");
        pilihjeniskelamin.setSelectedItem("");
        txtAlamatPelanggan.setText("");
        txtNoTip.setText("");
    }
   
    void isiText(){
        pelanggan plg=record.get(row);
        txtKodePelanggan.setText(plg.getidPelanggan());
        txtNamaPelanggan.setText(plg.getnama());
        pilihjeniskelamin.setSelectedItem(plg.getjenisKelamin());
        txtAlamatPelanggan.setText(plg.getalamat());
        txtNoTip.setText(plg.getnoTelepon());
        
    }
    
   
    void statusAwal(){
        kosongkanText();
        loadData();
        isiTabel();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTextField1 = new javax.swing.JTextField();
        Gambar = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        background31 = new Background.Background3();
        KodePelanggan = new javax.swing.JLabel();
        NamaPelanggan = new javax.swing.JLabel();
        Alamat = new javax.swing.JLabel();
        NoTlpn = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtKodePelanggan = new Background.TextFieldTransparan();
        txtNamaPelanggan = new Background.TextFieldTransparan();
        txtAlamatPelanggan = new Background.TextFieldTransparan();
        txtNoTip = new Background.TextFieldTransparan();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelPelanggan = new javax.swing.JTable();
        pilihjeniskelamin = new javax.swing.JComboBox();
        background21 = new Background.Background2();
        BTambah = new Background.ButtonTransparan();
        background22 = new Background.Background2();
        BEdit = new Background.ButtonTransparan();
        background23 = new Background.Background2();
        BDelete = new Background.ButtonTransparan();
        Kembali = new Background.ButtonTransparan();

        jTextField1.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Gambar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/MasterBarang.png"))); // NOI18N

        jLabel2.setFont(new java.awt.Font("Times New Roman", 1, 22)); // NOI18N
        jLabel2.setText("INPUT DATA PELANGGAN");

        jLabel3.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel3.setText("Input, Edit dan Hapus Barang");

        KodePelanggan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        KodePelanggan.setText("Kode Pelanggan");

        NamaPelanggan.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NamaPelanggan.setText("Nama Pelanggan");

        Alamat.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        Alamat.setText("Alamat");

        NoTlpn.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        NoTlpn.setText("No Tlpn");

        jLabel1.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel1.setText("FORM PELANGGAN :");

        jLabel4.setFont(new java.awt.Font("Times New Roman", 1, 14)); // NOI18N
        jLabel4.setText("Jenis Kelamin");

        txtKodePelanggan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNamaPelanggan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtAlamatPelanggan.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        txtNoTip.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N

        tabelPelanggan.setFont(new java.awt.Font("Tahoma", 0, 13)); // NOI18N
        tabelPelanggan.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Id Pelanggan", "Nama", "Jk", "Alamat", "No Tip"
            }
        ));
        jScrollPane1.setViewportView(tabelPelanggan);

        pilihjeniskelamin.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        pilihjeniskelamin.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Di Pilih\t", "Laki-laki\t", "Perempuan" }));
        pilihjeniskelamin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                pilihjeniskelaminActionPerformed(evt);
            }
        });

        BTambah.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Tambah.png"))); // NOI18N
        BTambah.setText("TAMBAH");
        BTambah.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BTambahActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background21Layout = new javax.swing.GroupLayout(background21);
        background21.setLayout(background21Layout);
        background21Layout.setHorizontalGroup(
            background21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BTambah, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 111, Short.MAX_VALUE)
        );
        background21Layout.setVerticalGroup(
            background21Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background21Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BTambah, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/edit.png"))); // NOI18N
        BEdit.setText("EDIT");
        BEdit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BEditActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background22Layout = new javax.swing.GroupLayout(background22);
        background22.setLayout(background22Layout);
        background22Layout.setHorizontalGroup(
            background22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        background22Layout.setVerticalGroup(
            background22Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background22Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BEdit, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        BDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Hapus.png"))); // NOI18N
        BDelete.setText("HAPUS");
        BDelete.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BDeleteActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout background23Layout = new javax.swing.GroupLayout(background23);
        background23.setLayout(background23Layout);
        background23Layout.setHorizontalGroup(
            background23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, background23Layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        background23Layout.setVerticalGroup(
            background23Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background23Layout.createSequentialGroup()
                .addComponent(BDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout background31Layout = new javax.swing.GroupLayout(background31);
        background31.setLayout(background31Layout);
        background31Layout.setHorizontalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background31Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background31Layout.createSequentialGroup()
                        .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(Alamat)
                            .addComponent(NamaPelanggan)
                            .addComponent(KodePelanggan)
                            .addComponent(jLabel4)
                            .addComponent(NoTlpn))
                        .addGap(18, 18, 18)
                        .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtKodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pilihjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtAlamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 251, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNoTip, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(background31Layout.createSequentialGroup()
                        .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jScrollPane1)
                            .addGroup(background31Layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 196, Short.MAX_VALUE)
                                .addComponent(background21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(background22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(background23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(17, 17, 17))))
        );
        background31Layout.setVerticalGroup(
            background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(background31Layout.createSequentialGroup()
                .addGap(18, 18, 18)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(KodePelanggan)
                    .addComponent(txtKodePelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NamaPelanggan)
                    .addComponent(txtNamaPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(16, 16, 16)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(pilihjeniskelamin, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background31Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(Alamat))
                    .addGroup(background31Layout.createSequentialGroup()
                        .addGap(9, 9, 9)
                        .addComponent(txtAlamatPelanggan, javax.swing.GroupLayout.PREFERRED_SIZE, 66, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNoTip, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(NoTlpn))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 35, Short.MAX_VALUE)
                .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(background31Layout.createSequentialGroup()
                        .addGap(7, 7, 7)
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(background31Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(background21, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(background22, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(background23, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(42, 42, 42))
        );

        Kembali.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Image/Keluar.png"))); // NOI18N
        Kembali.setText("KEMBALI");
        Kembali.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                KembaliActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Gambar)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(Kembali, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addComponent(background31, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Gambar)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(jLabel2)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(jLabel3)))
                    .addComponent(Kembali, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(background31, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void pilihjeniskelaminActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_pilihjeniskelaminActionPerformed
        // TODO add your handling code here:
        //cmbJenisKelamin( "JenisKelamin"+cmbJenisKelamin.getSelectedItem());
    }//GEN-LAST:event_pilihjeniskelaminActionPerformed

    private void BDeleteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BDeleteActionPerformed
        // TODO add your handling code here:
        try {
            pelanggan plg = new pelanggan();
            String id_pelanggan = txtKodePelanggan.getText();
            plgServis.delete(id_pelanggan);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "Data Berhasil Dihapus");
        } catch (SQLException ex){
            Logger.getLogger(pelangganView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BDeleteActionPerformed

    private void BEditActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BEditActionPerformed
        // TODO add your handling code here:
        try {
            pelanggan plg = new pelanggan();
            plg.setidPelanggan(txtKodePelanggan.getText());
            plg.setnama(txtNamaPelanggan.getText());
            plg.setjenisKelamin((String) pilihjeniskelamin.getSelectedItem());
            plg.setalamat(txtAlamatPelanggan.getText());
            plg.setnoTelepon(txtNoTip.getText());
            plgServis.update(plg);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "Data Berhasil Diubah");
        } catch (SQLException ex){
            Logger.getLogger(pelangganView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BEditActionPerformed

    private void BTambahActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BTambahActionPerformed
        // TODO add your handling code here:
        try {
            pelanggan plg = new pelanggan();
            plg.setidPelanggan(txtKodePelanggan.getText());
            plg.setnama(txtNamaPelanggan.getText());
            plg.setjenisKelamin((String)this.pilihjeniskelamin.getSelectedItem());
            plg.setalamat(txtAlamatPelanggan.getText());
            plg.setnoTelepon(txtNoTip.getText());
            plgServis.insert(plg);
            this.statusAwal();
            JOptionPane.showMessageDialog(this, "Data Tersimpan");
        } catch (SQLException ex){
            Logger.getLogger(pelangganView.class.getName()).log(Level.SEVERE, null, ex);
        }
    }//GEN-LAST:event_BTambahActionPerformed

    private void KembaliActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_KembaliActionPerformed
        // TODO add your handling code here:
        new MenuUtama().setVisible(true);
        this.dispose();
    }//GEN-LAST:event_KembaliActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(pelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(pelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(pelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(pelangganView.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new pelangganView().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Alamat;
    private Background.ButtonTransparan BDelete;
    private Background.ButtonTransparan BEdit;
    private Background.ButtonTransparan BTambah;
    private javax.swing.JLabel Gambar;
    private Background.ButtonTransparan Kembali;
    private javax.swing.JLabel KodePelanggan;
    private javax.swing.JLabel NamaPelanggan;
    private javax.swing.JLabel NoTlpn;
    private Background.Background2 background21;
    private Background.Background2 background22;
    private Background.Background2 background23;
    private Background.Background3 background31;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JComboBox pilihjeniskelamin;
    private javax.swing.JTable tabelPelanggan;
    private Background.TextFieldTransparan txtAlamatPelanggan;
    private Background.TextFieldTransparan txtKodePelanggan;
    private Background.TextFieldTransparan txtNamaPelanggan;
    private Background.TextFieldTransparan txtNoTip;
    // End of variables declaration//GEN-END:variables

   
}
