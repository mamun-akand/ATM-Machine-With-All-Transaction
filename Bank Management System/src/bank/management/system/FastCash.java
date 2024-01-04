package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;
import java.util.Date;

public class FastCash extends JFrame implements ActionListener {
    
    JButton c_100, c_500, c_1000, c_2000, c_5000, c_10000, exit;
    String pin_number;
    public FastCash(String pin_number){
        this.pin_number = pin_number;
        setTitle("FastCash");
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
        
        JLabel text = new JLabel("Select Withdrawl amount");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,18));
        image.add(text);
        
        c_100 = new JButton("Tk 100");
        c_100.setBounds(170,415,150,30);
        c_100.addActionListener(this);
        image.add(c_100);
        
        c_500 = new JButton("Tk 500");
        c_500.setBounds(355,415,150,30);
        c_500.addActionListener(this);
        image.add(c_500);
        
        c_1000 = new JButton("Tk 1000");
        c_1000.setBounds(170,450,150,30);
        c_1000.addActionListener(this);
        image.add(c_1000);
        
        c_2000 = new JButton("Tk 2000");
        c_2000.setBounds(355,450,150,30);
        c_2000.addActionListener(this);
        image.add(c_2000);
        
        c_5000 = new JButton("Tk 5000");
        c_5000.setBounds(170,485,150,30);
        c_5000.addActionListener(this);
        image.add(c_5000);
        
        c_10000 = new JButton("Tk 10000");
        c_10000.setBounds(355,485,150,30);
        c_10000.addActionListener(this);
        image.add(c_10000);
        
        exit = new JButton("Back");
        exit.setBounds(255,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
         setVisible(true);
    
    }
    public void actionPerformed(ActionEvent s){
        if(s.getSource() == exit){
           setVisible(false);
           new ATM_transactions(pin_number).setVisible(true);
        }
        else{
            String amount = ((JButton)s.getSource()).getText().substring(3);
            SQL_Connection c = new SQL_Connection();
            try{
                ResultSet tk = c.s.executeQuery("select * from transactions where Pin = '"+pin_number+"'");
                int balance = 0;
                while(tk.next()){
                    if(tk.getString("Type").equals("Deposit")){
                        balance += Integer.parseInt(tk.getString("Amount"));
                    }
                    else{
                        balance -= Integer.parseInt(tk.getString("Amount"));
                    }
                }
                if(s.getSource() != exit && balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null, "Insufficiant Balance");
                    return;
                }
                Date date = new Date();
                String q = "insert into transactions values('"+pin_number+"','"+date+"', 'Withdrawl', '"+amount+"')";
                c.s.executeUpdate(q);
                JOptionPane.showMessageDialog(null,"Tk "+amount+ " Withdraw Successfully");
                setVisible(false);
                new ATM_transactions(pin_number).setVisible(true);
            }
            catch(Exception p){
                System.out.println(p);
            }
        }
    }
    public static void main(String[] args) {
        new FastCash("");
    }
    
}
