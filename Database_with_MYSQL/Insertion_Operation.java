package database.with.mysql;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Insertion_Operation
{
    public static void main(String args[]){
        InsertData();
    }
    public static Connection getconnection()
    {
        try
        {
         String driver="com.mysql.cj.jdbc.Driver";
         String databaseUrl="jdbc:mysql://localhost:3306/Pokhara_University";
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
        Statement statement=getconnection().createStatement();
        String query =
    "INSERT INTO PU_Student (ID, Name, Faculty, Phone) VALUES " +
    "(1, 'Shiba Bhatta', 'BEIT', '9745671465'), " +
    "(2, 'Swikrity Khadka', 'Computer', '9856748392'), " +
    "(3, 'Sanjib Rimal', 'BCA', '9867452312'), " +
    "(4, 'Nita Pokharel', 'Software', '9867456732')";
        int result=statement.executeUpdate(query);
        System.out.println(result+"row(s) inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    }


