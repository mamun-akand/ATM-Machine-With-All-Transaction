package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

public class BalanceEnquiry extends JFrame implements ActionListener{
    JButton back;
    String pin_number;
    public BalanceEnquiry(String pin_number){
        this.pin_number = pin_number;
        setTitle("Balance Enquiry");
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
        
        back = new JButton("Back");
        back.setBounds(355,520,150,30);
        back.addActionListener(this);
        image.add(back);
        
        SQL_Connection c = new SQL_Connection();
        int balance = 0;
        try{
             ResultSet tk = c.s.executeQuery("select * from transactions where Pin = '"+pin_number+"'");
                
                while(tk.next()){
                    if(tk.getString("Type").equals("Deposit")){
                        balance += Integer.parseInt(tk.getString("Amount"));
                    }
                    else{
                        balance -= Integer.parseInt(tk.getString("Amount"));
                    }
                }
        }
        catch(Exception p){
            System.out.println(p);
        }
        
       JLabel print = new JLabel("Your Balance is "+balance);
       print.setBounds(170,300,400,30);
       print.setForeground(Color.black);
       print.setFont(new Font("System",Font.BOLD,20));
       image.add(print);
        
        
        
        
        setVisible(true);
    }
    public void actionPerformed(ActionEvent s){
        setVisible(false);
        new ATM_transactions(pin_number).setVisible(true);
    }
    public static void main(String[] args) {
     new BalanceEnquiry("");
    }
}
