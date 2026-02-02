<html>
    <body>
        <%
            String full=request.getParameter("firstName");
            String last=request.getParameter("lastName");
            %>
            <center><h2>Hello,<%=full + last%> </h2></center>
    </body>
</html>