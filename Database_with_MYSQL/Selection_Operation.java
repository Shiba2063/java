
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
public class Selection_Operation
{
    public static void main(String args[]){
        getData();
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
    public static void getData()
    {
        try
        {
        Statement statement=getconnection().createStatement();
        ResultSet result=statement.executeQuery("SELECT*FROM PU_Student");
        while(result.next())
        {
            System.out.println(result.getString("ID"));
            System.out.println(result.getString("Name"));
            System.out.println(result.getString("Faculty"));
            System.out.println(result.getString("Phone"));
            
        }
        System.out.println("Data Selected");
        }
        catch(Exception e)
        {
            System.out.println("Error:"+e);
        }
    }
    }


    

