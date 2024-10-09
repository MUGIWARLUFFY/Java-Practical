/*
 * 
 * page 1 = choice
 * page 2 = red
 * page 3 = yellow
 * page 4 = green
 */

package mypack;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public class page1 extends HttpServlet
{
    @Override 
    public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException, ServletException
    {
        response.setContentType("text/html");
        PrintWriter out = response.getWriter();
        String name = request.getParameter("txtName");
        String col = request.getParameter("txtCol");
        HttpSession hs = request.getSession();
        Cookie ck1 = new Cookie("uname",name);
        Cookie ck2 = new Cookie("color",col);
        Cookie ck3 = new Cookie("Visit","1");
        response.addCookie(ck1);
        response.addCookie(ck2);
        response.addCookie(ck3);
        if(!(hs.isNew()))
        {
            
            out.println("<body bgcolor="+col +">");
            out.println("Welcome for the first time");
            out.println("Name- "+ name);
            
        }
        
        else
        {
            out.println("<body bgcolor="+col+" >");
            try
            {
                if(hs.getAttribute("Visit")==null)
                {
                    int count = 1;
                    count++;
                    out.println("<h1> Visit Number: "+ count + "</h1>");
                    hs.setAttribute("Visit",""+count);
                }
                else
                {
                    int count = Integer.parseInt((String)hs.getAttribute("Visit"));
                    count++;
                    out.println("<h1> Visit Number: "+ count + "</h1>");
                    hs.setAttribute("Visit",""+count);
                }
            }
            catch(Exception e)
            {
                out.println(e);
            }
        }
        
        out.print("<h1> <a href=page1> Page 1</a><br /> ");
        out.print("<a href=page2 > Page 2 </a><br />  ");
        out.print("<a href=page3 > Page 3 </a><br />  ");
        out.print("<a href=page4 > Page 4 </a> <br /> </h1>");
        out.close();
    }
}