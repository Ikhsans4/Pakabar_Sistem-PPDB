
import java.awt.HeadlessException;
import java.io.IOException;
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
public class RegisterPage extends javax.swing.JFrame {

    /**
     * Creates new form RegisterBeta
     */
    public RegisterPage() {
        initComponents();
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
        jLabel2 = new javax.swing.JLabel();
        RegisterLabel = new javax.swing.JLabel();
        namaLengkapLabel = new javax.swing.JLabel();
        namaLengkapField = new javax.swing.JTextField();
        NamaLengkapSeparator1 = new javax.swing.JSeparator();
        UsernameLabel = new javax.swing.JLabel();
        usernameField = new javax.swing.JTextField();
        UsernameSeparator2 = new javax.swing.JSeparator();
        passwordLabel = new javax.swing.JLabel();
        passwordField = new javax.swing.JPasswordField();
        PasswordSeparator3 = new javax.swing.JSeparator();
        retypePasswordLabel = new javax.swing.JLabel();
        retypePasswordField = new javax.swing.JPasswordField();
        retypePasswordSeparator4 = new javax.swing.JSeparator();
        verificationCheckBox = new javax.swing.JCheckBox();
        signUpBottom = new javax.swing.JButton();
        warningLabel = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        SkWarningLabel = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(242, 237, 215));
        jPanel1.setPreferredSize(new java.awt.Dimension(640, 470));

        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setIcon(new javax.swing.ImageIcon(
                "C:\\Users\\muham\\Documents\\NetBeansProjects\\loginpage\\src\\icon\\alexandre-van-thuan-mr9FouttLGY-unsplash.jpg")); // NOI18N
        jLabel2.setLabelFor(this);
        jLabel2.setText("jlabel2");
        jLabel2.setVerticalAlignment(javax.swing.SwingConstants.TOP);
        jLabel2.setPreferredSize(new java.awt.Dimension(317, 470));

        RegisterLabel.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        RegisterLabel.setText("Register");

        namaLengkapLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        namaLengkapLabel.setText("Nama Lengkap");

        namaLengkapField.setBackground(new java.awt.Color(242, 237, 215));
        namaLengkapField.setBorder(null);

        NamaLengkapSeparator1.setForeground(new java.awt.Color(0, 0, 0));

        UsernameLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        UsernameLabel.setText("Username");

        usernameField.setBackground(new java.awt.Color(242, 237, 215));
        usernameField.setBorder(null);
        usernameField.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                usernameFieldActionPerformed(evt);
            }
        });

        UsernameSeparator2.setForeground(new java.awt.Color(0, 0, 0));

        passwordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        passwordLabel.setText("Password");

        passwordField.setBackground(new java.awt.Color(242, 237, 215));
        passwordField.setBorder(null);

        PasswordSeparator3.setForeground(new java.awt.Color(0, 0, 0));

        retypePasswordLabel.setFont(new java.awt.Font("Segoe UI", 0, 12)); // NOI18N
        retypePasswordLabel.setText("Re-type Password");

        retypePasswordField.setBackground(new java.awt.Color(242, 237, 215));
        retypePasswordField.setBorder(null);

        retypePasswordSeparator4.setForeground(new java.awt.Color(0, 0, 0));

        verificationCheckBox.setBackground(new java.awt.Color(242, 237, 215));
        verificationCheckBox.setText("Saya setuju terhadap seluruh S&k");

        signUpBottom.setText("Sign Up");
        signUpBottom.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                signUpBottomMouseClicked(evt);
            }
        });

        warningLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        jPanel2.setBackground(new java.awt.Color(160, 147, 125));

        jLabel1.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Register");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 66, Short.MAX_VALUE));
        jPanel2Layout.setVerticalGroup(
                jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 28, Short.MAX_VALUE));

        jLabel3.setFont(new java.awt.Font("Times New Roman", 0, 14)); // NOI18N
        jLabel3.setText("Sign In");
        jLabel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabel3MouseClicked(evt);
            }
        });

        SkWarningLabel.setFont(new java.awt.Font("Times New Roman", 0, 12)); // NOI18N

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(111, 111, 111)
                                                .addComponent(signUpBottom, javax.swing.GroupLayout.PREFERRED_SIZE, 73,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addGap(27, 27, 27)
                                                .addGroup(jPanel1Layout
                                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING,
                                                                false)
                                                        .addComponent(passwordLabel)
                                                        .addComponent(UsernameLabel)
                                                        .addComponent(retypePasswordLabel)
                                                        .addComponent(retypePasswordField,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, 232,
                                                                Short.MAX_VALUE)
                                                        .addComponent(passwordField)
                                                        .addComponent(UsernameSeparator2)
                                                        .addComponent(usernameField)
                                                        .addComponent(RegisterLabel)
                                                        .addComponent(NamaLengkapSeparator1,
                                                                javax.swing.GroupLayout.Alignment.TRAILING)
                                                        .addComponent(PasswordSeparator3)
                                                        .addComponent(retypePasswordSeparator4)
                                                        .addComponent(namaLengkapLabel)
                                                        .addComponent(warningLabel,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(verificationCheckBox)
                                                        .addComponent(SkWarningLabel,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE,
                                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(namaLengkapField))
                                                .addGap(0, 39, Short.MAX_VALUE))
                                        .addGroup(jPanel1Layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel3)
                                                .addGap(18, 18, 18)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE,
                                                        javax.swing.GroupLayout.DEFAULT_SIZE,
                                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap()))));
        jPanel1Layout.setVerticalGroup(
                jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout
                                        .createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE,
                                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(44, 44, 44)
                                .addComponent(RegisterLabel)
                                .addGap(18, 18, 18)
                                .addComponent(namaLengkapLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(namaLengkapField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NamaLengkapSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernameLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(usernameField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(UsernameSeparator2, javax.swing.GroupLayout.PREFERRED_SIZE, 2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(passwordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(PasswordSeparator3, javax.swing.GroupLayout.PREFERRED_SIZE, 2,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retypePasswordLabel)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retypePasswordField, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(retypePasswordSeparator4, javax.swing.GroupLayout.PREFERRED_SIZE, 10,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(warningLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 0,
                                        javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(verificationCheckBox)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SkWarningLabel)
                                .addGap(33, 33, 33)
                                .addComponent(signUpBottom)
                                .addGap(59, 59, 59))
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE,
                                javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 615, Short.MAX_VALUE));
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE,
                                        javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)));

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jLabel3MouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_jLabel3MouseClicked
        LoginPage login = new LoginPage();
        login.setVisible(true);
        this.dispose();
    }// GEN-LAST:event_jLabel3MouseClicked

    private void signUpBottomMouseClicked(java.awt.event.MouseEvent evt) {// GEN-FIRST:event_signUpBottomMouseClicked
        LoginPage login = new LoginPage();

        if (passwordField.getText().equals(retypePasswordField.getText())) {
            try {
                Register regisAkun = new Register(usernameField.getText(), retypePasswordField.getText(),
                        namaLengkapField.getText());
                if (verificationCheckBox.isSelected()) {
                    boolean sukses = regisAkun.tulisDataRegister();

                    if (!sukses) {
                        JOptionPane.showConfirmDialog(null, "Registrasi berhasil", "Registered", OK_CANCEL_OPTION);
                    } else {
                        JOptionPane.showMessageDialog(rootPane, "Username sudah digunakan!");
                    }
                } else {
                    JOptionPane.showMessageDialog(rootPane, "S&k harus di setujui!");
                }

            } catch (HeadlessException | IOException e) {
                System.out.println(e);
            }
        } else {
            warningLabel.setText("Password tidak sama!");
        }
    }// GEN-LAST:event_signUpBottomMouseClicked

    private void usernameFieldActionPerformed(java.awt.event.ActionEvent evt) {// GEN-FIRST:event_usernameFieldActionPerformed
        // TODO add your handling code here:
    }// GEN-LAST:event_usernameFieldActionPerformed

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
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegisterPage.class.getName()).log(java.util.logging.Level.SEVERE, null,
                    ex);
        }
        // </editor-fold>
        // </editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegisterPage().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JSeparator NamaLengkapSeparator1;
    private javax.swing.JSeparator PasswordSeparator3;
    private javax.swing.JLabel RegisterLabel;
    private javax.swing.JLabel SkWarningLabel;
    private javax.swing.JLabel UsernameLabel;
    private javax.swing.JSeparator UsernameSeparator2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTextField namaLengkapField;
    private javax.swing.JLabel namaLengkapLabel;
    private javax.swing.JPasswordField passwordField;
    private javax.swing.JLabel passwordLabel;
    private javax.swing.JPasswordField retypePasswordField;
    private javax.swing.JLabel retypePasswordLabel;
    private javax.swing.JSeparator retypePasswordSeparator4;
    private javax.swing.JButton signUpBottom;
    private javax.swing.JTextField usernameField;
    private javax.swing.JCheckBox verificationCheckBox;
    private javax.swing.JLabel warningLabel;
    // End of variables declaration//GEN-END:variables
}
