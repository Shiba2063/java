<html>
<body>

<%
    int result;
    String value1 = request.getParameter("first");
    int first = Integer.parseInt(value1);

    String value2 = request.getParameter("second");
    int second = Integer.parseInt(value2);

    String value3 = request.getParameter("third");
    int third = Integer.parseInt(value3);

    if (first > second && first > third) {
        result = first;
    } else if (second > third) {
        result = second;
    } else {
        result = third;
    }
%>

<h2>Greatest Number is <%= result %></h2>

</body>
</html>
