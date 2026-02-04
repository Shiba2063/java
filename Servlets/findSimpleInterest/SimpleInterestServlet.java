import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

public class SimpleInterestServlet extends HttpServlet
{
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        double principal = Double.parseDouble(request.getParameter("principal"));
        double time = Double.parseDouble(request.getParameter("time"));
        double rate = Double.parseDouble(request.getParameter("rate"));

        double si = (principal * time * rate) / 100;
        
         out.println("<html><body>");
        out.println("<h2>Simple Interest Calculation</h2>");
        out.println("<p>Principal: " + principal + "</p>");
        out.println("<p>Time: " + time + "</p>");
        out.println("<p>Rate: " + rate + "</p>");
        out.println("<h3>Simple Interest = " + si + "</h3>");
        out.println("</body></html>");
    }
}