/*Write a program to extract the user information such as Reg_no, Name, Address, Phone_no from the 
database and display in the console.
 */

package database.with.mysql;
import java.sql.*;
public class Display_Data {
    public static void main(String args[])
    {
        Extract_Data();
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
       public static void Extract_Data()
{
    try
    {
        Connection conn = getconnection();
        String sql = "SELECT Reg_no, Name, Address, Phone_no FROM user_information";
        PreparedStatement pst = conn.prepareStatement(sql);
        ResultSet rs = pst.executeQuery();
        while(rs.next())
        {
                System.out.println("Reg No   : " + rs.getInt("Reg_no"));
                System.out.println("Name     : " + rs.getString("Name"));
                System.out.println("Address  : " + rs.getString("Address"));
                System.out.println("Phone No : " + rs.getString("Phone_no"));
        }
    }
    catch(Exception e)
    {
        System.out.println("Error: " + e);
    }
}
}

