package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.sql.*;

//inherits- extends(class), interface- implements(abstract class)
public class Login extends JFrame implements ActionListener{
    JButton login_button, clear_text, sign_up;
    JTextField card_input;
    JPasswordField pin_input;
    Login(){                                                        //constructor
        
        setTitle("ATM System");       
        setLayout(null);   
        
       //background image
       ImageIcon x = new ImageIcon(ClassLoader.getSystemResource("icons/login_page2.jpg"));
        Image x2 = x.getImage().getScaledInstance(940,900 ,Image.SCALE_DEFAULT);
        ImageIcon y = new ImageIcon(x2);
        JLabel image = new JLabel(y);
        image.setBounds(0,0,900,900);
        add(image);
        
        setSize(900,900);     
        setLocation(200,130);
        
        getContentPane().setBackground(Color. black);
        
        
        JLabel text = new JLabel("Welcome to MRL ATM");       
        text.setFont(new Font("Osward",Font.BOLD,40));       
        text.setBounds(300,80,900,250);
        text.setForeground(Color.black);
        image.add(text);
        
        JLabel text2 = new JLabel("(Sign-in to check your account in ATM)");       
        text2.setFont(new Font("Osward",Font.BOLD,18));       
        text2.setBounds(330,220,900,90);
        text2.setForeground(Color.black);
        image.add(text2);
    
        
        JLabel card_no = new JLabel("Card : ");    
        card_no.setFont(new Font("Osward",Font.BOLD,20));        
        card_no.setBounds(320,350,200,50);
        image.add(card_no);
        card_input = new JTextField();
        card_input.setBounds(400,350,320,50);
        card_no.setForeground(Color.black);
        card_input.setFont(new Font("Osward",Font.PLAIN,20));
        image.add(card_input);                                          //To show input values upon image
        
        
        JLabel pin_no = new JLabel("  Pin : ");        
        pin_no.setFont(new Font("Osward",Font.BOLD,20));       
        pin_no.setBounds(320,420,300,50);
        pin_no.setForeground(Color.black);
        image.add(pin_no);
        pin_input = new JPasswordField();
        pin_input.setBounds(400,420,320,50);
        pin_input.setFont(new Font("Osward",Font.PLAIN,20));
        image.add(pin_input);
        
        login_button = new JButton("SIGN IN");
        login_button .setBounds(300,500,150,50);
        login_button.setBackground(Color.green);
        login_button.setForeground(Color.black);
        login_button.setFont(new Font("Osward",Font.BOLD,15));
        login_button.addActionListener(this);
        image.add(login_button );
        
        clear_text = new JButton("CLEAR");
        clear_text.setBounds(570,500,150,50);
        clear_text.setBackground(Color.red);
        clear_text.setForeground(Color.black);
        clear_text.setFont(new Font("Osward",Font.BOLD,15));
        clear_text.addActionListener(this);
        image.add(clear_text );
        
        sign_up = new JButton("SIGN UP");
        sign_up.setBounds(300,580,422,60);
        sign_up.setBackground(Color.white);
        sign_up.setForeground(Color.black);
        sign_up.setFont(new Font("Osward",Font.BOLD,15));
        sign_up.addActionListener(this);
        image.add(sign_up);
        
        
        
        
        setVisible(true);

    }
    
    public void actionPerformed(ActionEvent s)
    {
        if(s.getSource() == login_button)
        {
            SQL_Connection c = new SQL_Connection();
            String card_number = card_input.getText();
            String pin_number = pin_input.getText();
            String q = "select * from login where Card_Number = '"+card_number+"' and Pin_Number = '"+pin_number+"'";
            try{
                ResultSet output = c.s.executeQuery(q);
                if(output.next()){
                    setVisible(false);
                    new ATM_transactions(pin_number).setVisible(true);              //primary- Pin
                }
                else{
                    JOptionPane.showMessageDialog(null,"Incorrect Card Number or Pin.");
                }
            }
            catch(Exception e){
                System.out.println(e);
            }
        }
        else if(s.getSource() == clear_text)
        {
            card_input.setText("");
            pin_input.setText("");
        }
        else if(s.getSource() == sign_up)
        {
            setVisible(false);
            new SignUp_File().setVisible(true);
        }
    }
    public static void main(String[] args) {
        new Login();
        
    }
    
}
