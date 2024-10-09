package mypack;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class RegServlet extends HttpServlet
{
    @Override
    public void doGet(HttpServletRequest request,HttpServletResponse response) throws IOException ,ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        try
        {
            Class.forName("org.apache.derby.jdbc.ClientDriver");
            Connection con = DriverManager.getConnection("jdbc:derby://localhost:1527/pract");
            out.println("<h1> Connection Successful </h1>");
            String Username = request.getParameter("txtName");
            String Password = request.getParameter("txtPass");
            String Email = request.getParameter("txtEmail");
            String Cn = request.getParameter("txtCn");
            String query1 = "insert into pract1_c values(?,?,?,?)";
            PreparedStatement psmt = con.prepareStatement(query1);
            psmt.setString(1,Username);
            psmt.setString(2,Password);
            psmt.setString(3,Email);
            psmt.setString(4,Cn);
            psmt.executeUpdate();
            out.println("<h1> Query executed Successful </h1>");
            con.close();
            out.println("<h1> Connection closed Successful </h1>");
            out.close();
        }
        catch(Exception e)
        {
            out.println("<h1> " + e.getMessage()+"</h1>");
        }
    }
}