import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class setSessionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        String name=request.getParameter("unname");
        out.println("WELOME " +name);
        HttpSession hs=request.getSession();
        hs.setAttribute("name",name);
        out.println("<a href='ReadSessionServlet'> Visit Here</a>");
        out.close();;
    }
    
}
