package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ATM_transactions extends JFrame implements ActionListener {
    
    JButton deposit, with_draw, fast_cash, mini_statement, pin_change, balance_enqury, exit;
    String pin_number;
    public ATM_transactions(String pin_number){
        this.pin_number = pin_number;
        setTitle("ATM Transactions");
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
        
        JLabel text = new JLabel("Select Your Transaction");
        text.setBounds(235,300,700,35);
        text.setForeground(Color.black);
        text.setFont(new Font("System", Font.BOLD,18));
        image.add(text);
        
        deposit = new JButton("Deposit");
        deposit.setBounds(170,415,150,30);
        deposit.addActionListener(this);
        image.add(deposit);
        
        with_draw = new JButton("Cash Withdrawl");
        with_draw.setBounds(355,415,150,30);
        with_draw.addActionListener(this);
        image.add(with_draw);
        
        fast_cash = new JButton("Fast Cash");
        fast_cash.setBounds(170,450,150,30);
        fast_cash.addActionListener(this);
        image.add(fast_cash);
        
        mini_statement = new JButton("Mini Statement");
        mini_statement.setBounds(355,450,150,30);
        mini_statement.addActionListener(this);
        image.add(mini_statement);
        
        pin_change = new JButton("Pin Change");
        pin_change.setBounds(170,485,150,30);
        pin_change.addActionListener(this);
        image.add(pin_change);
        
        balance_enqury = new JButton("Balance Enquiry");
        balance_enqury.setBounds(355,485,150,30);
        balance_enqury.addActionListener(this);
        image.add(balance_enqury);
        
        exit = new JButton("Exit");
        exit.setBounds(255,520,150,30);
        exit.addActionListener(this);
        image.add(exit);
        
        
        
         setVisible(true);
    
    }
    public void actionPerformed(ActionEvent s){
        if(s.getSource() == exit){
            System.exit(0);
        }
        else if(s.getSource() == deposit){
            setVisible(false);
            new Deposit(pin_number).setVisible(true);
        }
        else if(s.getSource() == with_draw){
            setVisible(false);
            new With_drawl(pin_number).setVisible(true);
        }
        else if(s.getSource() == fast_cash){
            setVisible(false);
            new FastCash(pin_number).setVisible(true);
        }
        else if(s.getSource() == pin_change){
            setVisible(false);
            new Pin_Change(pin_number).setVisible(true);
        }
        else if(s.getSource() == balance_enqury){
            setVisible(false);
            new BalanceEnquiry(pin_number).setVisible(true);
        }
        else if(s.getSource() == mini_statement){
            setVisible(false);
            new MIniStatement(pin_number).setVisible(true);
        }
    }
    public static void main(String[] args) {
        new ATM_transactions("");
    }
    
}
