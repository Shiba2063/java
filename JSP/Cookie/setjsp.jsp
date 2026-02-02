<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<body>

<%
     response.setContentType("text/html");
    String Name = request.getParameter("unname");
%>

<h2>Welcome <%= Name %></h2>

<form action="ReadJSP.jsp" method="post">
    <input type="submit" value="go">
</form>
<%
    Cookie ck = new Cookie("name", Name);
    response.addCookie(ck);%>

</body>
</html>
