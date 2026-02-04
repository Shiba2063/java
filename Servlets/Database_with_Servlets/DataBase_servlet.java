import java.io.*;
import java.sql.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/DataBase_servlet")
public class DataBase_servlet extends HttpServlet {

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String id = request.getParameter("TeacherID");
        String name = request.getParameter("TeacherName");

        try {

            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/NCIT";
            String username="root";
            String password="";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl,username,password);
            System.out.println("Database Connected");
            String query = "UPDATE NCIT_Teacher SET TeacherName=? WHERE TeacherID=?";
            PreparedStatement ps = conn.prepareStatement(query);
            ps.setString(1, name);
            ps.setString(2, id);
            int result = ps.executeUpdate();
            out.println("<h2>Teacher Name Updated Successfully!</h2>");
        } 
        catch (Exception e) {
            out.println("Error: " + e);
        }
    }
}

