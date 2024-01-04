package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

public class SignUp_File3 extends JFrame implements ActionListener {
    
    JRadioButton x,x2,x3,x4;
    JCheckBox c,c2,c3,c4,c5,c6,c7;
    JButton submit,cancel;
    String form;
    public SignUp_File3(String form){
        this.form = form;
        setLayout(null);
        
     
      
       ImageIcon l = new ImageIcon(ClassLoader.getSystemResource("icons/sign_in_page2.jpg"));
        Image l2 = l.getImage().getScaledInstance(940,900 ,Image.SCALE_DEFAULT);
        ImageIcon y2 = new ImageIcon(l2);
        JLabel image = new JLabel(y2);
        image.setBounds(0,0,900,900);
        add(image);
        
        setSize(900,900);     
        setLocation(200,130);
        
        
        setVisible(true);
      
        
       JLabel page3 = new JLabel("Account Details");
       page3.setFont(new Font("Osward",Font.BOLD,28));
       page3.setBounds(330,130,400,30);
       page3.setForeground(Color.black);
       image.add(page3);
       
       JLabel account_type = new JLabel("Account Type: ");
       account_type.setFont(new Font("Osward",Font.BOLD,20));
       account_type.setBounds(220,200,200,30);
       account_type.setForeground(Color.black);
       image.add(account_type);
       
       x = new JRadioButton("Saving Account");
       x.setBounds(220,250,150,30);
       x.setFont(new Font("Osward",Font.BOLD,15));
       x.setForeground(Color.black);
       x.setBackground(Color.cyan);
       image.add(x);
       
        x2 = new JRadioButton("Fixed Deposit Account");
       x2.setBounds(450,250,190,30);
       x2.setFont(new Font("Osward",Font.BOLD,15));
       x2.setForeground(Color.black);
       x2.setBackground(Color.cyan);
   
       image.add(x2);
       
        x3 = new JRadioButton("Current Account");
       x3.setBounds(220,300,150,30);
       x3.setFont(new Font("Osward",Font.BOLD,15));
       x3.setForeground(Color.black);
       x3.setBackground(Color.cyan);
       image.add(x3);
       
        x4 = new JRadioButton("Recurring Account");
       x4.setBounds(450,300,190,30);
       x4.setFont(new Font("Osward",Font.BOLD,15));
       x4.setForeground(Color.black);
       x4.setBackground(Color.cyan);
       image.add(x4);
       
       ButtonGroup group_account = new ButtonGroup();
       group_account.add(x);
       group_account.add(x2);
       group_account.add(x3);
       group_account.add(x4);
       
       JLabel card = new JLabel("Card Number: ");
       card.setFont(new Font("Osward",Font.BOLD,20));
       card.setBounds(100,360,200,30);
       card.setForeground(Color.black);
       image.add(card);
       
       JLabel number = new JLabel("XXXX - XXXX - XXXX - XXXX");
       number.setFont(new Font("Osward",Font.BOLD,20));
       number.setBounds(330,360,300,30);
       number.setForeground(Color.black);
       image.add(number);
       
       JLabel card_details = new JLabel("(This is your 16 digits card number)");
       card_details.setFont(new Font("Osward",Font.BOLD,12));
       card_details.setBounds(100,390,300,20);
       card_details.setForeground(Color.black);
       image.add(card_details);
       
       JLabel pin = new JLabel("Pin Number: ");
       pin.setFont(new Font("Osward",Font.BOLD,20));
       pin.setBounds(100,420,200,30);
       pin.setForeground(Color.black);
       image.add(pin);
       
       JLabel number2 = new JLabel("X X X X");
       number2.setFont(new Font("Osward",Font.BOLD,20));
       number2.setBounds(330,420,300,30);
       number2.setForeground(Color.black);
       image.add(number2);
       
       JLabel pin_details = new JLabel("(Your 4 digits Password)");
       pin_details.setFont(new Font("Osward",Font.BOLD,12));
       pin_details.setBounds(100,450,300,20);
       pin_details.setForeground(Color.black);
       image.add(pin_details);
       
       JLabel services = new JLabel("Service Required");
       services.setFont(new Font("Osward",Font.BOLD,22));
       services.setBounds(220,490,200,30);
       services.setForeground(Color.black);
       image.add(services);
       
       
       c = new JCheckBox("ATM Card");
       c.setBounds(220,550,200,30);
       c.setFont(new Font("Osward",Font.BOLD,15));
       c.setForeground(Color.black);
       c.setBackground(Color.cyan);
       image.add(c);
       
       c2 = new JCheckBox("Internet Banking");
       c2.setBounds(450,550,200,30);
       c2.setFont(new Font("Osward",Font.BOLD,15));
       c2.setForeground(Color.black);
       c2.setBackground(Color.cyan);
       image.add(c2);
       
       c3 = new JCheckBox("Mobile Banking");
       c3.setBounds(220,600,200,30);
       c3.setFont(new Font("Osward",Font.BOLD,15));
       c3.setForeground(Color.black);
       c3.setBackground(Color.cyan);
       image.add(c3);
       
       c4 = new JCheckBox("Email & SMS Alerts");
       c4.setBounds(450,600,200,30);
       c4.setFont(new Font("Osward",Font.BOLD,15));
       c4.setForeground(Color.black);
       c4.setBackground(Color.cyan);
       image.add(c4);
       
       c5 = new JCheckBox("Cheque Book");
       c5.setBounds(450,650,200,30);
       c5.setFont(new Font("Osward",Font.BOLD,15));
       c5.setForeground(Color.black);
       c5.setBackground(Color.cyan);
       image.add(c5);
       
       c6 = new JCheckBox("E- Statement");
       c6.setBounds(220,650,200,30);
       c6.setFont(new Font("Osward",Font.BOLD,15));
       c6.setForeground(Color.black);
       c6.setBackground(Color.cyan);
       image.add(c6);
       
       c7 = new JCheckBox("Accepts the terms and policy");
       c7.setBounds(100,720,630,30);
       c7.setFont(new Font("Osward",Font.BOLD,15));
       c7.setForeground(Color.black);
       c7.setBackground(Color.white);
       image.add(c7);
       
       submit = new JButton("Submit");
       submit.setBounds(250,790,100,30);
       submit.setFont(new Font("Osward",Font.BOLD,15));
       submit.setBackground(Color.green);
       submit.setForeground(Color.black);
       submit.addActionListener(this);
       image.add(submit);
       
       cancel = new JButton("Cancel");
       cancel.setBounds(420,790,100,30);
       cancel.setFont(new Font("Osward",Font.BOLD,15));
       cancel.setBackground(Color.white);
       cancel.setForeground(Color.black);
       cancel.addActionListener(this);
       image.add(cancel);
    }
    public void actionPerformed(ActionEvent s){
        if(s.getSource() == submit){
            String account_type = null;
            if(x.isSelected()){
                account_type = "Saving Account";
            }
            else if(x2.isSelected()){
                account_type = "Fixed Deposit Account";
            }
            else if(x3.isSelected()){
                account_type = "Current Account";
            }
            else if(x4.isSelected()){
                account_type = "Recurring Deposit Account";
            }
            
            Random c_number = new Random();
            String cardNumber = "" + Math.abs((c_number.nextLong() % 90000000L) + 5423486000000000L);
            String pinNumber = "" + Math.abs((c_number.nextLong() % 9000L) + 1000L);
            
            String facility = "";
            if(c.isSelected()){
                facility = facility + "ATM Card";
            }
            else if(c2.isSelected()){
                facility = facility + "Internet Banking";
            }
            else if(c3.isSelected()){
                facility = facility + "Mobile Banking";
            }
            else if(c4.isSelected()){
                facility = facility + "Email & SMS Alerts";
            }
            else if(c5.isSelected()){
                facility = facility + "Cheque Book";
            }
            else if(c6.isSelected()){
                facility = facility + "E-Statement";
            }
            
            try{
               if(account_type.equals("")){
              JOptionPane.showMessageDialog(null,"Account Type is not given");
                }
          
          else{
              SQL_Connection c = new SQL_Connection();
              String q = "insert into signup3 values('"+form+"', '"+account_type+"', '"+cardNumber+"', '"+pinNumber+"', '"+facility+"')";
              String q2 = "insert into login values('"+form+"','"+cardNumber+"','"+pinNumber+"')";
              c.s.executeUpdate(q);
              c.s.executeUpdate(q2);
              JOptionPane.showMessageDialog(null,"Card Number: " +cardNumber+"\n Pin Code: "+pinNumber);
              setVisible(false);
              new Deposit(pinNumber).setVisible(true);
                } 
            }
            catch(Exception p){
                System.out.println(p);
            }
            
            
        }
        else if(s.getSource() == cancel){
            setVisible(false);
            new Login().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new SignUp_File3("");
    }
}
