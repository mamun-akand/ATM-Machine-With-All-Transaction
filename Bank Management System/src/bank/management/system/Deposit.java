package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class Deposit extends JFrame implements ActionListener {
    JButton deposit,back;
    JTextField amount;
    String Pin_number;
    public Deposit(String Pin_number){
        this.Pin_number = Pin_number;
        setTitle("Deposit");
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
        
         JLabel text = new JLabel("Enter the amount of Deposit");
        text.setBounds(170,300,400,20);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,18));
        image.add(text);
        
       amount = new JTextField();
       amount.setBounds(170,350,320,25);
       amount.setForeground(Color.black);
       amount.setFont(new Font("System", Font.BOLD,18));
       image.add(amount);
       
       deposit = new JButton("Deposit");
        deposit.setBounds(155,520,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        back = new JButton("Back");
        back.setBounds(367,520,150,30);
       back.addActionListener(this);
        image.add(back);
        
        setVisible(true);

    }
    public void actionPerformed(ActionEvent s){
        if(s.getSource() == deposit){
            String number = amount.getText();
            Date date = new Date();
            if (number.equals("")){
                JOptionPane.showMessageDialog(null,"Amount of money is not given");
                
            }
            else{
                try{
                    SQL_Connection c = new SQL_Connection();
                String q = "insert into transactions values('"+Pin_number+"','"+date+"', 'Deposit', '"+number+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Tk "+number+" Deposited Successfully");
                setVisible(false);
                new ATM_transactions(Pin_number).setVisible(true);
                }
                catch(Exception e){
                    System.out.println(e);
                }
                
            }
            
        }
        else if(s.getSource() == back){
            setVisible(false);
           new ATM_transactions(Pin_number).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Deposit("");
    }
    
}
