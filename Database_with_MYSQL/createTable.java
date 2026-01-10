/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package database.with.mysql;

/**
 *
 * @author Lenovo
 */
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class createTable
{
    public static void main(String args[]){
        creteTable();
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
    public static void creteTable()
    {
        try
        {
        Statement statement=getconnection().createStatement();
        String query =
    "CREATE TABLE PU_Student (" +
    "Id INT, " +
    "Name VARCHAR(20), " +
    "Faculty VARCHAR(20), " +
    "Phone VARCHAR(20)" +
    ")";

        int result=statement.executeUpdate(query);
        System.out.println("Table Created");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    }

