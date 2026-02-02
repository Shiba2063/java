<html>
    <body>
        <%
            String name=request.getParameter("username");
            String pass=request.getParameter("password");
            if(name.equals("admin")&&pass.equals("1234"))
            {
            %>
            <h2>Welcome <%= name %>! Login Successful</h2>
            <%
    }
    else
    {
        response.sendRedirect("register.html");
    }
%>
    </body>
</html>