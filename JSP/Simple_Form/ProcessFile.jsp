<html>
    <body>
        <%
            String Name=request.getParameter("employee");
            String Phone=request.getParameter("phone");
        %>
    <center>
        <h2>Hello,<%=Name+" Your phone number is : "+Phone%></h2>
    </center>
    </body>
</html>