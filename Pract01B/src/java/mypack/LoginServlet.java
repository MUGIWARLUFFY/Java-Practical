package mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;


public class LoginServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String Username = request.getParameter("txtName");
        String Password = request.getParameter("txtPass");
        if(Username.equals("admin") && Password.equals("tyit123"))
        {
            out.println("<body bgcolor=green><h1>Hello "+ Username+ "</h1></body>");
        }
        else
        {
            out.println("<body bgcolor=red><h1> Login Failed</h1></body>");
        }
        out.close();        
    }
}
