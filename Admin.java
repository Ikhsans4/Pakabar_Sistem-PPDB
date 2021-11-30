
import java.awt.*;
import javax.swing.*;

public class Admin extends JFrame {

    private JTextField f_User;
    private JPasswordField f_Pass;
    private JButton login, batal;
    
    public Admin(){
        setSize(350, 200);
        setResizable(false);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        userInterface();
        setVisible(true);
    }
    
    private void userInterface(){
        JLabel judul = new JLabel("Form Login Admin");
        judul.setHorizontalAlignment(JLabel.CENTER);
        judul.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 17));
        getContentPane().add(judul, "North");
        
        JPanel panComp = new JPanel();
        panComp.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));
        
        JLabel user = new JLabel("Username");
        user.setPreferredSize(new Dimension(110, 25));
        user.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(user);
        
        f_User = new JTextField();
        f_User.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_User);
        
        JLabel pass = new JLabel("Password");
        pass.setPreferredSize(new Dimension(110, 25));
        pass.setFont(new Font("Lucida Calligraphy", Font.PLAIN, 14));
        panComp.add(pass);
        
        f_Pass = new JPasswordField();
        f_Pass.setPreferredSize(new Dimension(210, 25));
        panComp.add(f_Pass);
        
        getContentPane().add(panComp);
        
        JPanel panButton = new JPanel();
        panButton.setLayout(new FlowLayout(FlowLayout.CENTER, 10, 10));

        login = new JButton("Login Admin");
        panButton.add(login);
        
        batal = new JButton("Batal");
        panButton.add(batal);
        
        getContentPane().add(panButton, "South");
    }
    
    public static void main(String[] args){
        Admin form = new Admin();
    }
}