import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class ColourGetServlet extends HttpServlet
{
    public void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String color = request.getParameter("color");
        out.println("<h2>The selected color is </h2>");
        out.println(color);
        out.close();
    }
            
}