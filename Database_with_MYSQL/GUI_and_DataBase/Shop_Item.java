/* Write a program to insert three records into a table Item which is in the database shop and contains 
the columns ItemID, Name, UnitPrice, Units and Expiry Date.*/

package database.with.mysql;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class Shop_Item
{
    public static void main(String args[]){
        InsertData();
    }
    public static Connection getconnection()
    {
        try
        {
         String driver="com.mysql.cj.jdbc.Driver";
         String databaseUrl="jdbc:mysql://localhost:3306/shop";
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
        "INSERT INTO Item (ItemID, Name, UnitPrice, Units, ExpiryDate) VALUES " +
        "(1, 'Rice', 123, 5, '2025-03-02')," +
        "(2, 'Potato', 2334, 4, '4545-04-03')," +
        "(3, 'Centre Fruit', 34, 34, '5543-04-23')," +
        "(4, 'Kurkure', 34, 34, '5543-04-23')," +
        "(5, 'IceCream', 3, 5, '6784-05-03')";
        int result=statement.executeUpdate(query);
        System.out.println(result+"row(s) inserted");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    }
