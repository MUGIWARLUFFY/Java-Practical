package mypack;

import java.io.*;
import javax.servlet.*;

public class CalciServlet extends GenericServlet {

    @Override
    public void service (ServletRequest req, ServletResponse res) throws ServletException, IOException 
    {
        res.setContentType("text/html");
        PrintWriter pw= res.getWriter();
        int inp1 = Integer.parseInt(req.getParameter("no1"));
        int inp2 = Integer.parseInt(req.getParameter("no2"));
        String op =  req.getParameter("opr");
        
        if(op.equals("+"))
        {
            pw.println("Addition of the two numbers "+ (inp1)+ " and "+ inp2 + " is " + (inp1+inp2));
        }
        if(op.equals("-"))
        {
            pw.println("Subtraction of the two numbers "+ (inp1)+ " and "+ inp2 + " is " + (inp1-inp2));
        }
        if(op.equals("*"))
        {
            pw.println("Multiplication of the two numbers "+ (inp1)+ " and "+ inp2 + " is " + (inp1*inp2));
        }
        if(op.equals("/"))
        {
            pw.println("Division of the two numbers "+ (inp1)+ " and "+ inp2 + " is " + (inp1/inp2));
        }
    }
}