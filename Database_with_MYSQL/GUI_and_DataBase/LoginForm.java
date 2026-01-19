/*Write a java program to create login form with user id, password, ok button and cancel button. 
Handle key events such that pressing ‘I’ performs login and pressing ‘C’ clears text boxes and 
puts focus on user id, text box. Assume user table having fields Uid and Password in the 
database named account. */

package database.with.mysql;
import java.awt.*;
import javax.swing.*;
import java.sql.*;
import java.awt.event.*;
public class LoginForm extends JFrame implements KeyListener,ActionListener
{
    JFrame f1;
    JLabel l1,l2,l3;
    JTextField t1,t2;
    JButton b1,b2;
    LoginForm()
    {
        f1=new JFrame("Login Form");
        l1=new JLabel("User ID");
        l2=new JLabel("Password");
        l3=new JLabel();
        t1=new JTextField();
        t2=new JTextField();
        b1=new JButton("OK");
        b2=new JButton("Cancel");
        f1.setSize(400,400);
        f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f1.setLayout(new GridLayout(4,2));
        f1.add(l1);
        f1.add(t1);
        f1.add(l2);
        f1.add(t2);
        f1.add(b1);
        f1.add(b2);
        f1.add(l3);
        f1.setVisible(true);
        b1.addActionListener(this);
        b2.addActionListener(this);
        t1.addKeyListener(this);
        t2.addKeyListener(this);
  
    }
    public static void main(String args[])
    {
        new LoginForm();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource() ==b1)
        {
            Login();
            l3.setText("Login Succesfully");
        }
        else if(e.getSource()==b2)
        {
            t1.setText("");
            t2.setText("");
            t1.requestFocus();
            l3.setText("Invalid User Id or Password");
        }
        else{
        }
    }
    public void keyPressed(KeyEvent e)
    {
        if(e.getKeyChar()=='I')
        {
         Login(); 
         l3.setText("Login Succesfully");
        }
        else if(e.getKeyChar()=='C')
        {
            t1.setText("");
            t2.setText("");  
            t1.requestFocus();
            l3.setText("Clear the Data");
        }
    }
   public void keyReleased(KeyEvent e)
   {
       
   }
   public void keyTyped(KeyEvent e)
   {
       
   }
    
     public static Connection getconnection()
    {
        try
        {
         String driver="com.mysql.cj.jdbc.Driver";
         String databaseUrl="jdbc:mysql://localhost:3306/account";
         String username="root";
         String password="";
         Class.forName(driver);
         Connection conn = DriverManager.getConnection(databaseUrl,username,password);
         System.out.println("Database Connected");
         return conn;
        }
        catch(Exception e)
        {
            System.out.println("Some Error :"+e);
        }
        return null;
    }
     public void Login()
     {
             try
        {
            Connection conn =getconnection();
            String sql="INSERT INTO user VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1,t1.getText());
            ps.setString(2,t2.getText());
            ps.executeUpdate();
        }
       
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }  
     }
}

