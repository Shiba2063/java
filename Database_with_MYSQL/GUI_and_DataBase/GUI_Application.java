/* Write a java program to design an GUI application that reads teacher information like as tchID, 
tchName, tchAddress, tchPhone and store into a database called “citizen” when user clicks on a 
button(login). */

package database.with.mysql;
import java.sql.Connection;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class GUI_Application  implements ActionListener
{
    static JFrame f1;
    static JButton b1;
    static JLabel l1,l2,l3,l4;
    static JTextField t1,t2,t3,t4;
    GUI_Application()
    {
       f1=new JFrame("Teachers Information");
       f1.setSize(400,400);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new GridLayout(5,2));
       b1=new JButton("Login");
       l1=new JLabel("Teacher ID");
       l2=new JLabel("Teacher Name");
       l3=new JLabel("Teacher Address");
       l4=new JLabel("Teacher Phone");
       t1=new JTextField();
       t2=new JTextField();
       t3=new JTextField();
       t4=new JTextField();
       f1.add(l1);
       f1.add(t1);
       f1.add(l2);
       f1.add(t2);
       f1.add(l3);
       f1.add(t3);
       f1.add(l4);
       f1.add(t4);
       f1.add(b1);
       f1.setVisible(true);
       b1.addActionListener(this);
       
    }
    public static void main(String args[])
    {
        new GUI_Application();
    }
    public void actionPerformed(ActionEvent e)
    {
        if(e.getSource()==b1)
        {
            InsertData();
        }
    }

        public static Connection getconnection()
    {
        try
        {
         String driver="com.mysql.cj.jdbc.Driver";
         String databaseUrl="jdbc:mysql://localhost:3306/citizen";
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
    public static void InsertData()
    {
        try
        {
         Connection conn = getconnection();

            String sql = "INSERT INTO teacher_information (tchID, tchName, tchaddress, tchPhone) VALUES (?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setInt(1, Integer.parseInt(t1.getText()));
            pst.setString(2, t2.getText());
            pst.setString(3, t3.getText());
            pst.setString(4, t4.getText());

            int result = pst.executeUpdate();
            JOptionPane.showMessageDialog(f1, result + " row inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    
}


