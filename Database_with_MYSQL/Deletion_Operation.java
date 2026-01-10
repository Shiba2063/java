package database.with.mysql;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class Deletion_Operation
{
    public static void main(String args[]){
        DeleteData();
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
    public static void DeleteData()
    {
        try
        {
        Statement statement=getconnection().createStatement();
        String query = "DELETE FROM PU_Student WHERE Id=1";
        int result=statement.executeUpdate(query);
        System.out.println(result+"row(s) deleted");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    }
