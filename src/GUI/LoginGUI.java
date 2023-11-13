package GUI;
import BLL.UserBLL;
import DAL.UserDAL;
import GUI.RegisterGUI;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 *
 * @author Admin
 */
public class LoginGUI {
    private JFrame f_login; 
    private JLabel label_login,label_User,label_Pass;
    private JTextField txtUser;
    private JPasswordField pwdPass;
    private JButton btnLogin, btnRegister;
    public String UserName;
    
    private UserBLL userbll;
    public LoginGUI(){
        userbll = new UserBLL(new UserDAL());
        initComponents();
    }
    
    public void initComponents(){
        f_login = new JFrame();
        f_login.setSize(450,300);
        
        label_login = new JLabel("Login");
        label_login.setBounds(180, 20, 100, 40);
        label_login.setFont(new Font("Aral",Font.BOLD,30));
        
        label_User = new JLabel("Tài Khoản: ");
        label_User.setBounds(30, 80, 100, 30);
        txtUser = new JTextField();
        txtUser.setBounds(110, 80, 200, 30);
        
        label_Pass = new JLabel("Mật Khẩu: ");
        label_Pass.setBounds(30, 120, 100, 30);
        pwdPass = new JPasswordField();
        pwdPass.setBounds(110, 120, 200, 30);   
        
        btnLogin = new JButton("Đăng Nhập");
        btnLogin.setBounds(70, 170, 100, 30);
        btnRegister = new JButton("Đăng Ký");
        btnRegister.setBounds(190, 170, 100, 30);
        
        f_login.add(label_login);
        f_login.add(label_User);f_login.add(txtUser);
        f_login.add(label_Pass);f_login.add(pwdPass);
        f_login.add(btnLogin);f_login.add(btnRegister);
        
        f_login.setLayout(null);
        f_login.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f_login.setLocationRelativeTo(null);
        f_login.setVisible(true);
//Tạo sự kiện cho các nút Button
        btnRegister.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                new RegisterGUI();
                f_login.dispose();
            }
        
        });
        
        btnLogin.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e) {
                String username = txtUser.getText();
                String password = String.valueOf(pwdPass.getPassword());
                if(userbll.authenticate(username, password)){
                    JOptionPane.showMessageDialog(f_login, "Đăng nhập thành công!");
                    new HomePage();
                    f_login.dispose();
                    new HomePage().setVisible(true);
                } else {
                    JOptionPane.showMessageDialog(f_login, "Sai tài khoản hoặc mật khẩu.");
                }
            }
        });
    }
}
