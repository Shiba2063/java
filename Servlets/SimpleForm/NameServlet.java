import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.WebServlet;

@WebServlet("/NameServlet")
public class NameServlet extends HttpServlet
{

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String fname = request.getParameter("fname");
        String lname = request.getParameter("lname");

        out.println("<html><body>");
        out.println("<h2>Welcome User</h2>");
        out.println("<h3>First Name: " + fname + "</h3>");
        out.println("<h3>Last Name: " + lname + "</h3>");
        out.println("</body></html>");
    }
}