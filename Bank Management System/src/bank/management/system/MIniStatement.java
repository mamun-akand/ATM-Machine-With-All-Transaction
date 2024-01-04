
package bank.management.system;
import javax.swing.*;
import java.awt.*;
import java.sql.*;

public class MIniStatement extends JFrame {
    String pin_number;
    public MIniStatement(String pin_number){
        this.pin_number = pin_number;
        setLayout(null);
        setTitle("Mini-Statement");
        setLocation(20,20);
        setSize(400,600);
        getContentPane().setBackground(Color.white);
        
        JLabel text = new JLabel();
        add(text);
        JLabel list = new JLabel("MRL BANK");
        list.setBounds(150,20,100,20);
        add(list);
        
        JLabel card = new JLabel();
        card.setFont(new Font("System",Font.BOLD,14));
        card.setBounds(20,80,300,20);
        add(card);
        
        JLabel balance = new JLabel();
        balance.setFont(new Font("System",Font.BOLD,14));
        balance.setBounds(20,350,300,250);
        add(balance);
        
        try{
             
           
            SQL_Connection c = new SQL_Connection();
            ResultSet x = c.s.executeQuery("select * from login where Pin_Number = '"+pin_number+"'");
            while(x.next()){
                card.setText("Card number:  "+x.getString("Card_Number").substring(0,4) + " - XXXX - XXXX - " + x.getString("Card_Number").substring(12));          
            }
            
        }
        catch(Exception p){
            System.out.println(p);
        }
        try{
             int sum = 0;
            SQL_Connection c = new SQL_Connection();         
            ResultSet x = c.s.executeQuery("select * from transactions where Pin = '"+pin_number+"'");
            while(x.next()){
                text.setText(text.getText()+ "<html>" + x.getString("Date") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ x.getString("Type") +"&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;"+ x.getString("Amount") + "<br><br><html>");
                if(x.getString("Type").equals("Deposit")){
                        sum += Integer.parseInt(x.getString("Amount"));
                    }
                    else{
                        sum -= Integer.parseInt(x.getString("Amount"));
                    }
            }
             balance.setText("Your Current Account Balance is " + sum);
            
        }
        catch(Exception p){
            System.out.println(p);
        }
        text.setBounds(20,140,400,250);
        
      
        
        setVisible(true);
    }
    public static void main(String[] args) {
        new MIniStatement("");
    }
}
