/*Assume a table MOVIE(id, title, genre). Now, using JDBC perform queries: 
a. Add any three records to the MOVIE table. 
b. Using a prepared statement, update the genre to “Comedy” having the title “Jatra”.
 */

package database.with.mysql;
import java.sql.*;
import java.util.Scanner;
public class Movie_Details {
    public static void main(String args[])
    {
        Insert_AND_Update();
    }
    public static Connection getconnection()
    {
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/mrs";
            String username="root";
            String password="";
            Class.forName(driver);
            Connection conn=DriverManager.getConnection(databaseUrl,username,password);
            System.out.println("Database connected");
            return conn;
        }
        catch(Exception e)
        {
            System.out.println("Some error:"+e);
        }
        return null;
    }
    public static void Insert_AND_Update()
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("1.For INSERT DATA");
        System.out.println("2.For UPDATE DATA");
        int choice=sc.nextInt();
        switch(choice)
        {
        case 1:
        try{
            Statement statement=getconnection().createStatement();
            String query="INSERT INTO Movie(ID,Title,Genre,Language,Length)VALUES"+"(1,'Titanic','LoveStory','English','200Mins'), " + " (2,'Chakka Panja','Comedy','Nepali','175Mins'), " + " (3,'Jatra','Love Story','Nepali','300Mins') ";
            int result=statement.executeUpdate(query);
            System.out.println(result+"row(s) inserted");
            
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
        break;
        case 2:
            try{
                Connection conn = getconnection();
                String sql="UPDATE Movie SET Genre=? WHERE Title=?" ;
                PreparedStatement ps = conn.prepareStatement(sql);
                ps.setString(1,"Comedy");
                ps.setString(2, "Jatra");
                ps.executeUpdate();
                ps.close();
                conn.close();
                
            }
            catch(Exception e)
            {
                System.out.println("Error:"+e);
            }
            break;
            default:
            System.out.println("Wrong Choice");
        }
            
        
    }
        
}
