<html>
    <body>
        <%
            String roll=request.getParameter("roll_no");
            String name=request.getParameter("name");
            String email=request.getParameter("email");
            String address=request.getParameter("address");
        %>
    <center>
        <%@page import="java.sql.*"%>
        <%
            
            String driver="com.mysql.cj.jdbc.Driver";
            String databaseUrl="jdbc:mysql://localhost:3306/NCIT";
            String username="root";
            String password="";
            Class.forName(driver);
            Connection conn = DriverManager.getConnection(databaseUrl,username,password);
            System.out.println("Database Connected");
            String sql = "INSERT INTO NCIT_Student (Roll_no,Name, Email,Address) VALUES (?, ?, ?, ?)";
            PreparedStatement pst = conn.prepareStatement(sql);
            pst.setString(1, roll);
            pst.setString(2, name);
            pst.setString(3, email);
            pst.setString(4, address);
            int result = pst.executeUpdate();
            out.println("<h2>Teacher Name Updated Successfully!</h2>");
            %>
    </center>
    </body>
</html>