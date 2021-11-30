
import java.awt.HeadlessException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import static javax.swing.JOptionPane.OK_CANCEL_OPTION;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author muham
 */
public class PendaftaranPage extends javax.swing.JFrame {

    /**
     * Creates new form PendaftaranBeta
     */
    public PendaftaranPage() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        JenisKelaminbuttonGroup = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        berandaLabel = new javax.swing.JLabel();
        pendaftaranLabel = new javax.swing.JLabel();
        logOutLabel = new javax.swing.JLabel();
        dataPendaftaranLabel = new javax.swing.JLabel();
        akunLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel8 = new javax.swing.JLabel();
        NamaLengkapLabel = new javax.swing.JLabel();
        NamaLengkapField = new javax.swing.JTextField();
        NamaLengkapSeparator2 = new javax.swing.JSeparator();
        NISNLabel = new javax.swing.JLabel();
        NISNField = new javax.swing.JTextField();
        NISNSeparator3 = new javax.swing.JSeparator();
        alamatLabel = new javax.swing.JLabel();
        alamatField = new javax.swing.JTextField();
        alamatSeparator4 = new javax.swing.JSeparator();
        kabupatenKotaLabel = new javax.swing.JLabel();
        kabupatenKotaField = new javax.swing.JTextField();
        kabupatenKotaSeparator5 = new javax.swing.JSeparator();
        jenisKelaminLabel = new javax.swing.JLabel();
        lakiLakiRadioButton = new javax.swing.JRadioButton();
        perempuanRadioButton = new javax.swing.JRadioButton();
        daftarButton = new javax.swing.JButton();
        jCheckBox2 = new javax.swing.JCheckBox();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(242, 237, 215));

        jPanel1.setBackground(new java.awt.Color(242, 237, 215));

        berandaLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        berandaLabel.setText("Beranda");
        berandaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berandaLabelMouseClicked(evt);
            }
        });

        pendaftaranLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pendaftaranLabel.setText("Pendaftaran");
        pendaftaranLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendaftaranLabelMouseClicked(evt);
            }
        });

        logOutLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logOutLabel.setText("Log Out");
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        dataPendaftaranLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dataPendaftaranLabel.setText("Data Pendaftar");
        dataPendaftaranLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataPendaftaranLabelMouseClicked(evt);
            }
        });

        akunLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        akunLabel.setText("Akun");
        akunLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                akunLabelMouseClicked(evt);
            }
        });

        iconLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        iconLabel.setText("PPDB Online");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("|");

        jSeparator1.setForeground(new java.awt.Color(102, 102, 102));

        jLabel8.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        jLabel8.setText("Pendaftaran Siswa");

        NamaLengkapLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NamaLengkapLabel.setText("Nama Lengkap");

        NamaLengkapField.setBackground(new java.awt.Color(242, 237, 215));
        NamaLengkapField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NamaLengkapField.setBorder(null);
        NamaLengkapField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                NamaLengkapFieldActionPerformed(evt);
            }
        });

        NamaLengkapSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        NISNLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NISNLabel.setText("NISN");

        NISNField.setBackground(new java.awt.Color(242, 237, 215));
        NISNField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        NISNField.setBorder(null);

        NISNSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        alamatLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamatLabel.setText("Alamat");

        alamatField.setBackground(new java.awt.Color(242, 237, 215));
        alamatField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        alamatField.setBorder(null);

        alamatSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        kabupatenKotaLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kabupatenKotaLabel.setText("Kabupaten/Kota");

        kabupatenKotaField.setBackground(new java.awt.Color(242, 237, 215));
        kabupatenKotaField.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        kabupatenKotaField.setBorder(null);

        kabupatenKotaSeparator5.setForeground(new java.awt.Color(0, 0, 0));

        jenisKelaminLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        jenisKelaminLabel.setText("Jenis Kelamin");

        lakiLakiRadioButton.setBackground(new java.awt.Color(242, 237, 215));
        JenisKelaminbuttonGroup.add(lakiLakiRadioButton);
        lakiLakiRadioButton.setText("Laki-laki");
        lakiLakiRadioButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lakiLakiRadioButtonActionPerformed(evt);
            }
        });

        perempuanRadioButton.setBackground(new java.awt.Color(242, 237, 215));
        JenisKelaminbuttonGroup.add(perempuanRadioButton);
        perempuanRadioButton.setText("Perempuan");

        daftarButton.setText("Daftar");
        daftarButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                daftarButtonMouseClicked(evt);
            }
        });
        daftarButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                daftarButtonActionPerformed(evt);
            }
        });

        jCheckBox2.setBackground(new java.awt.Color(242, 237, 215));
        jCheckBox2.setText("Data yang saya masukkan adalah benar");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(iconLabel)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(berandaLabel)
                        .addGap(18, 18, 18)
                        .addComponent(pendaftaranLabel)
                        .addGap(18, 18, 18)
                        .addComponent(dataPendaftaranLabel)
                        .addGap(18, 18, 18)
                        .addComponent(akunLabel)
                        .addGap(18, 18, 18)
                        .addComponent(logOutLabel))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel8))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(165, 165, 165)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(alamatLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(NamaLengkapLabel)
                                        .addComponent(NISNLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(NamaLengkapSeparator2)
                                        .addComponent(NISNField, javax.swing.GroupLayout.DEFAULT_SIZE, 232, Short.MAX_VALUE)
                                        .addComponent(NISNSeparator3)
                                        .addComponent(NamaLengkapField))
                                    .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, 232, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                            .addComponent(lakiLakiRadioButton, javax.swing.GroupLayout.DEFAULT_SIZE, 69, Short.MAX_VALUE)
                                            .addGap(18, 18, 18)
                                            .addComponent(perempuanRadioButton, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addGap(52, 52, 52))
                                        .addComponent(kabupatenKotaLabel, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(alamatSeparator4, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kabupatenKotaField, javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(kabupatenKotaSeparator5, javax.swing.GroupLayout.Alignment.LEADING))
                                    .addComponent(jenisKelaminLabel)
                                    .addComponent(jCheckBox2))))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(245, 245, 245)
                .addComponent(daftarButton, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(berandaLabel)
                    .addComponent(logOutLabel)
                    .addComponent(dataPendaftaranLabel)
                    .addComponent(pendaftaranLabel)
                    .addComponent(akunLabel)
                    .addComponent(iconLabel)
                    .addComponent(jLabel7))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel8)
                .addGap(18, 18, 18)
                .addComponent(NamaLengkapLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaLengkapField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NamaLengkapSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NISNLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NISNField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(NISNSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(alamatSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kabupatenKotaLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kabupatenKotaField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(kabupatenKotaSeparator5, javax.swing.GroupLayout.PREFERRED_SIZE, 2, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jenisKelaminLabel)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lakiLakiRadioButton)
                    .addComponent(perempuanRadioButton))
                .addGap(18, 18, 18)
                .addComponent(jCheckBox2)
                .addGap(18, 18, 18)
                .addComponent(daftarButton)
                .addContainerGap(40, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void NamaLengkapFieldActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_NamaLengkapFieldActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_NamaLengkapFieldActionPerformed

    private void pendaftaranLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pendaftaranLabelMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_pendaftaranLabelMouseClicked

    private void dataPendaftaranLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_dataPendaftaranLabelMouseClicked
        DataPendaftarPage dataPendaftar = null;
        try {
            dataPendaftar = new DataPendaftarPage();
        } catch (IOException ex) {
            Logger.getLogger(PendaftaranPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        dataPendaftar.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_dataPendaftaranLabelMouseClicked

    private void akunLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_akunLabelMouseClicked
        AkunPage akun = null;
        try {
            akun = new AkunPage();
        } catch (IOException ex) {
            Logger.getLogger(PendaftaranPage.class.getName()).log(Level.SEVERE, null, ex);
        }
        akun.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_akunLabelMouseClicked

    private void berandaLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_berandaLabelMouseClicked
        BerandaUserPage beranda = new BerandaUserPage();
        beranda.setVisible(true);
        this.dispose();
    }//GEN-LAST:event_berandaLabelMouseClicked

    private void daftarButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_daftarButtonActionPerformed
        String jenisKelamin;
        if(lakiLakiRadioButton.isSelected()){
            jenisKelamin = lakiLakiRadioButton.getText();  
        }else{
            jenisKelamin = perempuanRadioButton.getText();
        }
        
        try{
            Pendaftar akun = new Pendaftar(NamaLengkapField.getText(), NISNField.getText(), alamatField.getText(), kabupatenKotaField.getText(), jenisKelamin);
            akun.readUserAktif();
            boolean dataExist = akun.cekUserDaftar();
            if(dataExist){
                JOptionPane.showMessageDialog(rootPane, akun.getUsername());
                akun.tulisDataPendaftar();
            }else{
                JOptionPane.showMessageDialog(rootPane, "Pendaftaran sudah dilakukan!");
            }
        }catch(HeadlessException | IOException ex){

        }
    }//GEN-LAST:event_daftarButtonActionPerformed

    private void daftarButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_daftarButtonMouseClicked
//        try{
//        Pendaftar akun = new Pendaftar(NamaLengkapField.getText(), NISNField.getText(), alamatField.getText(), kabupatenKotaField.getText(), "laki-laki");
//        akun.cekUserAktif();
//        akun.tulisDataPendaftar();
//        }catch(Exception e){
//            
//        }
    }//GEN-LAST:event_daftarButtonMouseClicked

    private void lakiLakiRadioButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lakiLakiRadioButtonActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_lakiLakiRadioButtonActionPerformed

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_logOutLabelMouseClicked
        int respon =  JOptionPane.showConfirmDialog(null, "Anda yakin?", "Log Out", OK_CANCEL_OPTION);
       
        if(respon == 0){
             LoginPage login = new LoginPage();
            login.setVisible(true);
            this.dispose();
        }
    }//GEN-LAST:event_logOutLabelMouseClicked

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
            java.util.logging.Logger.getLogger(PendaftaranPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PendaftaranPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PendaftaranPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup JenisKelaminbuttonGroup;
    private javax.swing.JTextField NISNField;
    private javax.swing.JLabel NISNLabel;
    private javax.swing.JSeparator NISNSeparator3;
    private javax.swing.JTextField NamaLengkapField;
    private javax.swing.JLabel NamaLengkapLabel;
    private javax.swing.JSeparator NamaLengkapSeparator2;
    private javax.swing.JLabel akunLabel;
    private javax.swing.JTextField alamatField;
    private javax.swing.JLabel alamatLabel;
    private javax.swing.JSeparator alamatSeparator4;
    private javax.swing.JLabel berandaLabel;
    private javax.swing.JButton daftarButton;
    private javax.swing.JLabel dataPendaftaranLabel;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JCheckBox jCheckBox2;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel jenisKelaminLabel;
    private javax.swing.JTextField kabupatenKotaField;
    private javax.swing.JLabel kabupatenKotaLabel;
    private javax.swing.JSeparator kabupatenKotaSeparator5;
    private javax.swing.JRadioButton lakiLakiRadioButton;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JLabel pendaftaranLabel;
    private javax.swing.JRadioButton perempuanRadioButton;
    // End of variables declaration//GEN-END:variables
}