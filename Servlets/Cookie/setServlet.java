import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;
public class setServlet extends HttpServlet {

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter out = response.getWriter();

        String name = request.getParameter("unname");
        out.println("Welcome"+name);
        out.println("<html>");
        out.println("<body>");
        out.println("<h2>Welcome " + name + "</h2>");
        out.println("<form action='ReadServlet' method='post'>");
        out.println("<input type='submit' value='go'>");
        out.println("</form>");
        out.println("</body>");
        out.println("</html>");
        Cookie ck = new Cookie("name", name);
        response.addCookie(ck);
        out.close();
    }
}
