/* Consider db_college and tbl_student as database name and table respectively where a tbl_student 
has columns name, faculty and batch. Write console application with CREATE, READ, UPDATE and 
DELETE queries only using prepared statement.*/

package database.with.mysql;
import java.sql.*;
import java.util.Scanner;
public class db_college {
    public static void main(String args[])
    {
        Operation();
    }
    public static Connection getconnection()
    {
        try{
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/db_College";
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
    public static void Operation()
    {
       Scanner sc=new Scanner(System.in);
       System.out.println("1.For CREATE");
       System.out.println("2.For READ");
       System.out.println("3.For UPDATE");
       System.out.println("4.For DELETE");
       int choice = sc.nextInt();
       switch(choice)
       {
           case 1:
               try{
              Connection conn = getconnection();
              String sql="INSERT INTO tbl_student VALUES (?,?,?)";
               PreparedStatement ps = conn.prepareStatement(sql);
               ps.setString(1, "Shiba Bhatta");
               ps.setString(2,"BEIT");
               ps.setString(3, "2081");
               ps.executeUpdate();
               ps.setString(1, "Swikrity Khadka");
               ps.setString(2,"BE COmputer");
               ps.setString(3, "2082");
               ps.executeUpdate();
               ps.setString(1, "Asmita Ghimire");
               ps.setString(2,"BE Software");
               ps.setString(3, "2081");
               ps.executeUpdate();
               ps.close();
               System.out.println("Data Inserted Succesfully");
               }
               catch(Exception e)
               {
                   System.out.println("Error:"+e);
               }
               break;
           case 2:
               try{
                   Connection conn=getconnection();
                   String sql ="SELECT * FROM tbl_student";
                   PreparedStatement ps=conn.prepareStatement(sql);
                   ResultSet result=ps.executeQuery(sql);
                   while(result.next())
                   {
                       System.out.println(result.getString("Name"));
                       System.out.println(result.getString("Faculty"));
                       System.out.println(result.getString("Branch"));
                   }
                  
               }
               catch(Exception e)
               {
                   System.out.println("Error:"+e);
               }
               break;
           case 3:
               try{
               Connection conn=getconnection();
               String sql ="UPDATE tbl_student SET Faculty=? WHERE Name=?";
               PreparedStatement ps =conn.prepareStatement(sql);
               ps.setString(1,"BEIT");
               ps.setString(2,"Swikrity Khadka");
               ps.executeUpdate();
               System.out.println("Data Updated Successfully");
               }
               catch(Exception e){
                   System.out.println("Error:"+e);
               }
               break;
           case 4:
               try{
                   Connection conn =getconnection();
                   String sql="DELETE FROM tbl_student WHERE Name=?";
                   PreparedStatement ps=conn.prepareStatement(sql);
                   ps.setString(1,"Asmita Ghimire");
                   ps.executeUpdate();
                   System.out.println("Data Deleted Successfully");
               }
               catch(Exception e)
               {
                   System.out.println("Error:"+e);
               }
               break;
           default:
               System.out.println("Wrong Choice!!!");
          
       }
       
    }
    }
