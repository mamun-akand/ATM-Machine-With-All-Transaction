package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUp_File extends JFrame implements ActionListener{
     
    long digits;
    JTextField name_input, father_name_input,email_input, address_input, city_input, state_input,pin_input;
    JDateChooser date_of_birth_input; 
    JRadioButton male, female, married, unmarried;
    JButton next;
    
   public SignUp_File(){
       setTitle("New Account Application Form");
       setLayout(null);
     
        
       ImageIcon x = new ImageIcon(ClassLoader.getSystemResource("icons/sign_in_page2.jpg"));
        Image x2 = x.getImage().getScaledInstance(940,900 ,Image.SCALE_DEFAULT);
        ImageIcon y = new ImageIcon(x2);
        JLabel image = new JLabel(y);
        image.setBounds(0,0,900,900);
        add(image);
        
        setSize(900,900);     
        setLocation(200,130);
       
      
       
       Random num = new Random();
       digits = (Math.abs(num.nextLong())%9000);
       
       JLabel form = new JLabel("Application Form No. " + digits);
       form.setFont(new Font("Osward",Font.BOLD,30));
       form.setBounds(300,140,600,40);
       form.setForeground(Color.black);
       image.add(form);
       
       
       
       JLabel names = new JLabel("Name: ");
       names.setFont(new Font("Osward",Font.BOLD,20));
       names.setBounds(180,200,100,30);
       names.setForeground(Color.black);
       image.add(names);
       
       name_input = new JTextField();
       name_input.setFont(new Font("Osward", Font.BOLD, 14));
       name_input.setBounds(350,200,400,30);
       name_input.setForeground(Color.black);
       image.add(name_input);
       
       JLabel fathers_name = new JLabel("Father's Name: ");
       fathers_name.setFont(new Font("Osward",Font.BOLD,20));
       fathers_name.setBounds(180,250,200,30);
       fathers_name.setForeground(Color.black);
       image.add(fathers_name);
       
       father_name_input = new JTextField();
       father_name_input.setFont(new Font("Osward", Font.BOLD, 14));
       father_name_input.setBounds(350,250,400,30);
       father_name_input.setForeground(Color.black);
       image.add(father_name_input);
       
       JLabel Date_of_birth = new JLabel("Date of Birth: ");
       Date_of_birth.setFont(new Font("Osward",Font.BOLD,20));
       Date_of_birth.setBounds(180,300,200,30);
       Date_of_birth.setForeground(Color.black);
       image.add(Date_of_birth);
       
       date_of_birth_input = new JDateChooser();
       date_of_birth_input.setBounds(350,300,400,30);
       image.add(date_of_birth_input);
       
       JLabel gender = new JLabel("Gender: ");
       gender.setFont(new Font("Osward",Font.BOLD,20));
       gender.setBounds(180,350,200,30);
       gender.setForeground(Color.black);
       image.add(gender);
       
       male = new JRadioButton("Male");
       male.setBounds(350,350,60,30);
     
       male.setForeground(Color.black);
       image.add(male);
       
       female = new JRadioButton("Female");
       female.setBounds(450,350,120,30);
      
       female.setForeground(Color.black);
       image.add(female);
       
       ButtonGroup gender_group = new ButtonGroup();
       gender_group.add(male);
       gender_group.add(female);
       
       JLabel email = new JLabel("Email Address: ");
       email.setFont(new Font("Osward",Font.BOLD,20));
       email.setBounds(180,400,200,30);
       email.setForeground(Color.black);
       image.add(email);
       
       email_input = new JTextField();
       email_input.setFont(new Font("Osward", Font.BOLD, 14));
       email_input.setBounds(350,400,400,30);
       email_input.setForeground(Color.black);
       image.add(email_input);
       
       JLabel marital_status = new JLabel("Marital Status: ");
       marital_status.setFont(new Font("Osward",Font.BOLD,20));
       marital_status.setBounds(180,450,200,30);
       marital_status.setForeground(Color.black);
       
       image.add(marital_status);
       
       married = new JRadioButton("Married");
       married.setBounds(350,450,100,30);
    
       married.setForeground(Color.black);
       image.add(married);
       
       unmarried = new JRadioButton("Unmarried");
       unmarried.setBounds(480,450,100,30);
    
       unmarried.setForeground(Color.black);
       image.add(unmarried);
       
       ButtonGroup martial_group = new ButtonGroup();
       martial_group.add(married);
       martial_group.add(unmarried);
       
       JLabel address = new JLabel("Home Address: ");
       address.setFont(new Font("Osward",Font.BOLD,20));
       address.setBounds(180,500,200,30);
       address.setForeground(Color.black);
       image.add(address);
       
       address_input = new JTextField();
       address_input.setFont(new Font("Osward", Font.BOLD, 14));
       address_input.setBounds(350,500,400,30);
       address_input.setForeground(Color.black);
       image.add(address_input);
       
       JLabel city = new JLabel("City: ");
       city.setFont(new Font("Osward",Font.BOLD,20));
       city.setBounds(180,550,200,30);
       city.setForeground(Color.black);
       image.add(city);
       
       city_input = new JTextField();
       city_input.setFont(new Font("Osward", Font.BOLD, 14));
       city_input.setBounds(350,550,400,30);
       city_input.setForeground(Color.black);
       image.add(city_input);
       
       JLabel state = new JLabel("State: ");
       state.setFont(new Font("Osward",Font.BOLD,20));
       state.setBounds(180,600,200,30);
       state.setForeground(Color.black);
       image.add(state);
       
       state_input = new JTextField();
       state_input.setFont(new Font("Osward", Font.BOLD, 14));
       state_input.setBounds(350,600,400,30);
       state_input.setForeground(Color.black);
       image.add(state_input);
       
       JLabel pincode = new JLabel("Country Pin Code: ");
       pincode.setFont(new Font("Osward",Font.BOLD,20));
       pincode.setBounds(150,650,200,30);
       pincode.setForeground(Color.black);
       image.add(pincode);
       
       pin_input = new JTextField();
       pin_input.setFont(new Font("Osward", Font.BOLD, 14));
       pin_input.setBounds(350,650,400,30);
       pin_input.setForeground(Color.black);
       image.add(pin_input);
       
       next = new JButton("Next");
       
       next.setForeground(Color.black);
       next.setFont(new Font("Osward",Font.BOLD,14));
       next.setBounds(670,700,80,30);
       next.addActionListener(this);
       image.add(next);
        setVisible(true);
   }
   public void actionPerformed(ActionEvent s){
       String form = "" + digits;
       String name = name_input.getText();
       String father_name = father_name_input.getText();
       String date_of_birth = ((JTextField)date_of_birth_input.getDateEditor().getUiComponent()).getText();
      String gender = null;
      if(male.isSelected())
      {
         gender = "Male";
      }
      else if(female.isSelected()){
          gender = "Female";
      }
      String email = email_input.getText();
      String marital = null;
      if(married.isSelected()){
          marital = "Married";
      }
      else if(unmarried.isSelected()){
          marital = "Unmarried";
      }
      String address = address_input.getText();
      String city = city_input.getText();
      String state = state_input.getText();
      String pincode = pin_input.getText();
      
      try{
          if(name.equals("")){
              JOptionPane.showMessageDialog(null,"Name is not given");
          }
          else if(father_name.equals("")){
              JOptionPane.showMessageDialog(null,"Father's Name is not given");
          }
          else if(date_of_birth.equals("")){
              JOptionPane.showMessageDialog(null,"Date Of Birth is not given");
          }
          else if(gender.equals("")){
              JOptionPane.showMessageDialog(null,"Gender Information is not Given");
          }
          else if(email.equals("")){
              JOptionPane.showMessageDialog(null,"Email is not given");
          }
          else if(marital.equals("")){
              JOptionPane.showMessageDialog(null,"Marital Status is not given");
          }
          else if(address.equals("")){
              JOptionPane.showMessageDialog(null,"Address is not given");
          }
          else if(city.equals("")){
              JOptionPane.showMessageDialog(null,"City Information is not given");
          }
          else if(state.equals("")){
              JOptionPane.showMessageDialog(null,"State Information is not given");
          }
          else if(pincode.equals("")){
              JOptionPane.showMessageDialog(null,"Country PinCode is not given");
          }
          else{
              SQL_Connection c = new SQL_Connection();
              String q = "insert into signup values('"+form+"', '"+name+"', '"+father_name+"', '"+date_of_birth+"', '"+gender+"', '"+email+"', '"+marital+"', '"+address+"', '"+city+"', '"+state+"', '"+pincode+"')";
              c.s.executeUpdate(q);
              setVisible(false);
              new SignUp_File2(form).setVisible(true);
          }
      }
      catch(Exception x){
          System.out.println(x);
      }
    
   }
    public static void main(String[] args) {
        new SignUp_File();
    }
}

