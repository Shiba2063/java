<html>
    <body>
        <%
String value = request.getParameter("Number");
int num = Integer.parseInt(value);
%>
 <% 
     int fact=1;
     for(int i =num;i>=1;i--){
         fact=fact*i;
    }%>
    <center>
        <table>
            <tr>
                <td>
                    <b>Factorial of <%=num%> is <%=fact%></b>
                </td>
            </tr>
        </table>

</center>
    </body>
</html>