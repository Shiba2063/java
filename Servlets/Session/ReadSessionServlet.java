import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class ReadSessionServlet extends HttpServlet{
    public void doGet(HttpServletRequest request,HttpServletResponse response)throws IOException,ServletException{
        response.setContentType("text/html");
        PrintWriter out=response.getWriter();
        HttpSession hs=request.getSession(false);
        String name=(String)hs.getAttribute("name");
        out.println("How are you"+name);
        out.close();
        
    }
}
