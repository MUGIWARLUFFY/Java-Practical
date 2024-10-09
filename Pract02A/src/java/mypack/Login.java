package mypack;
import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class Login extends HttpServlet {
    @Override
    public void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        
        String n = request.getParameter("userName");
        String p = request.getParameter("userPass");
        
        if(p.equals("servlet")) {
            RequestDispatcher rd = request.getRequestDispatcher("WelcomeServlet");
            rd.forward(request, response);
        } else {
            out.println("Sorry, Username or Password Error");
            RequestDispatcher rd = request.getRequestDispatcher("index.html");
            rd.include(request, response);
        }
    }
}
