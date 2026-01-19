/*You are hired by a reputed software company which is going to design an application for “Movie Rental 
System”. Your responsibility is to design a schema named MRS and create a table named Movie(id, 
Tille, Genre, Language, Length). Write a program to design a GUI form to take input for this table and 
insert the data into table after clicking the OK button. */

package database.with.mysql;
import java.sql.Connection;
import java.awt.*;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.*;
public class Movie_Rental_system implements ActionListener
{
    static JFrame f1;
    static JButton b1;
    static JLabel l1,l2,l3,l4,l5;
    static JTextField t1,t2,t3,t4,t5;
    Movie_Rental_system()
    {
       f1=new JFrame("Movie Rental System");
       f1.setSize(400,400);
       f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       f1.setLayout(new GridLayout(6,2));
       b1=new JButton("OK");
       l1=new JLabel("ID");
       l2=new JLabel("Title");
       l3=new JLabel("Genre");
       l4=new JLabel("Language");
       l5=new JLabel("Length");
       t1=new JTextField();
       t2=new JTextField();
       t3=new JTextField();
       t4=new JTextField();
       t5=new JTextField();
       f1.add(l1);
       f1.add(t1);
       f1.add(l2);
       f1.add(t2);
       f1.add(l3);
       f1.add(t3);
       f1.add(l4);
       f1.add(t4);
       f1.add(l5);
       f1.add(t5);
       f1.add(b1);
       f1.setVisible(true);
       b1.addActionListener(this);
       
    }
    public static void main(String args[])
    {
        new Movie_Rental_system();
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
         String databaseUrl="jdbc:mysql://localhost:3306/MRS";
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

            String sql = "INSERT INTO Movie (ID, Title, Genre, language, Length) VALUES (?, ?, ?, ?, ?)";

            PreparedStatement pst = conn.prepareStatement(sql);
            //pst.setInt(1, Integer.parseInt(t1.getText()));
            pst.setString(1,t1.getText());
            pst.setString(2, t2.getText());
            pst.setString(3, t3.getText());
            pst.setString(4, t4.getText());
            pst.setString(5, t5.getText());

            int result = pst.executeUpdate();
            JOptionPane.showMessageDialog(f1, result + " row inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    
}


