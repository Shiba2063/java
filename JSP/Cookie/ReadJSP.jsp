<%@ page import="jakarta.servlet.http.Cookie" %>
<html>
<body>

<%
    response.setContentType("text/html");
    Cookie[] cook = request.getCookies();
%>

<% if (cook != null) { %>
    <h1>Hello, How are you <%= cook[1].getValue() %></h1>
<% } %>
<%--  if(cook != null) {
        for (Cookie c : cook) {
            if (c.getName().equals("name")) {
                username = c.getValue();
            }
        }
    }
<h1>Hello, How are you <%= username %></h1>
--%>

</body>
</html>
