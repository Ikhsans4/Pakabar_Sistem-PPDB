
import java.io.File;
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
 * @author pakabar
 * @version 21.11.29
 */
public class AkunPage extends javax.swing.JFrame {

    /**
     * Creates new form Profil
     * 
     * @throws java.io.IOException
     */
    public AkunPage() throws IOException {
        initComponents();
        Akun dataUser = new Akun();
        dataUser.readUserAktif();
        namaLengkapField.setText(dataUser.getNamaLengkap());
        usernameField.setText(dataUser.getUsername());
        PasswordField.setText(dataUser.getPassword());
        // menghilangkan garis bawah difield
        SeparatorNamaLengkap.setVisible(false);
        SeparatorUsername.setVisible(false);
        SeparatorPassword.setVisible(false);
        // menghilangkan button save
        saveButton.setVisible(false);
        // menghilangkan box show password
        showPasswordBox.setVisible(false);
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated
    // Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        logOutLabel = new javax.swing.JLabel();
        akunLabel = new javax.swing.JLabel();
        dataPendaftarLabel = new javax.swing.JLabel();
        pendaftaranLabel = new javax.swing.JLabel();
        berandaLabel = new javax.swing.JLabel();
        iconLabel = new javax.swing.JLabel();
        jSeparator1 = new javax.swing.JSeparator();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        namaLengkapField = new javax.swing.JTextField();
        usernameField = new javax.swing.JTextField();
        editButton = new javax.swing.JButton();
        saveButton = new javax.swing.JButton();
        showPasswordBox = new javax.swing.JCheckBox();
        PasswordField = new javax.swing.JPasswordField();
        SeparatorNamaLengkap = new javax.swing.JSeparator();
        SeparatorUsername = new javax.swing.JSeparator();
        SeparatorPassword = new javax.swing.JSeparator();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 237, 215));

        logOutLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        logOutLabel.setText("Log Out");
        logOutLabel.addAncestorListener(new javax.swing.event.AncestorListener() {
            public void ancestorAdded(javax.swing.event.AncestorEvent evt) {
                logOutLabelAncestorAdded(evt);
            }

            public void ancestorMoved(javax.swing.event.AncestorEvent evt) {
            }

            public void ancestorRemoved(javax.swing.event.AncestorEvent evt) {
            }
        });
        logOutLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                logOutLabelMouseClicked(evt);
            }
        });

        akunLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        akunLabel.setText("Akun");

        dataPendaftarLabel.setBackground(new java.awt.Color(0, 0, 0));
        dataPendaftarLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        dataPendaftarLabel.setText("Data Pendaftar");
        dataPendaftarLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                dataPendaftarLabelMouseClicked(evt);
            }
        });

        pendaftaranLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        pendaftaranLabel.setText("Pendaftaran");
        pendaftaranLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pendaftaranLabelMouseClicked(evt);
            }
        });

        berandaLabel.setFont(new java.awt.Font("Times New Roman", 0, 18)); // NOI18N
        berandaLabel.setText("Beranda");
        berandaLabel.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                berandaLabelMouseClicked(evt);
            }
        });

        iconLabel.setFont(new java.awt.Font("Tempus Sans ITC", 0, 18)); // NOI18N
        iconLabel.setText("PPDB Online");

        jSeparator1.setForeground(new java.awt.Color(153, 153, 153));

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        jLabel7.setForeground(new java.awt.Color(153, 153, 153));
        jLabel7.setText("|");

        jLabel8.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel8.setText("Nama Lengkap");

        jLabel9.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel9.setText("Username");

        jLabel11.setText(":");

        jLabel12.setText(":");

        jLabel13.setFont(new java.awt.Font("SansSerif", 0, 12)); // NOI18N
        jLabel13.setText("Password");

        jLabel10.setText(":");

        namaLengkapField.setEditable(false);
        namaLengkapField.setBackground(new java.awt.Color(242, 237, 215));
        namaLengkapField.setBorder(null);

        usernameField.setEditable(false);
        usernameField.setBackground(new java.awt.Color(242, 237, 215));
        usernameField.setBorder(null);

        editButton.setText("Edit");
        editButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editButtonActionPerformed(evt);
            }
        });

        saveButton.setText("Save");
        saveButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveButtonActionPerformed(evt);
            }
        });

        showPasswordBox.setBackground(new java.awt.Color(242, 237, 215));
        showPasswordBox.setFont(new java.awt.Font("Serif", 0, 12)); // NOI18N
        showPasswordBox.setText("Show Password");
        showPasswordBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                showPasswordBoxActionPerformed(evt);
            }
        });

        PasswordField.setEditable(false);
        PasswordField.setBackground(new java.awt.Color(242, 237, 215));
        PasswordField.setBorder(null);

        SeparatorNamaLengkap.setForeground(new java.awt.Color(0, 0, 0));

        SeparatorUsername.setForeground(new java.awt.Color(0, 0, 0));

        SeparatorPassword.setForeground(new java.awt.Color(0, 0, 0));

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
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45,
                                                        Short.MAX_VALUE)
                                                .addComponent(berandaLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(pendaftaranLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(dataPendaftarLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(akunLabel)
                                                .addGap(18, 18, 18)
                                                .addComponent(logOutLabel))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(70, 70, 70)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                        false)
                                                                        .addComponent(jLabel9,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jLabel8)
                                                                        .addComponent(jLabel13,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(jLabel11,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jLabel12,
                                                                                javax.swing.GroupLayout.Alignment.LEADING,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE)
                                                                        .addComponent(jLabel10,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addPreferredGap(
                                                                        javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                        .addComponent(namaLengkapField,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE,
                                                                                230,
                                                                                javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGroup(jPanel1Layout.createParallelGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                false)
                                                                                .addComponent(SeparatorNamaLengkap,
                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                .addComponent(usernameField,
                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                        231, Short.MAX_VALUE))
                                                                        .addGroup(
                                                                                javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                jPanel1Layout.createSequentialGroup()
                                                                                        .addGroup(jPanel1Layout
                                                                                                .createParallelGroup(
                                                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                                                        false)
                                                                                                .addComponent(
                                                                                                        SeparatorUsername,
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(
                                                                                                        PasswordField,
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING,
                                                                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                                        232,
                                                                                                        Short.MAX_VALUE)
                                                                                                .addComponent(
                                                                                                        showPasswordBox,
                                                                                                        javax.swing.GroupLayout.Alignment.LEADING)
                                                                                                .addComponent(
                                                                                                        SeparatorPassword))
                                                                                        .addGap(105, 105, 105))))
                                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                                .addGroup(jPanel1Layout.createParallelGroup(
                                                                        javax.swing.GroupLayout.Alignment.TRAILING,
                                                                        false)
                                                                        .addComponent(editButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                73, Short.MAX_VALUE)
                                                                        .addComponent(saveButton,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                                Short.MAX_VALUE))
                                                                .addGap(85, 85, 85)))
                                                .addGap(0, 0, Short.MAX_VALUE)))
                                .addContainerGap()));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(logOutLabel)
                                        .addComponent(akunLabel)
                                        .addComponent(dataPendaftarLabel)
                                        .addComponent(pendaftaranLabel)
                                        .addComponent(berandaLabel)
                                        .addComponent(iconLabel)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(65, 65, 65)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel12)
                                        .addComponent(namaLengkapField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparatorNamaLengkap, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(2, 2, 2)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)
                                        .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(SeparatorUsername, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(4, 4, 4)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel13)
                                        .addComponent(jLabel10)
                                        .addComponent(PasswordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(SeparatorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(showPasswordBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(editButton)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(saveButton)
                                .addContainerGap(167, Short.MAX_VALUE)));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void berandaLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_berandaLabelMouseClicked
        BerandaUserPage beranda = new BerandaUserPage();
        beranda.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_berandaLabelMouseClicked

    private void pendaftaranLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_pendaftaranLabelMouseClicked
        PendaftaranPage pendaftaranPage = new PendaftaranPage();
        pendaftaranPage.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_pendaftaranLabelMouseClicked

    private void dataPendaftarLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_dataPendaftarLabelMouseClicked
        try {
            DataPendaftarPage dataPendaftar = new DataPendaftarPage();
            dataPendaftar.setVisible(true);
            this.dispose();
        } catch (IOException ex) {
            Logger.getLogger(AkunPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_dataPendaftarLabelMouseClicked

    private void showPasswordBoxActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_showPasswordBoxActionPerformed
        if (showPasswordBox.isSelected()) {
            PasswordField.setEchoChar((char) 0);
        } else {
            PasswordField.setEchoChar('*');
        }
    }// GEN-LAST:event_showPasswordBoxActionPerformed

    private void editButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_editButtonActionPerformed
        // membuat setiap field dapat diedit
        namaLengkapField.setEditable(true);
        usernameField.setEditable(true);
        PasswordField.setEditable(true);
        // memunculkan garis bawah difield
        SeparatorNamaLengkap.setVisible(true);
        SeparatorUsername.setVisible(true);
        SeparatorPassword.setVisible(true);
        // memunculkan button save
        saveButton.setVisible(true);
        // memunculkan box show password
        showPasswordBox.setVisible(true);
        // menghilangkan button edit
        editButton.setVisible(false);

    }// GEN-LAST:event_editButtonActionPerformed

    private void logOutLabelAncestorAdded(javax.swing.event.AncestorEvent evt) {// GEN-FIRST:event_logOutLabelAncestorAdded
        // TODO add your handling code here:
    }// GEN-LAST:event_logOutLabelAncestorAdded

    private void logOutLabelMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_logOutLabelMouseClicked
        int respon = JOptionPane.showConfirmDialog(null, "Anda yakin?", "Log Out", OK_CANCEL_OPTION);

        if (respon == 0) {
            File input = new File("akunAktif.txt");
            input.delete();
            LoginPage login = new LoginPage();
            login.setVisible(true);
            this.dispose();
        }
    }// GEN-LAST:event_logOutLabelMouseClicked

    private void saveButtonActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_saveButtonActionPerformed
        // membuat objek editakun
        Akun editAkun = new Akun();
        try {
            boolean edited = editAkun.editDataAkun(usernameField.getText(), PasswordField.getText(),
                    namaLengkapField.getText());
            if (!edited) {
                JOptionPane.showMessageDialog(rootPane, "Data berhasil diedit");
            } else {
                JOptionPane.showMessageDialog(rootPane, "Data gagal diedit");
            }
            // membuat setiap field tidak dapat diedit
            namaLengkapField.setEditable(false);
            usernameField.setEditable(false);
            PasswordField.setEditable(false);
            // memunculkan garis bawah difield
            SeparatorNamaLengkap.setVisible(false);
            SeparatorUsername.setVisible(false);
            SeparatorPassword.setVisible(false);
            // menghilangkan button save
            saveButton.setVisible(false);
            // menghilangkan box show password
            showPasswordBox.setVisible(false);
            // memunculkan button edit
            editButton.setVisible(true);

        } catch (IOException ex) {
            Logger.getLogger(AkunPage.class.getName()).log(Level.SEVERE, null, ex);
        }
    }// GEN-LAST:event_saveButtonActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        // <editor-fold defaultstate="collapsed" desc=" Look and feel setting code
        // (optional) ">
        /*
         * If Nimbus (introduced in Java SE 6) is not available, stay with the default
         * look and feel.
         * For details see
         * http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(AkunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(AkunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(AkunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(AkunPage.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            @Override
            public void run() {
                try {
                    new AkunPage().setVisible(true);
                } catch (IOException ex) {
                    Logger.getLogger(AkunPage.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPasswordField PasswordField;
    private javax.swing.JSeparator SeparatorNamaLengkap;
    private javax.swing.JSeparator SeparatorPassword;
    private javax.swing.JSeparator SeparatorUsername;
    private javax.swing.JLabel akunLabel;
    private javax.swing.JLabel berandaLabel;
    private javax.swing.JLabel dataPendaftarLabel;
    private javax.swing.JButton editButton;
    private javax.swing.JLabel iconLabel;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JLabel logOutLabel;
    private javax.swing.JTextField namaLengkapField;
    private javax.swing.JLabel pendaftaranLabel;
    private javax.swing.JButton saveButton;
    private javax.swing.JCheckBox showPasswordBox;
    private javax.swing.JTextField usernameField;
    // End of variables declaration//GEN-END:variables
}
