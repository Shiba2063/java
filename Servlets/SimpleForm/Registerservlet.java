import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class Registerservlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("Employee");
        String phone = request.getParameter("phone");

        out.println("<html><body>");
        out.println("<h2>Welcome to RegisterServlet</h2>");
        out.println("<h2>Name: " + name + "</h2>");
        out.println("<h2>Phone: " + phone + "</h2>");
        out.println("</body></html>");
    }
}