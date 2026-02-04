import java.io.*;
import jakarta.servlet.*;
import jakarta.servlet.http.*;

@WebServlet("/ReadServlet")

public class ReadServlet extends HttpServlet {
    public void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {

        response.setContentType("text/html");
        PrintWriter pw = response.getWriter();

        Cookie[] cook = request.getCookies();

        if (cook != null) {
            pw.println("Hello, How are you " + cook[0].getValue());
            pw.close();
        }
    }
}
