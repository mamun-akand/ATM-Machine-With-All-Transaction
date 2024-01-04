package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class Pin_Change extends JFrame implements ActionListener {
    String pin_number;
    JPasswordField pin_input,pin_input2;
    JButton change,back;
    public Pin_Change(String pin_number){
        this.pin_number = pin_number;
        setLayout(null);
        setSize(900,900);
        setLocation(300,0);
        //setUndecorated(true);
        
        ImageIcon x = new ImageIcon(ClassLoader.getSystemResource("icons/ATM3.jpg"));
        Image x2 = x.getImage().getScaledInstance(900,900 ,Image.SCALE_DEFAULT);
        ImageIcon y = new ImageIcon(x2);
        JLabel image = new JLabel(y);
        image.setBounds(0,0,900,900);
        add(image);
        
        JLabel text = new JLabel("Change your Pin: ");
        text.setBounds(250,280,500,35);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,20));
        image.add(text);
        
        JLabel pin = new JLabel("New Pin: ");
        pin.setBounds(165,320,180,25);
        pin.setForeground(Color.black);
        pin.setFont(new Font("System", Font.BOLD,17));
        image.add(pin);
        
        JLabel pin2 = new JLabel("Re-Enter Your Pin: ");
        pin2.setBounds(165,360,180,25);
        pin2.setForeground(Color.black);
        pin2.setFont(new Font("System", Font.BOLD,17));
        image.add(pin2);
        
        pin_input = new JPasswordField();
        pin_input.setBounds(330,320,180,25);
        pin_input.setForeground(Color.black);
        pin_input.setFont(new Font("System", Font.BOLD,17));
        image.add(pin_input);
        
        pin_input2 = new JPasswordField();
        pin_input2.setBounds(330,360,180,25);
        pin_input2.setForeground(Color.black);
        pin_input2.setFont(new Font("System", Font.BOLD,17));
        image.add(pin_input2);
        
        back = new JButton("Back");
        back.setBounds(365,520,150,30);
        back.setForeground(Color.black);
        back.setFont(new Font("System", Font.BOLD,17));
        back.addActionListener(this);
        image.add(back);
        
        change = new JButton("Change");
        change.setBounds(157,520,150,30);
        change.setForeground(Color.black);
        change.setFont(new Font("System", Font.BOLD,17));
        change.addActionListener(this);
        image.add(change);
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent s){
        if(s.getSource() == change){
            try{
            String pin_check = pin_input.getText();
            String pin_check2 = pin_input2.getText();
            if(!pin_check.equals(pin_check2)){
                JOptionPane.showMessageDialog(null,"Entered pin doesnot matched");
                return;
            }
            if(pin_check.equals("")){
                JOptionPane.showMessageDialog(null,"Pin is not given");
                return;
            }
            if(pin_check2.equals("")){
                JOptionPane.showMessageDialog(null,"Re-Enter the pin");
                return;
            }
            SQL_Connection c = new SQL_Connection();
            String q = "update transactions set Pin = '"+pin_check2+"' where Pin = '"+pin_number+"'";
            String q2 = "update login set Pin_Number = '"+pin_check2+"' where Pin_Number = '"+pin_number+"'";
            String q3 = "update signup3 set Pin_Number = '"+pin_check2+"' where Pin_Number = '"+pin_number+"'";
            c.s.executeUpdate(q);
            c.s.executeUpdate(q2);
            c.s.executeUpdate(q3);
            JOptionPane.showMessageDialog(null,"Pin change successfully");
            setVisible(false);
           new ATM_transactions(pin_number).setVisible(true);
        }
        catch(Exception p){
            System.out.println(p);
        }
        }
        else{
            setVisible(false);
             new ATM_transactions(pin_number).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Pin_Change("");
    }
    
}
