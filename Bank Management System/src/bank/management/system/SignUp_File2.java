package bank.management.system;

import javax.swing.*;
import java.awt.*;
import java.util.*;
import com.toedter.calendar.JDateChooser;
import java.awt.event.*;

public class SignUp_File2 extends JFrame implements ActionListener{
     
    
    JTextField  income_details2,n_id_input, voter_id_input, post_card_input; 
    JRadioButton y, n;
    JButton next;
    JComboBox c2, income_info2, educational_info2, qualificationnal_info2, occupational_info2;
    String form;
   public SignUp_File2(String form){
       this.form = form;
       setTitle("New Account Application Form. 2");
       setLayout(null);
      
       ImageIcon x = new ImageIcon(ClassLoader.getSystemResource("icons/sign_in_page2.jpg"));
        Image x2 = x.getImage().getScaledInstance(940,900 ,Image.SCALE_DEFAULT);
        ImageIcon y2 = new ImageIcon(x2);
        JLabel image = new JLabel(y2);
        image.setBounds(0,0,900,900);
        add(image);
        
        setSize(900,900);     
        setLocation(200,130);
       
    
       
       JLabel additional_details = new JLabel("Additional Details");
       additional_details.setFont(new Font("Osward",Font.BOLD,22));
       additional_details.setBounds(320,120,400,30);
       additional_details.setForeground(Color.black);
       image.add(additional_details);
       
       
       JLabel category_name = new JLabel("Category: ");
       category_name.setFont(new Font("Osward",Font.BOLD,20));
       category_name.setBounds(180,190,200,30);
       category_name.setForeground(Color.black);
       image.add(category_name);
       
       String c[] = {"General","ST","SC","OBC","Other"};
       c2 = new JComboBox(c);     
       c2.setBounds(350,190,400,30);
       c2.setForeground(Color.black);
       image.add(c2);
       
       
       JLabel income_details = new JLabel("Income: ");
       income_details.setFont(new Font("Osward",Font.BOLD,20));
       income_details.setBounds(180,240,200,30);
       income_details.setForeground(Color.black);
       image.add(income_details);
       
      String income_info[] = {"No income","<100000","<200000","<500000",">500000"};
       income_info2 = new JComboBox(income_info);
       income_info2.setBounds(350,240,400,30);
       income_info2.setForeground(Color.black);
       image.add(income_info2);
       
       JLabel educational_details = new JLabel("Education: ");
       educational_details.setFont(new Font("Osward",Font.BOLD,20));
       educational_details.setBounds(180,290,200,30);
       educational_details.setForeground(Color.black);
       image.add(educational_details);
       
       String educational_info[] = {"PEC","JSC","SSC","HSC","Graduate"};
       educational_info2 = new JComboBox(educational_info);
       educational_info2.setBounds(350,290,100,30);
       educational_info2.setForeground(Color.black);
       image.add(educational_info2);
       
       
       JLabel qualificational_details = new JLabel("Qualification: ");
       qualificational_details.setFont(new Font("Osward",Font.BOLD,20));
       qualificational_details.setBounds(180,340,200,30);
       qualificational_details.setForeground(Color.black);
       image.add(qualificational_details);
       
       String qualificationnal_info[] = {"Non-Graduate","Graduate","Post-Graduate","PhD","Others"};
       qualificationnal_info2 = new JComboBox(qualificationnal_info);
       qualificationnal_info2.setBounds(350,340,150,30);
       qualificationnal_info2.setForeground(Color.black);
       image.add(qualificationnal_info2);
       
       
       
       JLabel occupational_details = new JLabel("Occupation: ");
       occupational_details.setFont(new Font("Osward",Font.BOLD,20));
       occupational_details.setBounds(180,390,200,30);
       occupational_details.setForeground(Color.black);
       image.add(occupational_details);
       
       String occupational_info[] = {"Student","Business","Other"};
       occupational_info2 = new JComboBox(occupational_info);
       occupational_info2.setBounds(350,390,150,30);
       occupational_info2.setForeground(Color.black);
       image.add(occupational_info2);
       
      
       
       JLabel n_id = new JLabel("National Id: ");
       n_id.setFont(new Font("Osward",Font.BOLD,20));
       n_id.setBounds(180,440,200,30);
       n_id.setForeground(Color.black);
       image.add(n_id);
       
       n_id_input = new JTextField();
       n_id_input.setFont(new Font("Osward", Font.BOLD, 14));
       n_id_input.setBounds(350,440,400,30);
       n_id_input.setForeground(Color.black);
       image.add(n_id_input);
       
       JLabel v_id = new JLabel("Voter_id: ");
       v_id.setFont(new Font("Osward",Font.BOLD,20));
       v_id.setBounds(180,490,200,30);
       v_id.setForeground(Color.black);
       image.add(v_id);
       
       voter_id_input = new JTextField();
       voter_id_input.setFont(new Font("Osward", Font.BOLD, 14));
       voter_id_input.setBounds(350,490,400,30);
       voter_id_input.setForeground(Color.black);
       image.add(voter_id_input);
       
       JLabel post_card = new JLabel("Post Card: ");
       post_card.setFont(new Font("Osward",Font.BOLD,20));
       post_card.setBounds(180,540,200,30);
       post_card.setForeground(Color.black);
       image.add(post_card);
       
       post_card_input = new JTextField();
       post_card_input.setFont(new Font("Osward", Font.BOLD, 14));
       post_card_input.setBounds(350,540,400,30);
       post_card_input.setForeground(Color.black);
       image.add(post_card_input);
       
       JLabel exiting_account = new JLabel("Existing Account: ");
       exiting_account.setFont(new Font("Osward",Font.BOLD,20));
       exiting_account.setBounds(180,590,200,30);
       exiting_account.setForeground(Color.black);
       image.add(exiting_account);
       
        y = new JRadioButton("Yes");
       y.setBounds(380,590,100,30);
   
      
       image.add(y);
       
       n = new JRadioButton("No");
       n.setBounds(530,590,100,30);
      
       image.add(n);
       
       ButtonGroup martial_group = new ButtonGroup();
       martial_group.add(y);
       martial_group.add(n);
       
       
       
       next = new JButton("Next");

       next.setFont(new Font("Osward",Font.BOLD,14));
       next.setBounds(620,660,80,30);
       next.addActionListener(this);
       image.add(next);
       
        setVisible(true);
   }
   public void actionPerformed(ActionEvent s){
       String category_name = (String) c2.getSelectedItem() ;
       String income_info3 = (String) income_info2.getSelectedItem();
       String educational_info3 = (String) educational_info2.getSelectedItem();
       String qualificationnal_info3 = (String) qualificationnal_info2.getSelectedItem();
       String occupational_info3 = (String) occupational_info2.getSelectedItem();
       String n_id2 = n_id_input.getText();
       String voter_id2 = voter_id_input.getText();
       String post_card2 = post_card_input.getText();
      String e = null;
      if(y.isSelected()){
          e = "Yes";
      }
      else if(n.isSelected()){
          e = "No";
      }
      
      try{
          if(category_name.equals("")){
              JOptionPane.showMessageDialog(null,"Category is not given");
          }
          else if(income_info3.equals("")){
              JOptionPane.showMessageDialog(null,"Income Information is not given");
          }
          else if(educational_info3.equals("")){
              JOptionPane.showMessageDialog(null,"Educational Information is not given");
          }
          else if(qualificationnal_info3.equals("")){
              JOptionPane.showMessageDialog(null,"Qualificational Information is not Given");
          }
          else if(occupational_info3.equals("")){
              JOptionPane.showMessageDialog(null,"Occupational Information is not given");
          }
          else if(n_id2.equals("")){
              JOptionPane.showMessageDialog(null,"National Id is not given");
          }
          else if(voter_id2.equals("")){
              JOptionPane.showMessageDialog(null,"Voter Id is not given");
          }
          else if(post_card2.equals("")){
              JOptionPane.showMessageDialog(null,"Post Card Information is not given");
          }
          else if(e.equals("")){
              JOptionPane.showMessageDialog(null,"Existing Account Information is not given");
          }
          else{
              SQL_Connection c = new SQL_Connection();
              String q = "insert into signup2 values('"+form+"', '"+category_name+"', '"+income_info3+"', '"+educational_info3+"', '"+qualificationnal_info3+"', '"+occupational_info3+"', '"+n_id2+"', '"+voter_id2+"', '"+post_card2+"', '"+e+"')";
              c.s.executeUpdate(q);
              setVisible(false);
              new SignUp_File3(form).setVisible(true);
          }
      }
      catch(Exception x){
          System.out.println(x);
      }
    
   }
    public static void main(String[] args) {
        new SignUp_File2("");
    }
}

