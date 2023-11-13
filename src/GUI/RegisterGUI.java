/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package GUI;

import BLL.UserBLL;
import DAL.UserDAL;
import DTO.UserDTO;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

/**
 *
 * @author Admin
 */
public class RegisterGUI {
    private UserBLL userbll;
    
    public RegisterGUI(){
        userbll = new UserBLL(new UserDAL());
        initComponents();
    }
    
    public void initComponents(){
        JFrame f_register = new JFrame();
            f_register.setSize(600,600);

            JLabel lre = new JLabel("Register");
            lre.setBounds(160, 20, 200, 40);
            lre.setFont(new Font("Aral",Font.BOLD,30));

            JLabel lUserRe = new JLabel("Tài Khoản: ");
            lUserRe.setBounds(30, 80, 100, 30);
            JTextField txtUserRe = new JTextField();
            txtUserRe.setBounds(110, 80, 200, 30);

            JLabel lPassRe = new JLabel("Mật Khẩu: ");
            lPassRe.setBounds(30, 120, 100, 30);
            JPasswordField pwdPassRe = new JPasswordField();
            pwdPassRe.setBounds(110, 120, 200, 30);   
            
            JLabel lPassReConf = new JLabel("Xác Nhận: ");
            lPassReConf.setBounds(30, 160, 100, 30);
            JPasswordField pwdPassReConf = new JPasswordField();
            pwdPassReConf.setBounds(110, 160, 200, 30);  

            JButton btnRegisterRe = new JButton("Đăng Ký");
            btnRegisterRe.setBounds(70, 220, 100, 30);
            JButton btnLoginRe = new JButton("Đăng Nhập");
            btnLoginRe.setBounds(190, 220, 100, 30);
            
            f_register.add(lre);
            f_register.add(lUserRe);f_register.add(txtUserRe);
            f_register.add(lPassRe);f_register.add(pwdPassRe);
            f_register.add(lPassReConf);f_register.add(pwdPassReConf);
            f_register.add(btnRegisterRe);f_register.add(btnLoginRe);
            
            f_register.setLayout(null);
            f_register.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
            f_register.setLocationRelativeTo(null);
            f_register.setVisible(true);            
            
            // Tạo sự kiện cho các nút Button
            btnLoginRe.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    new LoginGUI();
                    f_register.dispose();
                }
            });
            
            btnRegisterRe.addActionListener(new ActionListener(){
                @Override
                public void actionPerformed(ActionEvent e) {
                    String username = txtUserRe.getText();
                    String password = String.valueOf(pwdPassRe.getPassword());
                    String passwordConf = String.valueOf(pwdPassReConf.getPassword());
                    if (password.equals(passwordConf)){
                        UserDTO user = new UserDTO(username, password);
                        userbll.addUser(user);
                        JOptionPane.showMessageDialog(f_register, "Đăng ký thành công!");
                        f_register.dispose();
                        new LoginGUI();
                    }
                    else{
                        JOptionPane.showMessageDialog(f_register, "Đăng ký không thành công!");
                    }
                }
            });

    }
}
